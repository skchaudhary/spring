package com.learner.springbootcrudwithh2db.repository.emp;

import com.learner.springbootcrudwithh2db.entity.emp.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

// this annotation not need to put as implementation class already have
// SimpleJpaRepository is the implementation for CrudRepository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
}
