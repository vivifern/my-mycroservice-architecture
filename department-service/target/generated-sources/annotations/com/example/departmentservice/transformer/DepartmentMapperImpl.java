package com.example.departmentservice.transformer;

import com.example.departmentservice.model.Department;
import com.example.departmentservice.model.DepartmentDTO;
import javax.annotation.processing.Generated;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-07-19T14:26:44+0530",
    comments = "version: 1.5.5.Final, compiler: javac, environment: Java 17.0.7 (Eclipse Adoptium)"
)
public class DepartmentMapperImpl implements DepartmentMapper {

    @Override
    public DepartmentDTO deptToDeptDTO(Department department) {
        if ( department == null ) {
            return null;
        }

        DepartmentDTO departmentDTO = new DepartmentDTO();

        departmentDTO.setDeptId( department.getDeptId() );
        departmentDTO.setDeptName( department.getDeptName() );
        departmentDTO.setDeptCode( department.getDeptCode() );

        return departmentDTO;
    }

    @Override
    public Department deptDTOToDept(DepartmentDTO departmentDTO) {
        if ( departmentDTO == null ) {
            return null;
        }

        Department department = new Department();

        department.setDeptId( departmentDTO.getDeptId() );
        department.setDeptName( departmentDTO.getDeptName() );
        department.setDeptCode( departmentDTO.getDeptCode() );

        return department;
    }
}
