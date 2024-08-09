package org.springboot.basic.repository;

import org.springboot.basic.model.Laptop;
import org.springframework.stereotype.Repository;

@Repository
public class LaptopRepository {
    public void save(Laptop laptop){
        System.out.println("Saved laptop in databse");
    }
}
