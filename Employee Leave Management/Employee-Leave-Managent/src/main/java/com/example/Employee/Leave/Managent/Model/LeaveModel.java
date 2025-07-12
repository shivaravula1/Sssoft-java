package com.example.Employee.Leave.Managent.Model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "leaverequest")
public class LeaveModel {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Integer id;
    @Column(name = "type")
    private String type;
    @Column(name = "from_data")
    private String from_date;
    @Column(name = "to_date")
    private String to_date;
    @Column(name = "reason")
    private String reason;
    @Column(name = "status")
    private String status;

    @ManyToOne
    @JoinColumn(name = "employee.id")
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    private EmployeeModel employee;

    @ManyToOne
    @JoinColumn(name = "adminid")
    private AdminModel admin;

}
