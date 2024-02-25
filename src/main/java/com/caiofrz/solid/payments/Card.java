package com.caiofrz.solid.payments;

public abstract class Card {
  private String number;
  private String cvv;
  private String expiration;

   public Card(String number, String cvv, String expiration) {
      this.number = number;
      this.cvv = cvv;
      this.expiration = expiration;
   }
}
