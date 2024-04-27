package com.academy.rest.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Login {
  @Id
  private Integer id;
  private String login;
  private String password;
  @OneToOne
  @JoinColumn(name = "employee_id")
  private Employee employee;
}
