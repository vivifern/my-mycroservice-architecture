package com.example.employeeservice.transformer;

import com.example.employeeservice.model.Employee;
import com.example.employeeservice.model.EmployeeDTO;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-07-19T14:22:17+0530",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.7 (Eclipse Adoptium)"
)
public class EmployeeMapperImpl implements EmployeeMapper {

    @Override
    public EmployeeDTO empToEmpDTO(Employee department) {
        if ( department == null ) {
            return null;
        }

        EmployeeDTO employeeDTO = new EmployeeDTO();

        employeeDTO.setEmpId( department.getEmpId() );
        employeeDTO.setEmpFirstName( department.getEmpFirstName() );
        employeeDTO.setEmpLastName( department.getEmpLastName() );
        employeeDTO.setDeptId( department.getDeptId() );

        return employeeDTO;
    }

    @Override
    public Employee empDTOToEmp(EmployeeDTO departmentDTO) {
        if ( departmentDTO == null ) {
            return null;
        }

        Employee employee = new Employee();

        employee.setEmpId( departmentDTO.getEmpId() );
        employee.setEmpFirstName( departmentDTO.getEmpFirstName() );
        employee.setEmpLastName( departmentDTO.getEmpLastName() );
        employee.setDeptId( departmentDTO.getDeptId() );

        return employee;
    }
}
