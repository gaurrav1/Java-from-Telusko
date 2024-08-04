package org.HibernateDemo.app;

import org.HibernateDemo.model.HiEmployee;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class TransientAnnot {
    public static void main(String[] args) {

        SessionFactory sf = new Configuration()
                .configure()
                .addAnnotatedClass(HiEmployee.class)
                .buildSessionFactory();
        Session session = null;
        Transaction tx = null;
        boolean flag = false;


        try {
            session = sf.openSession();
            tx = session.beginTransaction();

            HiEmployee emp = new HiEmployee();
            emp.setId(1);
            emp.setName("Gaurav");
            emp.setAge(19);
            emp.setCity("Surat"); // Transient property will not be added

            session.persist(emp);
            flag = true;


        } catch (HibernateException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.print(e.getMessage());
        } finally {
            if (flag) {
                tx.commit();
            }
            else {
                tx.rollback();
            }
            session.close();
        }


    }
}
