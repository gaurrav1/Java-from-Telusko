package org.springboot.basic.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Alien {

    static {
        System.out.println("<<< Alien object loaded >>>");
    }

    public Alien() {
        System.out.println("...Alien object created...");
    }

    @Value("22")
    private int age;
    private Computer com;

    public Computer getCom() {
        return com;
    }

    @Autowired
    @Qualifier("laptop")
    public void setCom(Computer com) {
        this.com = com;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void code() {
        com.compile();
    }
}
