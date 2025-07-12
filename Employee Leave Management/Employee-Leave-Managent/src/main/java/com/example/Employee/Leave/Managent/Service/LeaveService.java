package com.example.Employee.Leave.Managent.Service;

import com.example.Employee.Leave.Managent.Model.LeaveModel;
import com.example.Employee.Leave.Managent.Repository.EmployeeRepository;
import com.example.Employee.Leave.Managent.Repository.LeaveRepository;
import org.springframework.stereotype.Service;

@Service
public class LeaveService {

    private final LeaveRepository lepo;
    private final EmployeeRepository repo;

    public LeaveService(LeaveRepository lepo, EmployeeRepository repo) {
        this.lepo = lepo;
        this.repo = repo;
    }

    public LeaveModel saveLeave(LeaveModel leave) {
        if (leave.getEmployee() == null || leave.getEmployee().getId() == null) {
            throw new RuntimeException("Employee ID is missing in request");
        }
        boolean empExists = repo.existsById(leave.getEmployee().getId());
        if (!empExists) {
            throw new RuntimeException("Employee ID not found");
        }

        leave.setId(null); // Important: ensure Hibernate treats it as a new insert
        leave.setStatus("PENDING");

        return lepo.save(leave);
    }
}
