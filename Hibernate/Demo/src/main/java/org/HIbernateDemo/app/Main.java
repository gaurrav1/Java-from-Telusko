package org.HIbernateDemo.app;

import org.HIbernateDemo.model.Student;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {
        // Step 1: Create Configuration Object
        Configuration config = new Configuration();

        // Step 2: Configure hibernate.cfg.xml file to Configuration Object
        config.configure("hibernate.cfg.xml");

        // Step 3: Create session factory object
        SessionFactory sessionFactory = config.buildSessionFactory();

        // Step 4: Get the session Object from session factory
        Session session = sessionFactory.openSession();

        // Step 5: Begin transaction within session
        Transaction transaction = session.beginTransaction();

        Student student = new Student();
        student.setId(1);
        student.setName("Krishna");
        student.setCity("Everywhere");

        // Step 6: Perform operation
        session.save(student); // save() is deprecated

        // Step 7: Performing transaction operations
        transaction.commit();

        //Step 8: Close the session
        session.close();

    }
}