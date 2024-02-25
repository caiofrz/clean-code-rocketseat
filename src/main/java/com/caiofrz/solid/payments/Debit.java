package com.caiofrz.solid.payments;

public class Debit extends Card implements PaymentMethod {
  public Debit(String number, String cvv, String expiration) {
    super(number, cvv, expiration);
  }

  @Override
  public Double getDiscountAmount(Double amount) {
    return amount * 0.05;
  }

}
