package com.OneToMany.HibernateOneToMany.main;

import java.util.Arrays;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.OneToMany.HibernateOneToMany.Entity.Department;
import com.OneToMany.HibernateOneToMany.Entity.Employee;
import com.OneToMany.HibernateOneToMany.util.HibernateUtil;


public class MainApp {

    public static void main(String[] args) {

        Department dept = new Department();
        dept.setDeptName("IT");

        Employee e1 = new Employee();
        e1.setEmpName("Mahesh");
        e1.setDepartment(dept);

        Employee e2 = new Employee();
        e2.setEmpName("Ravi");
        e2.setDepartment(dept);

        dept.setEmployees(Arrays.asList(e1, e2));

        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction tx = session.beginTransaction();

        session.persist(dept); // saves department + employees

        tx.commit();
        session.close();

        System.out.println("One-To-Many data inserted successfully!");
    }
}

