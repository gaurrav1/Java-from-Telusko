package org.HibernateDemo.app;

import org.HibernateDemo.model.Student;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class GetData {
    public static void main(String[] args) {
        SessionFactory sf = new Configuration()
                .configure()
                .addAnnotatedClass(Student.class)
                .buildSessionFactory();
        Session session = null;

        try {
            session = sf.openSession();

//            Student student = session.get(Student.class, 1); // Known as Eager loading method
            Student student = session.getReference(Student.class, 3); // Known as Lazy loading method, may lead to exception if record not exist

            if(student != null) {
                System.out.println("Student ID: " + student.getId());
//            System.in.read(); //Giving pause until you hit enter
                System.out.println("Student Name: " + student.getName());
                System.out.println("Student City: " + student.getCity());
            } else {
                System.out.println("Student not found");
            }


        } catch (HibernateException e) {
            System.out.println("Hibernate Exception");
        } catch (Exception e) {
            System.out.println("Exception");
        } finally {
            session.close();
            sf.close();
        }



    }
}
