package org.springbootfirst;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringBootFirstApplication {

    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(SpringBootFirstApplication.class, args);


        Alien obj = applicationContext.getBean(Alien.class);
        obj.code();

//        Alien obj1 = applicationContext.getBean(Alien.class);
//        obj1.code();
        // Are both objects same or different because Spring is taking care of it?

    }

}
