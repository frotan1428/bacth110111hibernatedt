package com.hbo1.annotaion;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class RunnerFetch01 {

    public static void main(String[] args) {
        // let configure hibernate
        Configuration con= new Configuration().
                configure("hibernate.cfg.xml").
                addAnnotatedClass(Student01.class);
        // create session Factory
        SessionFactory sf= con.buildSessionFactory();
        Session session = sf.openSession();
        // create Transaction
        Transaction tx= session.beginTransaction();

                // There are 3 type fetch data from DB
        //1 ) get()
        //2 ) SQL
        //3 ) HQL

        Student01 student01=  session.get(Student01.class,1000);
        System.out.println(student01);



        int stdId=1001;
        Student01 student02=  session.get(Student01.class,stdId);
        System.out.println(student02);





        tx.commit();
        session.close();
        sf.close();
    }
}
