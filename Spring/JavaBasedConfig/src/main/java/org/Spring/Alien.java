package org.Spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class Alien {

    @Value("21")
    private int age;

//    @Autowired
//    @Qualifier("com2")
    private Computer com;

    static {
        System.out.println("Alien class loaded");
    }

    public Alien() {
        System.out.println("Alien object created");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Computer getCom() {
        return com;
    }

    @Autowired
    @Qualifier("laptop")
    public void setCom(Computer com) {
        this.com = com;
    }

    public void code() {
        System.out.println("Alien is coding");
        com.compile();
    }
}
