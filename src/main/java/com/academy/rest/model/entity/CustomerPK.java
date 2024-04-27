package com.academy.rest.model.entity;

import jakarta.persistence.Embeddable;
import java.io.Serializable;
import lombok.Data;

@Data
@Embeddable
public class CustomerPK implements Serializable {
  private String email;
  private String brand;
}
