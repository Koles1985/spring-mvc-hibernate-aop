package com.prapor.spring_mvc_hibernate_aop.dao;

import com.prapor.spring_mvc_hibernate_aop.entity.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO{

    @Autowired
    private SessionFactory sessionFactory;

    @Override
    public List<Employee> getAllEmployees() {

        Session session = sessionFactory.getCurrentSession();
// Первый вариант получения данных из БД
//        List<Employee> employees = session.createQuery("from Employee", Employee.class)
//                .getResultList();
        // Второй вариант получения данных из БД оба работают одинаково, первый вариант компактнее
        Query<Employee> query = session.createQuery("from Employee", Employee.class);
        List<Employee> employees = query.getResultList();
        return employees;
    }
}
