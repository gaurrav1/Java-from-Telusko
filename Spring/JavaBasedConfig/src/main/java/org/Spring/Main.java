package org.Spring;

import org.Spring.config.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

//        Desktop dt = context.getBean("desktop", Desktop.class);
//        dt.compile();
//
//        Desktop dt2 = context.getBean("desktop", Desktop.class);
//        dt2.compile();

        Alien alien = context.getBean(Alien.class);
        System.out.println(alien.getAge());
        alien.code();

        Alien alien2 = context.getBean(Alien.class);
        System.out.println(alien2.getAge());
        alien2.code();
    }
}