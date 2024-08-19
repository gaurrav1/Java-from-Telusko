package org.springdatajpa.repository;

import org.springdatajpa.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface StudentRepository extends JpaRepository<Student, Integer> {

    // DSL(Domain Specific Language) allows you to use custom created methods by field name without.
    // You don't need query because you are using same name of method as field name.
    List<Student> findByName(String name);

    // You need query because you are not following naming convention.
    @Query("select s from Student s where s.name = ?1")
    List<Student> findByNaam(String name);

    @Query("select s from Student s where s.marks = 100")
    List<Student> marksEqualsHundred();
}
