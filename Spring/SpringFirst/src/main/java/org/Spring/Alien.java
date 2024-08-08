package org.Spring;

import java.beans.ConstructorProperties;

public class Alien {

    private int age;
    private Computer com;

//    static {
//        System.out.println("Alien has been loaded");
//    }

    Alien() {
        System.out.println("Alien has been created");
    }

    @ConstructorProperties( {"age", "com"} )
    public Alien(int age, Computer com) {
        System.out.println("Parameterized constructor called");
        this.age = age;
        this.com = com;
    }

    public void code() {
        System.out.println("Coder is Coding__________________");
        com.compile();
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

    public void setCom(Computer com) {
        this.com = com;
    }
}
