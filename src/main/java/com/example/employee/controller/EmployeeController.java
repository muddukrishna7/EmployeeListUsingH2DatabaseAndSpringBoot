/*
 * You can use the following import statements
 *
 * import org.springframework.beans.factory.annotation.Autowired;
 * import org.springframework.web.bind.annotation.*;
 * import java.util.*;
 */

// Write your code here
package com.example.employee.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.employee.service.EmployeeH2Service;
import com.example.employee.model.Employee;
import java.util.*;

@RestController 

public class EmployeeController {

    @Autowired 
    EmployeeH2Service employeeH2Service;
    
    @GetMapping("/employees")
    public ArrayList<Employee> getEmployees() {
        return employeeH2Service.getEmployees();
    }

    @GetMapping("/employees/{employeeId}")
    public Employee getEmployeeById(@PathVariable("employeeId") int employeeId) {
        return employeeH2Service.getEmployeeById(employeeId);
    } 

    @PostMapping("/employees")
    public Employee addEmployee(@RequestBody Employee employee) {
        return employeeH2Service.addEmployee(employee);
    }

    @PutMapping("/employees/{employeeId}")
    public Employee updateEmployee(@RequestBody Employee employee, @PathVariable("employeeId") int employeeId) {
        return employeeH2Service.updateEmployee(employee, employeeId);
    }

    @DeleteMapping("/employees/{employeeId}")
    public void deleteEmployee(@PathVariable("employeeId") int employeeId) {
        employeeH2Service.deleteEmployee(employeeId);
    }
}

