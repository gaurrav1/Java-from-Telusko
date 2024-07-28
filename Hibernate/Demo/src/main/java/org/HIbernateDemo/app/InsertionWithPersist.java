package org.HIbernateDemo.app;

import org.HIbernateDemo.model.Student;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class InsertionWithPersist {
    public static void main(String[] args) {

        Configuration configuration = null;
        SessionFactory sessionFactory = null;
        Session session = null;
        Transaction transaction = null;
        boolean flag = false;

        configuration = new Configuration();
        configuration.configure(); // By default, hibernate.cfg.xml is applied
        sessionFactory = configuration.buildSessionFactory();
        session = sessionFactory.openSession();

        Student student = new Student();
        student.setId(2);
        student.setName("Gaurav");
        student.setCity("good");

        try {
            transaction = session.beginTransaction();
            session.persist(student);
            flag = true;
        } catch (HibernateException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.print(e.getMessage());
        } finally {
            if (flag) {
                transaction.commit();
            } else {
                assert transaction != null;
                transaction.rollback();
            }
            session.close();
        }

    }
}
