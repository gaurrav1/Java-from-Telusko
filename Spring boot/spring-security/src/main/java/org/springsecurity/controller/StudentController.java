package org.springsecurity.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.security.web.csrf.CsrfToken;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletRequest;
import org.springsecurity.model.Student;

@RestController
public class StudentController {

    List<Student> students=new ArrayList<>(List.of(
            new Student(1,"Navin","Java"),
            new Student(2,"Kiran","Blockchain")
    ));

    @GetMapping("giveCsrf")
    public CsrfToken getCsrfToken(HttpServletRequest request) {
        return (CsrfToken) request.getAttribute("_csrf");
    }

    @GetMapping("students")
    public List<Student> getStudents(){
        return students;
    }

    @PostMapping("student")
    public void addStudent(@RequestBody Student student) {
        students.add(student);
    }
}
