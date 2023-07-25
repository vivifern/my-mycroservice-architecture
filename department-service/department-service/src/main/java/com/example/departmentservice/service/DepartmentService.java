package com.example.departmentservice.service;

import com.example.departmentservice.model.DepartmentDTO;

public interface DepartmentService {

    public DepartmentDTO addNewDepartment(DepartmentDTO departmentDTO);

    public DepartmentDTO getDeptByDeptCode(String deptCode);
}
