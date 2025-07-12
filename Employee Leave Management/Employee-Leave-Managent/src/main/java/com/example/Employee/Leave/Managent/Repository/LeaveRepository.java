package com.example.Employee.Leave.Managent.Repository;

import com.example.Employee.Leave.Managent.Model.LeaveModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LeaveRepository extends JpaRepository<LeaveModel, Integer> {
}
