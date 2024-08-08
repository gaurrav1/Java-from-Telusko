package org.Spring.config;

import org.Spring.Alien;
import org.Spring.Computer;
import org.Spring.Desktop;
import org.Spring.Laptop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("org.Spring")
public class AppConfig {
//    @Bean(name = {"com1", "desk1"})
//    @Scope(scopeName = "prototype")
/*    @Bean
    public Desktop desktop() {
        return new Desktop();
    }

    @Bean
    @Primary // In conflicts of 2 same type of bean, container will prefer this.
    public Laptop laptop() {
        return new Laptop();
    }
*/
//    @Bean
//    public Alien alien(@Autowired Computer com) /* Search in all beans for Computer type object, in our case it is desktop. */{
//        Alien alien = new Alien();
//        alien.setAge(22);
//        alien.setCom(com);
//        return alien;
//    }
/*
    @Bean
    public Alien alien(@Qualifier("desktop") Computer com) {
    // In case of multiple bean with same type, you can use qualifier to specify that which bean in current bean we have to refer
        Alien alien = new Alien();
        alien.setAge(22);
        alien.setCom(com);
        return alien;
    }
*/
}
