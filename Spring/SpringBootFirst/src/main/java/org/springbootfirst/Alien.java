package org.springbootfirst;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Alien {

    @Autowired // Give you object from IOC Container
    Laptop laptop;

    public void code() {
        laptop.compile();
        System.out.println("Code buddy code");
    }
    
}
