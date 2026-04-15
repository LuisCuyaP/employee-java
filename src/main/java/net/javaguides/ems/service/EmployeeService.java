package net.javaguides.ems.service;

import net.javaguides.ems.dto.EmployeeDto;

import java.util.List;

public interface EmployeeService {
    EmployeeDto createEmployee(EmployeeDto employeeDto);
    EmployeeDto getEmployeeById(long employeeId);
    List<EmployeeDto> getEmployees();
    EmployeeDto updateEmployee(long employeeId, EmployeeDto updateEmployee);
    void deleteEmployee(long employeeId);
}
