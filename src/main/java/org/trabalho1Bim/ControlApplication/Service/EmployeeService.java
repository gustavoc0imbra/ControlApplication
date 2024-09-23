package org.trabalho1Bim.ControlApplication.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.trabalho1Bim.ControlApplication.Model.Employee;
import org.trabalho1Bim.ControlApplication.Repository.EmployeeRepository;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public Employee add(Employee employee)
    {
        return employeeRepository.saveAndFlush(employee);
    }

    public List<Employee> findAll()
    {
        return employeeRepository.findAll();
    }

    public Optional<Employee> findOne(String CPF)
    {
        return employeeRepository.findById(CPF);
    }

    public void delete (String CPF)
    {
        employeeRepository.deleteById(CPF);
    }
}
