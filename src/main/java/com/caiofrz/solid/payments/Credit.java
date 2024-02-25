package com.caiofrz.solid.payments;

public class Credit extends Card implements PaymentMethod {

  private final Integer installments;

  public Credit(String number,
                String cvv,
                String expiration,
                Integer installments) {
    super(number, cvv, expiration);
    this.installments = installments;
  }

  @Override
  public Double getDiscountAmount(Double amount) {
    if (this.installments == 1) return amount * 0.05;
    if (this.installments <= 6) return amount * 0.02;

    return 0.0;
  }
}
