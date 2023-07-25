package com.example.departmentservice.transformer;

import com.example.departmentservice.model.Department;
import com.example.departmentservice.model.DepartmentDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface DepartmentMapper {

    DepartmentMapper INSTANCE = Mappers.getMapper(DepartmentMapper.class);

    DepartmentDTO deptToDeptDTO(Department department);

    Department deptDTOToDept(DepartmentDTO departmentDTO);
}
