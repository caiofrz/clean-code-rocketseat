package com.caiofrz.solid;

import com.caiofrz.solid.payments.Billet;
import com.caiofrz.solid.payments.Debit;
import com.caiofrz.solid.payments.PaymentMethod;

public class CalculateOrderDiscount {

  private final PaymentMethod paymentMethod;

  public CalculateOrderDiscount(PaymentMethod paymentMethod) {
    this.paymentMethod = paymentMethod;
  }

  public Double execute(Double amount) {
    //calculo do desconto
    return paymentMethod.getDiscountAmount(amount);
  }

  public static void main(String[] args) {
    CalculateOrderDiscount orderDiscount = new CalculateOrderDiscount(new Billet());
    orderDiscount.execute(1_000.00);
  }
}
