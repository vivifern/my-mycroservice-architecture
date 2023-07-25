package com.example.employeeservice.controller;

import com.example.employeeservice.model.EmpDeptDTO;
import com.example.employeeservice.model.EmployeeDTO;
import com.example.employeeservice.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("employee")
public class EmployeeController {

    @Autowired
    EmployeeService employeeService;

    @PostMapping("addemployee")
    public EmployeeDTO addDepartment(EmployeeDTO departmentDTO){
        return employeeService.addEmployee(departmentDTO);
    }

    @GetMapping("getemployee")
    public EmployeeDTO getDeptByDeptCode(Long empCode){
        return employeeService.getEmpById(empCode);
    }

    @GetMapping("getemployeeanddept")
    public EmpDeptDTO getEmpAndDept(Long empCode){
        return employeeService.getEmpAndDeptDTO(empCode);
    }
}
