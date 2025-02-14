package com.prapor.spring_mvc_hibernate_aop.controller;


import com.prapor.spring_mvc_hibernate_aop.dao.EmployeeDAO;
import com.prapor.spring_mvc_hibernate_aop.entity.Employee;
import com.prapor.spring_mvc_hibernate_aop.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @RequestMapping("/")
    public String showAllEmployees(Model model){

        List<Employee> employeeList = employeeService.getAllEmployees();
        model.addAttribute("employeeList", employeeList);


        return "show-employee-lst";
    }
}
