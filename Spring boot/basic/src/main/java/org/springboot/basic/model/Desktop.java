package org.springboot.basic.model;

import org.springframework.stereotype.Component;

@Component
public class Desktop implements Computer {

    static {
        System.out.println("<<< Desktop class loaded >>>");
    }

    public Desktop() {
        System.out.println("...Desktop OBJECT HAS BEEN CREATED...");
    }

    @Override
    public void compile() {
        System.out.println("Desktop is compiling...");
    }
}
