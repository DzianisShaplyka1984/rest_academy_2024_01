package com.academy.rest.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Address {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;
  @Column
  private String street;
  @Column
  private String city;
  @Column
  private String appartment;
//  @ManyToOne()
//  @JoinColumn(name = "employee_id")
//  private Employee employee;
}