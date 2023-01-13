package com.hb01.embeded;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class RunnerFetch02 {

    public static void main(String[] args) {

        Configuration con= new Configuration().
                configure("hibernate.cfg.xml").
                addAnnotatedClass(Student02.class);
        // create session Factory

        SessionFactory sf= con.buildSessionFactory();

        Session session = sf.openSession();

        // create Transaction

        Transaction tx= session.beginTransaction();

        Student02 std=  session.get(Student02.class ,1003);
        System.out.println(std);
        System.out.println(std.getAddress());


        tx.commit();
        session.close();
        sf.close();

    }
}
