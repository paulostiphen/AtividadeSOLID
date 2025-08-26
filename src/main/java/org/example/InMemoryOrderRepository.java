package org.example;

import org.example.Order;

import java.util.HashMap;
import java.util.Map;

public class InMemoryOrderRepository implements OrderRepository {
    private Map<String, Order> db = new HashMap<>();

    @Override
    public void save(Order order) {
        db.put(order.getId(), order);
        System.out.println(" Pedido salvo no banco em memória.");
    }

    @Override
    public Order findById(String id) {
        return db.get(id);
    }
}
