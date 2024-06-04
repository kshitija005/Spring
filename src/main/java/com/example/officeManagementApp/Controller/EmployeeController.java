package com.example.officeManagementApp.Controller;

import com.example.officeManagementApp.Model.Employee;
import com.example.officeManagementApp.Service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
public class EmployeeController {

//API = Code + endpoint
//endpoint of API(link)

    @Autowired
    EmployeeService employeeService;

    @PostMapping("/add-employee")
    //logic of API(code)
    public String addEmployee(@RequestBody Employee employee)
    {
        employeeService.addEmployee(employee);
        return "Employee registered successfully!!";
    }

    @GetMapping("/get-employee")
    public Employee getEmployee(@RequestParam("id") int empId)
    {
        return employeeService.getEmployee(empId);
    }


    @DeleteMapping("/delete-employee/{id}")
    public String deleteEmployee(@PathVariable("id") int empId)
    {
        employeeService.deleteEmployee(empId);
        return "Employee was deleted";
    }


    @PutMapping("/update-salary")
    public Employee updateSalary(@RequestParam("id") int empId,
                                 @RequestParam("new-salary") int newSalary)
    {
        return employeeService.updateSalary(empId, newSalary);
    }




}
