package com.example.Employee.Leave.Managent.Service;

import com.example.Employee.Leave.Managent.Model.EmployeeModel;
import com.example.Employee.Leave.Managent.Repository.EmployeeRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmployeeService {
    private final EmployeeRepository repo;
    public EmployeeService(EmployeeRepository repo){
         this.repo = repo;
    }
    public EmployeeModel SaveEmployee(EmployeeModel employee){
        return repo.save(employee);
    }
    public List<EmployeeModel> getEmployee(){
        return repo.findAll();
    }
}
