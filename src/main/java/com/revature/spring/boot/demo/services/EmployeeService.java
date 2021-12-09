package com.revature.spring.boot.demo.services;

import com.revature.spring.boot.demo.entities.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface EmployeeService {
    public Employee addEmployee(Employee employee);
    public List<Employee> getAllEmployees();
    public Employee getEmployeeById(long id);
    public void deleteEmployee(long id);
    public Employee updateEmployee(long id, Employee employee);
}
