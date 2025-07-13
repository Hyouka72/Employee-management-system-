package backend.ems.service;

import backend.ems.dto.EmployeeDto;

import java.util.List;

public interface EmployeeService {

   
        EmployeeDto createEmployee(EmployeeDto employeeDto);

        EmployeeDto getEmployeeById(long employeeId);

        List<EmployeeDto> getAllEmployees();



}
