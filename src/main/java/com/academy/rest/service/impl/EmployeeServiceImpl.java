package com.academy.rest.service.impl;

import com.academy.rest.dto.AddressDto;
import com.academy.rest.dto.CreateEmployeeDto;
import com.academy.rest.dto.ShortEmployeeDto;
import com.academy.rest.dto.UpdateEmployeeDto;
import com.academy.rest.model.entity.Employee;
import com.academy.rest.model.repository.EmployeeRepository;
import com.academy.rest.service.EmployeeService;
import java.util.ArrayList;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class EmployeeServiceImpl implements EmployeeService {
  private final EmployeeRepository employeeRepository;
  @Override
  public List<ShortEmployeeDto> getAll() {
    var employees = employeeRepository.findAll();

    var shortEmployees = new ArrayList<ShortEmployeeDto>();

    employees.forEach(employee -> {
      var shortEmployeeDto = new ShortEmployeeDto();
      shortEmployeeDto.setId(employee.getId());
      shortEmployeeDto.setName(employee.getName());
      shortEmployeeDto.setSalary(employee.getSalary());

      shortEmployees.add(shortEmployeeDto);
    });

    return shortEmployees;
  }

  @Override
  public List<Employee> getEmployees() {
    return employeeRepository.findAll();
  }

  @Override
  public ShortEmployeeDto getById(Integer id) {
    var employee = employeeRepository.getReferenceById(id);

    var shortEmployeeDto = new ShortEmployeeDto();
    shortEmployeeDto.setId(employee.getId());
    shortEmployeeDto.setName(employee.getName());
    shortEmployeeDto.setSalary(employee.getSalary());

    return shortEmployeeDto;
  }


  @Override
  public void save(CreateEmployeeDto employee) {
    var employeeEntity = new Employee();
    employeeEntity.setEmail(employee.getEmail());
    employeeEntity.setName(employee.getName());
    employeeEntity.setYear(employee.getYear());

    employeeRepository.save(employeeEntity);
  }

  @Override
  public void update(UpdateEmployeeDto employee) {

  }

  @Override
  public void delete(Integer id) {

  }

  @Override
  public List<AddressDto> getAddresses(Integer employeeId) {
    return List.of();
  }
}
