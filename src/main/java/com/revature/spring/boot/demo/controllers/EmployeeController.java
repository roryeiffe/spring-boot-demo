package com.revature.spring.boot.demo.controllers;

import com.revature.spring.boot.demo.entities.Employee;
import com.revature.spring.boot.demo.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService service;

    @PostMapping("/employees")
    public Employee saveEmployee(@RequestBody Employee employee) {
        return service.addEmployee(employee);
    }

    @GetMapping("/employees")
    public List<Employee> getEmployees() {
        return service.getAllEmployees();
    }


    @GetMapping("/employees/{id}")
    public Employee getEmployeeById(@PathVariable("id") long id) {
        return service.getEmployeeById(id);
    }

    @DeleteMapping("/employees/{id}")
    public String deleteEmployee(@PathVariable("id") long id){
        service.deleteEmployee(id);
        return "record deleted successfully";
    }

    @PutMapping("/employees/{id}")
    public String updateEmployee(@PathVariable("id") long id, @RequestBody Employee employee) {
        service.updateEmployee(id, employee);
        return "record updated successfully";
    }

}
