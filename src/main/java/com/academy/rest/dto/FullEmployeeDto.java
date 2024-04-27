package com.academy.rest.dto;

import lombok.Data;

@Data
public class FullEmployeeDto {
  private String name;
  private String email;
  private Integer year;
  private Integer salary;
}