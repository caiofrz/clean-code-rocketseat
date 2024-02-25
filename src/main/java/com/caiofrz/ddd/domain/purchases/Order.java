package com.caiofrz.ddd.domain.purchases;

import java.time.LocalDateTime;
import java.util.Date;

public class Order {
  private String customerDocument;
  private Double total;
  private Date createdAt;

  public Order(String customerDocument, Double total) {
    this.customerDocument = customerDocument;
    this.total = total;
    this.createdAt = new Date();
  }
}
