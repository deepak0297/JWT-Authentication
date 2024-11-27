package com.jwt.service;

import com.jwt.model.Employee;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class EmployeeService {
    ArrayList<Employee> empList = new ArrayList<>();
    public EmployeeService(){
        empList.add(new Employee(
                UUID.randomUUID().toString(),
                "Abhishek","abhishek@gmail.com"));
        empList.add(new Employee(
                UUID.randomUUID().toString(),
                "Aman","aman@gmail.com"));
        empList.add(new Employee(
                UUID.randomUUID().toString(),
                "Shiv","shiv@gmail.com"));
        empList.add(new Employee(
                UUID.randomUUID().toString(),
                "Khushi","khushi@gmail.com"));
    }
    public List<Employee> getEmployee() {
        return empList;
    }
}
