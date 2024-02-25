package com.caiofrz.ddd.domain.purchases;

public class Customer {

  private String nome;
  private String email;
  private String document;

  public Customer(String nome, String email, String document) {
    this.nome = nome;
    this.email = email;
    this.document = document;
  }
}
