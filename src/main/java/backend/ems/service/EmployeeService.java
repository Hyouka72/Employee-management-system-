package backend.ems.service;

import backend.ems.dto.EmployeeDto;

public interface EmployeeService {

   
        EmployeeDto createEmployee(EmployeeDto employeeDto);

        EmployeeDto getEmployeeById(long employeeId);



}
