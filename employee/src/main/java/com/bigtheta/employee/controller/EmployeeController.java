package com.bigtheta.employee.controller;


import com.bigtheta.employee.model.Employee;
import com.bigtheta.employee.services.EmployeeServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/emp")

public class EmployeeController {

    @Autowired
    private EmployeeServices employeeServices;

    @PostMapping("/addEmployee")
    public Employee addEmployee(@RequestBody Employee employee){
        return employeeServices.addEmployee(employee);
    }

    @PostMapping("/addEmployees")
    public List<Employee> addAllEmployees(@RequestBody List<Employee> employees){
        return employeeServices.addEmployees(employees);
    }

    @PostMapping("/getEmployeeByID")
    public Employee getEmployeeById(@@PathVariable int id){
        return employeeServices.getEmployeeByID(id);
    }

    @GetMapping("/getEmployeeByName/{name}")
    public Employee getEmployeeByName(@PathVariable String name){
        return employeeServices.getEmployeeByName(name);
    }

    @PutMapping("/updateEmployee")
    public Employee updateEmployee(@RequestBody Employee employee){
        return employeeServices.updateEmployee(employee);
    }

    @DeleteMapping("/deleteEmployeeById/{id}")
    public boolean deleteEmployeeByID(@PathVariable int id){
        return employeeServices.deleteEmployeeByID(id);
    }
}
