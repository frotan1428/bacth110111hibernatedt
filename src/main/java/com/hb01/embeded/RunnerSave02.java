package com.hb01.embeded;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class RunnerSave02 {


    public static void main(String[] args) {

        Student02 student1= new Student02();
        student1.setId(1001);
        student1.setName("Mustafa Seyip");
        student1.setGrade(99);


        Student02 student2= new Student02();
        student2.setId(1002);
        student2.setName("Omer");
        student2.setGrade(80);


        Student02 student3= new Student02();
        student2.setId(1003);
        student2.setName("Tarik Ergut");
        student2.setGrade(100);

        Address address1= new Address();
        address1.setCity("Warsa");
        address1.setZipCode("01-789");
        address1.setCountry("Turkiye");
        address1.setStreet("Daszynskiego");

        Address address2= new Address();
        address2.setCity("Hatay");
        address2.setZipCode("31001");
        address2.setCountry("Turkiye");
        address2.setStreet("sukru Balci");

        Address address3= new Address();
        address3.setCity("Asil");
        address3.setZipCode("32003");
        address3.setCountry("Kanada");
        address3.setStreet("Kadi koy 1 . street");

        student1.setAddress(address1);
        student2.setAddress(address2);
        student3.setAddress(address3);
        // let configure hibernate
        Configuration con= new Configuration().
                configure("hibernate.cfg.xml").
                addAnnotatedClass(Student02.class);

        // create session Factory

        SessionFactory sf= con.buildSessionFactory();

        Session session = sf.openSession();

        // create Transaction

        Transaction tx= session.beginTransaction();

        session.save(student1);
        session.save(student2);
        session.save(student3);


        tx.commit();
        session.close();
        sf.close();





    }


}
