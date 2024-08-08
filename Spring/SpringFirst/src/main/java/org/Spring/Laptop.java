package org.Spring;

public class Laptop implements Computer {

//    static {
//        System.out.println("Laptop has been loaded");
//    }

    Laptop() {
        System.out.println("Laptop object has been created");
    }

    @Override
    public void compile() {
        System.out.println("Laptop is compiling...");
    }
}
