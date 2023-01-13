package com.hb01.annotaion;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;


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


//        System.out.println("------------------with get ()-----------");
//        Student01 student01=  session.get(Student01.class,1000);
//        System.out.println(student01);
//        int stdId=1001;
//        Student01 student02=  session.get(Student01.class,stdId);
//        System.out.println(student02);


//
//        System.out.println("---------------with sql ----------------------");
//
//        String sqlQuery= "SELECT * FROM t_student01";
//
//        List<Object[]> result = session.createSQLQuery(sqlQuery).getResultList();
//
//        for (Object[] o: result) {
//            System.out.println(Arrays.toString(o));
//        }


        //-------------- 3th way HQL--------------

        String hqlQuery="FROM Student01";

      List<Student01> resultLest2=  session.createQuery(hqlQuery, Student01.class).getResultList();

//      for (Student01  std:resultLest2){
//          System.out.println(std);
       // resultLest2.forEach(t-> System.out.println(t));
//
//      }



        //--------------- fetch unique data with SQL ----------

        // long -- short
//
//        String sqlQuery1= "SELECT * FROM t_student01 WHERE std_name ='Omer' ";
//
//        Object[] student = (Object[]) session.createSQLQuery(sqlQuery1).uniqueResult();
//        System.out.println(Arrays.toString(student));

        //--------------- fetch unique data with HQL  ----------


//        String hqlQuery2 = "FROM Student01 WHERE name='Omer'";
//
//        Student01 std= session.createQuery(hqlQuery2,Student01.class).uniqueResult();
//
//        System.out.println(std);

        // ------------------ fetch data with alias using HQl Query  ---------------

        String hqlQuery4 = "SELECT s.id, s.name FROM Student01 s WHERE s.id <= 1002"; ///Student01 ==> s

          List<Object[]> std = session.createQuery(hqlQuery4).getResultList();
          for (Object[] std1:std){
              System.out.println(Arrays.toString(std1));
          }




        tx.commit();
        session.close();
        sf.close();



    }
}
