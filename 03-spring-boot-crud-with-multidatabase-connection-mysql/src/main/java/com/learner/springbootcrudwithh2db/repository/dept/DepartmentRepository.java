package com.learner.springbootcrudwithh2db.repository.dept;

import com.learner.springbootcrudwithh2db.entity.dept.Department;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

// this annotation not need to put as implementation class already have
// SimpleJpaRepository is the implementation for CrudRepository
public interface DepartmentRepository extends CrudRepository<Department, Integer> {
}
