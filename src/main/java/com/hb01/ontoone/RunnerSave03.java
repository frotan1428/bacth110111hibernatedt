package com.hb01.ontoone;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class RunnerSave03 {

    public static void main(String[] args) {


        Student03 student1= new Student03();
        student1.setId(2000);
        student1.setGrade(90);
        student1.setName("Omer Isik");


        Student03 student2= new Student03();
        student2.setId(2001);
        student2.setGrade(89);
        student2.setName("Ebadurrahman  Musleh");

        Student03 student3= new Student03();
        student3.setId(2003);
        student3.setGrade(91);
        student3.setName("Tarik  Ergut");



        Diary diary1= new Diary();
        diary1.setId(3001);
        diary1.setName("Omer 's Diary");
        diary1.setStudent03(student1);


        Diary diary2= new Diary();
        diary2.setId(3002);
        diary2.setName("Musleh  's Diary");
        diary2.setStudent03(student2);

        Diary diary3= new Diary();
        diary3.setId(3003);
        diary3.setName("Tarik  's Diary");
        diary3.setStudent03(student3);


        Configuration con= new Configuration().
                configure("hibernate.cfg.xml");
//                addAnnotatedClass(Student03.class).
//                addAnnotatedClass(Diary.class);

        // create session Factory

        SessionFactory sf= con.buildSessionFactory();

        Session session = sf.openSession();

        // create Transaction

        Transaction tx= session.beginTransaction();


        session.save(student1);
        session.save(student2);
        session.save(student3);

        session.save(diary1);
        session.save(diary2);
        session.save(diary3);

        tx.commit();
        session.close();
        sf.close();
    }

}
