package org.example;

import org.example.Order;
public interface OrderRepository {
    void save(Order order);
    Order findById(String id);
}
