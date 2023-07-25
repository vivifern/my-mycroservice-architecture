package com.example.employeeservice.transformer;

import com.example.employeeservice.model.Employee;
import com.example.employeeservice.model.EmployeeDTO;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface EmployeeMapper {

    EmployeeMapper INSTANCE = Mappers.getMapper(EmployeeMapper.class);

    EmployeeDTO empToEmpDTO(Employee department);

    Employee empDTOToEmp(EmployeeDTO departmentDTO);
}
