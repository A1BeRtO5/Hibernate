package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Використовуємо лише налаштування з properties-файлу
        SessionFactory sessionFactory = new Configuration()// робити тільки один
                .addAnnotatedClass(Item.class)
                .buildSessionFactory();

        Session session = null;

        //=== CREATE ===
//        session = sessionFactory.getCurrentSession();//сесія відкривається
//        session.beginTransaction();
//        Item item = new Item("Milk" ,80);
//        System.out.println(item);
//        session.save(item);
//        System.out.println(item);
//        session.getTransaction().commit();//сесія закривається

        //=== READ ===
//        session = sessionFactory.getCurrentSession();
//        session.beginTransaction();
//        Item itemFromDB = session.get(Item.class, 1);
//        System.out.println(itemFromDB);
//        session.getTransaction().commit();
//        sessionFactory.close();

        //=== UPDATE ===
//        session = sessionFactory.getCurrentSession();//first session
//        session.beginTransaction();
//        Item itemFromDB = session.get(Item.class, 1);
//        System.out.println(itemFromDB);
//        itemFromDB.setPrice(60);
//        itemFromDB.setTitle("Bread");
//        session.getTransaction().commit();
//        System.out.println(itemFromDB + "dfsadf");

//        session = sessionFactory.getCurrentSession();//second session
//        session.beginTransaction();
//        session.get(Item.class, 1);
//        session.getTransaction().commit();
//        System.out.println(itemFromDB + "laaaaa");
//        sessionFactory.close();

        //=== DELETE ===
        session = sessionFactory.getCurrentSession();
        session.beginTransaction();
//        Item itemFromDB = session.createQuery("SELECT i FROM Item i WHERE i.id = :id", Item.class)
//                .setParameter("id", 2)
//                .getSingleResult();
        List<Item> itemFromDB = session.createQuery("SELECT i FROM Item i", Item.class).getResultList();
        System.out.println(itemFromDB+ "kkkkkkkkk");
        session.getTransaction().commit();

    }
}
