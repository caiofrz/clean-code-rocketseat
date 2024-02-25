package com.caiofrz.ddd.usecases;

import com.caiofrz.ddd.domain.purchases.Order;
import com.caiofrz.ddd.repositories.OrdersRepository;

public class SubmitOrderUseCase {

  private final OrdersRepository repository;

  public SubmitOrderUseCase(OrdersRepository repository) {
    this.repository = repository;
  }

  public void execute(String customerDocument, Double total) {
    var order = new Order(customerDocument, total);
    //Persistir no banco
    this.repository.create(order);
  }
}
