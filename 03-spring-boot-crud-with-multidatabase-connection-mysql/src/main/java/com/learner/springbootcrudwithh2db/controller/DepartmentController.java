package com.learner.springbootcrudwithh2db.controller;

import com.learner.springbootcrudwithh2db.entity.dept.Department;
import com.learner.springbootcrudwithh2db.repository.dept.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
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
@RequestMapping("/departments")
@Transactional("departmentTransactionManager")
public class DepartmentController {
    @Autowired
    private DepartmentRepository departmentRepository;

    @GetMapping("/{id}")
    public Object getDepartment(@PathVariable Integer id) {
        return departmentRepository.findById(id);
    }

    @GetMapping("")
    public Object getDepartments() {
        return departmentRepository.findAll();
    }

    @PostMapping("")
    public Object saveDepartment(@RequestBody Department employee) {
        departmentRepository.save(employee);
        return "Employee record created successfully.";
    }

    @PutMapping("")
    public Object updateDepartment(@RequestBody Department employee) {
        if (departmentRepository.existsById(employee.getId())) {
            departmentRepository.save(employee);
            return "Employee record updated successfully.";
        }
        return "Employee record Not updated as id not already present.";
    }

    @DeleteMapping("/{id}")
    public Object deleteDepartment(@PathVariable Integer id) {
        if (departmentRepository.existsById(id)) {
            departmentRepository.deleteById(id);
            return "Employee record deleted successfully.";
        }
        return "Employee record Not deleted as Employee record not already present.";
    }
}
