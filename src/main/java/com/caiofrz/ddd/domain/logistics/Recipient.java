package com.caiofrz.ddd.domain.logistics;

public class Recipient {
  private String street;
  private String number;
  private String zipcode;

  public Recipient(String street, String number, String zipcode) {
    this.street = street;
    this.number = number;
    this.zipcode = zipcode;
  }
}
