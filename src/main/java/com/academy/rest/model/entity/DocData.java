package com.academy.rest.model.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Data;

@Data
@Embeddable
public class DocData {
  @Column(name = "doc_number")
  private String docNumber;
  @Column(name = "doc_type")
  private String docType;
  @Column(name = "doc_issue_date")
  private String docIssueDate;
}
