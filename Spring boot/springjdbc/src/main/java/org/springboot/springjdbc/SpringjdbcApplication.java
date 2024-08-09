package org.springboot.springjdbc;

import org.springboot.springjdbc.Service.StudentService;
import org.springboot.springjdbc.model.Student;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.List;

@SpringBootApplication
public class SpringjdbcApplication {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(SpringjdbcApplication.class, args);

        Student student = context.getBean(Student.class);
        student.setRollNo(101);
        student.setName("RK");
        student.setMarks(100);

        StudentService service = context.getBean(StudentService.class);
        service.addStudent(student);

        List<Student> students = service.getStudents();
        System.out.println(students);
    }

}
