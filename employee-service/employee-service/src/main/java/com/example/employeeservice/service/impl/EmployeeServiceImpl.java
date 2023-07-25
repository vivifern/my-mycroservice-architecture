package com.example.employeeservice.service.impl;

import com.example.employeeservice.exception.ResourceNotFoundException;
import com.example.employeeservice.model.DepartmentDTO;
import com.example.employeeservice.model.EmpDeptDTO;
import com.example.employeeservice.model.Employee;
import com.example.employeeservice.model.EmployeeDTO;
import com.example.employeeservice.repository.EmployeeRepository;
import com.example.employeeservice.service.EmployeeService;
import com.example.employeeservice.transformer.EmployeeMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Autowired
    private WebClient webClient;

    @Override
    public EmployeeDTO addEmployee(EmployeeDTO departmentDTO) {
        Employee savedDepartment = employeeRepository.save(
                EmployeeMapper.INSTANCE.empDTOToEmp(departmentDTO));
        return EmployeeMapper.INSTANCE.empToEmpDTO(savedDepartment);
    }

    @Override
    public EmployeeDTO getEmpById(Long id) {
        Employee employee = employeeRepository.findById(id).orElseThrow(() ->
                new ResourceNotFoundException("Could not find Employee with ID : " + id));
        return EmployeeMapper.INSTANCE.empToEmpDTO(employee);
    }

    @Override
    public EmpDeptDTO getEmpAndDeptDTO(Long empId) {
        Employee employee = employeeRepository.findById(empId).orElseThrow(() ->
                new ResourceNotFoundException("Could not find Employee with ID : " + empId));
        DepartmentDTO departmentDTO = webClient.get()
                .uri("http://localhost:8080/department/getdepartment?deptCode=" + employee.getDeptId())
                .retrieve()
                .bodyToMono(DepartmentDTO.class)
                .block();
        return new EmpDeptDTO(EmployeeMapper.INSTANCE.empToEmpDTO(employee), departmentDTO);
    }
}
