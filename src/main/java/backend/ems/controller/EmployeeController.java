package backend.ems.controller;

import backend.ems.dto.EmployeeDto;
import backend.ems.service.EmployeeService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("/api/employees")
public class EmployeeController {

    private EmployeeService employeeService;

    //Build Add Employee REST API
    @PostMapping
    public ResponseEntity<EmployeeDto> createEmployee(@RequestBody EmployeeDto employeeDto) {
        EmployeeDto savedemployee = employeeService.createEmployee(employeeDto);
        return new ResponseEntity<>(savedemployee, HttpStatus.CREATED);
    }

    //Build Get Employee REST API
    @GetMapping("{id}")
    public ResponseEntity<EmployeeDto> getEmployeeId(@PathVariable("id") Long employeeId) {
        EmployeeDto employeeDto = employeeService.getEmployeeById(employeeId);
        return ResponseEntity.ok(employeeDto);
    }

    //Build Get All Employee REST API
    @GetMapping
    public ResponseEntity<List<EmployeeDto>> getAllEmployees() {
        List <EmployeeDto> allEmployees = employeeService.getAllEmployees();
        return ResponseEntity.ok(allEmployees);
    }

    //Build Update Employee by Id Rest API
    @PutMapping("{id}")
    public ResponseEntity<EmployeeDto> UpdateEmployee(@PathVariable("id") long employeeId,@RequestBody EmployeeDto employeeDto) {
        EmployeeDto UpdatedEmplpoyee = employeeService.updateEmployee(employeeId, employeeDto);
        return ResponseEntity.ok(UpdatedEmplpoyee);
    }

    //Build Delete Employee By Id
    @DeleteMapping("{id}")
    public ResponseEntity<String> deleteEmployee(@PathVariable("id") long employeeId) {

        employeeService.deleteEmployee(employeeId);
        String message = "Employee with id " + employeeId + " deleted successfully.";
        return ResponseEntity.ok(message);
    }

}
