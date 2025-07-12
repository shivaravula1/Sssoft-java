package com.example.Employee.Leave.Managent.Model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
@Table(name = "admin")
public class AdminModel {
    @Column(name = "id")
    @Id
    private Integer adminid;
    @OneToMany(mappedBy = "admin" , cascade = CascadeType.ALL)
    private List<LeaveModel> leavemodel;


}
