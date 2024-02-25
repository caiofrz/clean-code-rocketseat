package com.caiofrz.ddd.repositories;

import com.caiofrz.ddd.domain.purchases.Order;

public interface OrdersRepository {
  void create(Order order);
}
