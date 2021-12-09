package com.revature.spring.boot.demo.services;

import com.revature.spring.boot.demo.entities.Employee;
import com.revature.spring.boot.demo.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService{
    @Autowired
    private EmployeeRepository repository;


    @Override
    public Employee addEmployee(Employee employee) {
        return repository.save(employee);
    }

    @Override
    public List<Employee> getAllEmployees() {
        return repository.findAll();
    }

    @Override
    public Employee getEmployeeById(long id) {
        Optional<Employee> employee = repository.findById(id);
        if(!employee.isPresent()) {
            return null;
        }
        else {
            return employee.get();
        }
    }

    @Override
    public void deleteEmployee(long id) {
        repository.deleteById(id);
    }

    @Override
    public Employee updateEmployee(long id, Employee updatedEmployee) {
        Employee employeedb = repository.findById(id).get();
        employeedb.setName(updatedEmployee.getName());
        employeedb.setEmail((updatedEmployee.getEmail()));
        return repository.save((employeedb));
    }
}
