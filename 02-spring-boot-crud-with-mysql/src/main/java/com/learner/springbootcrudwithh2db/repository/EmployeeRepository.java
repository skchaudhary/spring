package com.learner.springbootcrudwithh2db.repository;

import com.learner.springbootcrudwithh2db.entity.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

// this annotation not need to put as implementation class already have
// SimpleJpaRepository is the implementation for CrudRepository
// @Repository
public interface EmployeeRepository extends CrudRepository<Employee, Integer> {
}
