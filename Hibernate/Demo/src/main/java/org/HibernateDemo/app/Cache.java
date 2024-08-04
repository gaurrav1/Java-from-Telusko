package org.HibernateDemo.app;

import org.HibernateDemo.model.Student;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Cache {
    public static void main(String[] args) {
        SessionFactory cfg = new Configuration()
                .configure()
                .addAnnotatedClass(Student.class)
                .buildSessionFactory();

        Session session = null;

        try {
            session = cfg.openSession();
            System.out.println(session.get(Student.class, 1));
            System.out.println(session.get(Student.class, 1));
            System.out.println(session.get(Student.class, 1));
            // Although you have tried to get information 3 times, hibernate will execute jdbc query only once

        } catch (HibernateException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.print(e.getMessage());
        } finally {
            session.close();
            cfg.close();
        }
    }
}
