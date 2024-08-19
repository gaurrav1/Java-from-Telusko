package org.springdatajpa;

import org.springdatajpa.model.Student;
import org.springdatajpa.repository.StudentRepository;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringDataJpaApplication {

    public static void main(String[] args) {


        ApplicationContext context = SpringApplication.run(SpringDataJpaApplication.class, args);

        Student student1 = context.getBean(Student.class);
        student1.setRollNo(105);
        student1.setName("RadheKrishn");
        student1.setMarks(100);

        Student student2 = context.getBean(Student.class);
        student2.setRollNo(106);
        student2.setName("GauravVasani");
        student2.setMarks(87);

        //  Create
        StudentRepository studentRepository = context.getBean(StudentRepository.class);
//        studentRepository.save(student1);
//        studentRepository.save(student2);


        // Read
//        System.out.println(studentRepository.findAll());

//        findById() returns Optional
//        System.out.println(studentRepository.findById(10)); //  If no record found It will return Optional.isEmpty
//        Optional<Student> s = studentRepository.findById(101);
//        System.out.println(s.orElse(new Student())); //  If no record found, It will create blank object and print on console.

        System.out.println(studentRepository.findByName("RadheKrishn"));
        System.out.println(studentRepository.marksEqualsHundred());


        // Update
        student2.setRollNo(106);
        student2.setName("Gaurav");
        student2.setMarks(87);
        studentRepository.save(student2);

        // Delete
        studentRepository.delete(student2);
    }

}
