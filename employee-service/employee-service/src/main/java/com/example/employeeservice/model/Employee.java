package com.example.employeeservice.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "employee")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "emp_id")
    private Long empId;
    @Column(name = "emp_first_name")
    @NotEmpty(message = "First Name cannot be empty")
    private String empFirstName;
    @Column(name = "emp_last_name")
    @NotEmpty(message = "Last Name cannot be empty")
    private String empLastName;
    @Column(name = "dept_id")
    @NotEmpty(message = "Department Id cannot be empty")
    private String deptId;

}
