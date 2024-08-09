package org.springboot.basic.service;

import org.springboot.basic.LaptopRepository;
import org.springboot.basic.model.Laptop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LaptopService {

    @Autowired
    private LaptopRepository laptopRepository;

    public void addLaptop(Laptop laptop) {
        System.out.println("Adding laptop...");
        laptopRepository.save(laptop);

    }
    public boolean isGood(Laptop laptop) {
        return true;
    }
}
