package com.academy.rest.service;

import com.academy.rest.dto.AddressDto;
import com.academy.rest.dto.CreateEmployeeDto;
import com.academy.rest.dto.ShortEmployeeDto;
import com.academy.rest.dto.UpdateEmployeeDto;
import com.academy.rest.model.entity.Employee;
import java.util.List;

public interface EmployeeService {
  List<ShortEmployeeDto> getAll();

  List<Employee> getEmployees();

  ShortEmployeeDto getById(Integer id);

  void save(CreateEmployeeDto employee);

  void update(UpdateEmployeeDto employee);

  void delete(Integer id);

  List<AddressDto> getAddresses(Integer employeeId);
}
