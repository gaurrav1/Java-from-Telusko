package org.springboot.basic;

import org.springboot.basic.model.Alien;
import org.springboot.basic.model.Laptop;
import org.springboot.basic.service.LaptopService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class BasicApplication {

    // Different layers in Spring Boot:
    // 1. Controller: It receives request and send response.
    // 2. Service: It contains business logic.
    // 3. Repository: It contains database logic. And interacts with database.

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(BasicApplication.class, args);

        LaptopService service = context.getBean(LaptopService.class);
        Laptop laptop = context.getBean(Laptop.class);

        service.addLaptop(laptop);

    }

}
