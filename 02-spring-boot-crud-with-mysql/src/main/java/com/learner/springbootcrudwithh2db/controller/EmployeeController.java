package com.learner.springbootcrudwithh2db.controller;

import com.learner.springbootcrudwithh2db.entity.Employee;
import com.learner.springbootcrudwithh2db.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

// here rest controller has @Response implicitly so we using this
// Request mapping define the type of noun for entity, we can directly give whole path in particular methods but this is good way to define the apis.
@RestController
@RequestMapping("/employees")
public class EmployeeController {
    @Autowired
    private EmployeeRepository employeeRepository;

    @GetMapping("/{id}")
    public Object getEmployee(@PathVariable Integer id){
        return employeeRepository.findById(id);
    }

    @GetMapping("")
    public Object getEmployees(){
        return employeeRepository.findAll();
    }

    @PostMapping("")
    public Object saveEmployee(@RequestBody Employee employee){
        employeeRepository.save(employee);
        return "Employee record created successfully.";
    }

    @PutMapping("")
    public Object updateEmployee(@RequestBody Employee employee){
        if (employeeRepository.existsById(employee.getId())) {
            employeeRepository.save(employee);
            return "Employee record updated successfully.";
        }
        return "Employee record Not updated as id not already present.";
    }

    @DeleteMapping("/{id}")
    public Object deleteEmployee(@PathVariable Integer id){
        if (employeeRepository.existsById(id)) {
            employeeRepository.deleteById(id);
            return "Employee record deleted successfully.";
        }
        return "Employee record Not deleted as Employee record not already present.";
    }
}
