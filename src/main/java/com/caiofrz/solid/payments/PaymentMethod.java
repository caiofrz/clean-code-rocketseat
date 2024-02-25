package com.caiofrz.solid.payments;

public interface PaymentMethod {
  Double getDiscountAmount(Double amount);
}
