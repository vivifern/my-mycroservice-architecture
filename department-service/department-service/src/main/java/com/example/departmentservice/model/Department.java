package com.example.departmentservice.model;

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
@Table(name = "department")
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "dept_id")
    private Integer deptId;
    @Column(name = "dept_name")
    @NotEmpty(message = "Department name cannot be empty")
    private String deptName;
    @Column(name = "dept_code")
    @NotEmpty(message = "Department code cannot be empty")
    private String deptCode;

}
