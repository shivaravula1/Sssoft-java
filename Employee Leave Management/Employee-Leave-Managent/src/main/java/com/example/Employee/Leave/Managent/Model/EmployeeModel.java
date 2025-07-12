package com.example.Employee.Leave.Managent.Model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Data;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.web.WebProperties;

import java.util.List;
@JsonIgnoreProperties({"hibernateLazyInitializer", "handler", "leavemodel"})
@Entity
@Table(name = "Employee")
@Data
public class EmployeeModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;
    @Column(name = "name")
    private String name;
    @Column(name = "phone")
    private String phone;
    @Column(name = "email")
    private String email;
    @OneToMany(mappedBy = "employee", cascade = CascadeType.ALL)
    private List<LeaveModel> leavemodel;
}
