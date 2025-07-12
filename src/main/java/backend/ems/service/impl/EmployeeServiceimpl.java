package backend.ems.service.impl;

import backend.ems.dto.EmployeeDto;
import backend.ems.mapper.EmployeeMapper;
import backend.ems.model.Employee;
import backend.ems.repository.EmployeeRepository;
import backend.ems.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class EmployeeServiceimpl implements EmployeeService {

    private EmployeeRepository employeeRepository;
    @Override
    public EmployeeDto createEmployee(EmployeeDto employeeDto) {
        Employee employee = EmployeeMapper.maptoEmployee(employeeDto);
        Employee savedEmployee = employeeRepository.save(employee);
        return EmployeeMapper.maptoEmployeeDto(savedEmployee);
    }

    @Override
    public EmployeeDto getEmployeeById(long employeeId) {
        employeeRepository.findById(employeeId)
                .ifPresent(employee -> {})
        return null;
    }
}
