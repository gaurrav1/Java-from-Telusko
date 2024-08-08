package org.Spring;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("com2")
@Primary
public class Desktop implements Computer{

    static {
        System.out.println("Desktop class loaded");
    }

    public Desktop() {
        System.out.println("Desktop object created");
    }

    @Override
    public void compile() {
        System.out.println("Desktop is compiling");
    }
}
