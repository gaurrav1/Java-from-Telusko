package org.Spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("Spring.xml");

        Alien obj = (Alien) context.getBean("alien1");
        System.out.println(obj.getAge());
        obj.code();

        Alien obj2 = context.getBean("alien1", Alien.class);
        Desktop obj3 = context.getBean(Desktop.class);
        Computer com = context.getBean(Computer.class); // It will use primary="true"

//        Alien obj2 = (Alien) context.getBean("alien1");
//        System.out.println(obj2.age);
//        obj2.code();
    }
}