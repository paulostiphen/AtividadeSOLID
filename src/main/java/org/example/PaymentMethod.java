package org.example;

import org.example.Order;
public interface PaymentMethod {
    boolean pay(Order order);
}