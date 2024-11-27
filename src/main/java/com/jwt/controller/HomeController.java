package com.jwt.controller;

import com.jwt.model.Employee;
import com.jwt.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/welcome")
public class HomeController {

    @Autowired
    private EmployeeService employeeService;
    @GetMapping("/home")
    public String getHome(){
        return "welcome to home";
    }
    @GetMapping("/emplist")
    public List<Employee> getEmployee(){
        System.out.println("in emp list");
        return employeeService.getEmployee();
    }

}
