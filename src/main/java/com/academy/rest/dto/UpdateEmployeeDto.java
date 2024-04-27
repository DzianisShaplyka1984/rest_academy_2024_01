package com.academy.rest.dto;

import lombok.Data;

@Data
public class UpdateEmployeeDto {
  private Integer id;
  private String name;
  private String email;
  private Integer year;
  private Integer salary;
}
