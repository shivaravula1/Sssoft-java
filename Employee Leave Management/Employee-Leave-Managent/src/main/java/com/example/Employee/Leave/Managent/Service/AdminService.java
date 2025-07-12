package com.example.Employee.Leave.Managent.Service;

import com.example.Employee.Leave.Managent.Model.AdminModel;
import com.example.Employee.Leave.Managent.Model.LeaveModel;
import com.example.Employee.Leave.Managent.Repository.LeaveRepository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class AdminService {

    private final LeaveRepository lepo;

    public AdminService(LeaveRepository lepo) {
        this.lepo = lepo;
    }

    public String saveStatus(int id, String newStatus, AdminModel inputAdmin) {
        if (inputAdmin == null || inputAdmin.getAdminid() == null) {
            throw new RuntimeException("Admin ID must be provided.");
        }

        if (inputAdmin.getAdminid() != 1001) {
            throw new RuntimeException("Only admin with ID 1001 can update status.");
        }

        LeaveModel leave = lepo.findById(id)
                .orElseThrow(() -> new RuntimeException("Leave not found with ID: " + id));

        leave.setStatus(newStatus);
        inputAdmin.setAdminid(1001);  // no DB fetch, just assign directly
        lepo.save(leave);

        return "Leave status updated successfully.";
    }
}

