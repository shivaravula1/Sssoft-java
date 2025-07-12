package com.example.Employee.Leave.Managent.Controller;

import com.example.Employee.Leave.Managent.Model.EmployeeModel;
import com.example.Employee.Leave.Managent.Model.LeaveModel;
import com.example.Employee.Leave.Managent.Service.EmployeeService;
import com.example.Employee.Leave.Managent.Service.LeaveService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/leave")
public class LeaveController {
    private final LeaveService levservice;
    public LeaveController(LeaveService levservice){
        this.levservice = levservice;
    }
    @PostMapping
    public LeaveModel saveLevDetails(@RequestBody LeaveModel Leave){
        return levservice.saveLeave(Leave);
    }
}
