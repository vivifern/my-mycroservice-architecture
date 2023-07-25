package com.example.employeeservice.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class EmpDeptDTO {

    private EmployeeDTO employeeDTO;

    private DepartmentDTO departmentDTO;
}
