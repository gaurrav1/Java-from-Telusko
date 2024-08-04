package org.HibernateDemo.app;

import org.HibernateDemo.model.Student;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Deletion {
    public static void main(String[] args) {
        SessionFactory cfg = new Configuration()
                .configure()
                .addAnnotatedClass(Student.class)
                .buildSessionFactory();

        Session session = null;
        Transaction tx = null;
        boolean flag = false;

        try {
            session = cfg.openSession();
            tx = session.beginTransaction();

            Student student = new Student();
            student.setId(3);
            student.setName("Gaurav");
            student.setCity("Surat");


            session.remove(student);
            flag = true;

        } catch (HibernateException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.print(e.getMessage());
        } finally {
            if (flag) {
                tx.commit();
            } else {
                tx.rollback();
            }
            session.close();
        }


    }
}
