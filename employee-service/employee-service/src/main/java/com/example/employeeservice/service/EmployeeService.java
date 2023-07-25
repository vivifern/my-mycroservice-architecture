package com.example.employeeservice.service;

import com.example.employeeservice.model.EmpDeptDTO;
import com.example.employeeservice.model.EmployeeDTO;

public interface EmployeeService {

    public EmployeeDTO addEmployee(EmployeeDTO departmentDTO);

    public EmployeeDTO getEmpById(Long deptCode);

    public EmpDeptDTO getEmpAndDeptDTO(Long empId);
}
