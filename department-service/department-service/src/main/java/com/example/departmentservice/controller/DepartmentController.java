package com.example.departmentservice.controller;

import com.example.departmentservice.model.Department;
import com.example.departmentservice.model.DepartmentDTO;
import com.example.departmentservice.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("department")
public class DepartmentController {

    @Autowired
    DepartmentService departmentService;

    @PostMapping("adddepartment")
    public DepartmentDTO addDepartment(DepartmentDTO departmentDTO){
        return departmentService.addNewDepartment(departmentDTO);
    }

    @GetMapping("getdepartment")
    public DepartmentDTO getDeptByDeptCode(String deptCode){
        return departmentService.getDeptByDeptCode(deptCode);
    }
}
