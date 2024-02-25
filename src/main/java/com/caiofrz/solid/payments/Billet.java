package com.caiofrz.solid.payments;

public class Billet implements PaymentMethod {
  @Override
  public Double getDiscountAmount(Double amount) {
    return amount * 0.1;
  }
}
