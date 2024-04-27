package com.academy.rest.model.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import java.time.Instant;
import java.util.List;
import lombok.Data;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.hibernate.annotations.Formula;

@Data
@Entity
@Table(name = "employee")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
//@Immutable
public class Employee{
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;
  private String name;
  private Integer year;
  private String email;
  private Integer salary;
  private Integer account;
  private Instant dob;
  @Column(name = "phone")
  private String employeePhone;
  @Formula(value = "Concat(name, year)")
  private String nameYear;
  @Embedded
  private DocData docData;

  @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
  @JoinColumn(name = "employee_id")
  private List<Address> addresses;
  @OneToOne(mappedBy = "employee")
  private Login login;
//  @OneToMany(mappedBy = "employee")
//  private List<EmployeeDepartment> departments;
}
