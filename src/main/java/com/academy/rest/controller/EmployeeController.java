package com.academy.rest.controller;

import com.academy.rest.dto.AddressDto;
import com.academy.rest.dto.CreateEmployeeDto;
import com.academy.rest.dto.ShortEmployeeDto;
import com.academy.rest.dto.UpdateEmployeeDto;
import com.academy.rest.model.entity.Employee;
import com.academy.rest.service.EmployeeService;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping(value = "/employees")
public class EmployeeController {
  private final EmployeeService employeeService;

  @GetMapping()
  public List<ShortEmployeeDto> getAll() {
    return employeeService.getAll();
  }

  @GetMapping(value = "/{id}")
  public ShortEmployeeDto getAll(@PathVariable Integer id) {
    return employeeService.getById(id);
  }

  @GetMapping(value = "/{id}/address")
  public List<AddressDto> getAllAddresses(@PathVariable Integer id) {
    return employeeService.getAddresses(id);
  }

  @PostMapping()
  public ResponseEntity<ShortEmployeeDto> create(@RequestBody CreateEmployeeDto employee) {
    employeeService.save(employee);
    return new ResponseEntity<>(HttpStatus.CREATED);
  }

  @PutMapping()
  public ResponseEntity<ShortEmployeeDto> update(@RequestBody UpdateEmployeeDto employee) {
    employeeService.update(employee);
    return new ResponseEntity<>(HttpStatus.OK);
  }

  @DeleteMapping(value = "/{id}")
  public ResponseEntity<Void> delete(@PathVariable Integer id) {
    employeeService.delete(id);

    return new ResponseEntity<>(HttpStatus.NO_CONTENT);
  }
}
