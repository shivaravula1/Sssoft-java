package com.example.Employee.Leave.Managent.Repository;

import com.example.Employee.Leave.Managent.Model.EmployeeModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<EmployeeModel, Integer> {

}
