package org.HIbernateDemo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "HiStudent")
public class Student {

    public Student() {
        System.out.println("Zero parameter constructor which will later use by Hibernate");
    }

    @jakarta.persistence.Id
    @Column(name = "sid")
    private Integer Id;

    @Column(name = "sname")
    private String Name;

    @Column(name = "scity")
    private String city;


    public Integer getId() {
        return Id;
    }
    public void setId(Integer id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }
    public void setName(String name) {
        Name = name;
    }

    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Student{" +
                "Id=" + Id +
                ", Name='" + Name + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
