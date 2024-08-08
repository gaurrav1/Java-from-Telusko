package org.Spring;

import org.springframework.stereotype.Component;

@Component
public class Laptop implements Computer{

    static {
        System.out.println("Laptop class loaded");
    }

    public Laptop() {
        System.out.println("Laptop object created");
    }

    @Override
    public void compile() {
        System.out.println("Laptop is compiling");
    }
}
