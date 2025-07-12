package com.example.Employee.Leave.Managent.Controller;


import com.example.Employee.Leave.Managent.Model.AdminModel;
import com.example.Employee.Leave.Managent.Service.AdminService;
import org.springframework.web.bind.annotation.*;

@RestController
public class AdminController {
    private final AdminService admservice;
        public AdminController(AdminService admservice){
            this.admservice = admservice;
        }
    @PutMapping("/updatestatus/{id}")
    public String SaveAdminDetails(@PathVariable int id,
                                   @RequestParam String newStatus,
                                   @RequestBody AdminModel admin) {
        return admservice.saveStatus(id, newStatus, admin);
    }
}
