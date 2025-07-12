package com.example.Employee.Leave.Managent.Controller;

import com.example.Employee.Leave.Managent.Model.EmployeeModel;
import com.example.Employee.Leave.Managent.Service.EmployeeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    private final EmployeeService Empservice;
    public EmployeeController(EmployeeService Empservice){
        this.Empservice = Empservice;
    }
    @PostMapping
    public EmployeeModel saveEmpDetails(@RequestBody EmployeeModel Employee){
        return Empservice.SaveEmployee(Employee);
    }
    @GetMapping
    public List<EmployeeModel> getEmpDetails(){
        return Empservice.getEmployee();
    }
}
