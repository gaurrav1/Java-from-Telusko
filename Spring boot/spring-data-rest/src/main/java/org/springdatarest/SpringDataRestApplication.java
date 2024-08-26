package org.springdatarest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringDataRestApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringDataRestApplication.class, args);

        // Spring data rest works without controller and service.
        // To access data, you can hit your model name in application url and fetch all data, update and delete.
        // GET: http://localhost:8080/jobPosts
        // PUT: http://localhost:8080/jobPosts/1
        // DELETE: http://localhost:8080/jobPosts/1

    }

}
