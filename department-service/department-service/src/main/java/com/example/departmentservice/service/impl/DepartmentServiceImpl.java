package com.example.departmentservice.service.impl;

import com.example.departmentservice.exception.ResourceNotFoundException;
import com.example.departmentservice.model.Department;
import com.example.departmentservice.model.DepartmentDTO;
import com.example.departmentservice.repository.DepartmentRepository;
import com.example.departmentservice.service.DepartmentService;
import com.example.departmentservice.transformer.DepartmentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DepartmentServiceImpl implements DepartmentService {

    @Autowired
    DepartmentRepository departmentRepository;

    @Override
    public DepartmentDTO addNewDepartment(DepartmentDTO departmentDTO) {
        Department savedDepartment = departmentRepository.save(
            DepartmentMapper.INSTANCE.deptDTOToDept(departmentDTO));
        return DepartmentMapper.INSTANCE.deptToDeptDTO(savedDepartment);
    }

    @Override
    public DepartmentDTO getDeptByDeptCode(String deptCode) {
        Department deptarment = departmentRepository.findByDeptCode(deptCode).orElseThrow(() ->
                new ResourceNotFoundException("Could not find Deptart with ID : " + deptCode));
        return DepartmentMapper.INSTANCE.deptToDeptDTO(deptarment);
    }
}
