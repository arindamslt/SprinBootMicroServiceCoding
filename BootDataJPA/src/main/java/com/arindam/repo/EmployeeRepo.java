package com.arindam.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.arindam.model.Employee;
@Repository
public interface EmployeeRepo extends JpaRepository<Employee,String> {

}
