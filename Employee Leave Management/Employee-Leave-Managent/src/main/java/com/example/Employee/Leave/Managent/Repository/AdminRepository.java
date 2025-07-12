package com.example.Employee.Leave.Managent.Repository;

import com.example.Employee.Leave.Managent.Model.AdminModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdminRepository extends JpaRepository<AdminModel,Integer> {
}
