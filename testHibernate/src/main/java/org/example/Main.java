package org.example;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {
        // Використовуємо лише налаштування з properties-файлу
        SessionFactory sessionFactory = new Configuration()
                .addAnnotatedClass(Item.class)
                .buildSessionFactory();

        Session session = null;
        //=== CREATE ===
//        session = sessionFactory.getCurrentSession();
//        session.beginTransaction();
//        Item item = new Item("Milk" ,80);
//        System.out.println(item);
//        session.save(item);
//        System.out.println(item);
//        session.getTransaction().commit();

        session = sessionFactory.getCurrentSession();

        sessionFactory.close();
    }
}
