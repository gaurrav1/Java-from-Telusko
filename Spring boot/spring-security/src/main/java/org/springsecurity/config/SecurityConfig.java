package org.springsecurity.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.dao.DaoAuthenticationProvider;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configurers.AbstractHttpConfigurer;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
import org.springsecurity.services.MyUserDetailsService;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    // User details service is responsible to provide information about who is authenticated user.
//    @Bean
//    public UserDetailsService userDetailsService() {
//
//        UserDetails user = User.withDefaultPasswordEncoder().username("gaurav").password("12345").roles("USER").build();
//        UserDetails admin = User.withDefaultPasswordEncoder().username("admin").password("admin").roles("ADMIN").build();
//
//        return new InMemoryUserDetailsManager(user,admin);
//    }

    @Autowired
    private UserDetailsService userDetailsService;


    // DAO - DATA ACCESS OBJECT
    @Bean
    AuthenticationProvider authenticationProvider() {

        DaoAuthenticationProvider provider = new DaoAuthenticationProvider();

        provider.setUserDetailsService(userDetailsService);

        provider.setPasswordEncoder(new BCryptPasswordEncoder(12));
        return provider;
    }


    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity httpSecurity) throws Exception {

//        // With lambda expression
//
//        // Remove CSRF token
//        // httpSecurity.csrf(customizer -> customizer.disable());
//        httpSecurity.csrf(AbstractHttpConfigurer::disable);
//
//        // Enable authorization
//        httpSecurity.authorizeHttpRequests(request -> request.anyRequest().authenticated());
//
//        // Allows you to sign in with form for session
//        // httpSecurity.formLogin(Customizer.withDefaults());
//        httpSecurity.httpBasic(Customizer.withDefaults());
//
//        // Make session stateless
//        httpSecurity.sessionManagement(session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS));



        // Using builder pattern
        httpSecurity
                .csrf(AbstractHttpConfigurer::disable)
                .authorizeHttpRequests(request -> request.anyRequest().authenticated())
                .httpBasic(Customizer.withDefaults())
                .sessionManagement(session -> session.sessionCreationPolicy(SessionCreationPolicy.STATELESS));

        return httpSecurity.build();
    }

}
