package com.demo.manytoonemapp;

import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	System.out.println( "Hello World!" );
        
        Laptop l1 = new Laptop();
        l1.setLname("Sony");
        l1.setPrice(11000);
        
        Laptop l2 = new Laptop();
        l2.setLname("Acer");
        l2.setPrice(12000);
        
        Laptop l3 = new Laptop();
        l3.setLname("Dell");
        l3.setPrice(13000);

        Laptop l4 = new Laptop();
        l4.setLname("Apple");
        l4.setPrice(133000);
        
        Laptop l5 = new Laptop();
        l5.setLname("Samsung");
        l5.setPrice(156400);
        
        Laptop l6 = new Laptop();
        l6.setLname("Lenovo");
        l6.setPrice(114650);
        
        Student std1 = new Student();
        std1.setName("Shubham");
        l1.setStd(std1);
        l2.setStd(std1);
        
        Student std2 = new Student();
        std2.setName("Omkar");
        l3.setStd(std2);
        l4.setStd(std2);
        
        Student std3 = new Student();
        std3.setName("Vaibhav");
        l5.setStd(std2);
        l6.setStd(std3);
        
        Configuration con = new Configuration().configure(); //.addAnnotatedClass(Laptop.class)
        SessionFactory sf = con.buildSessionFactory();
        
        Session session1 =  sf.openSession();
        Transaction tx = session1.beginTransaction(); 
        
        session1.save(l1);
        session1.save(l2);
        session1.save(l3);
        session1.save(l4);
        session1.save(l5);
        session1.save(l6);
       
        tx.commit();
        session1.close();
       // System.out.println(ltop);
        sf.close();
        System.out.println("Done");
    }																																			
}
