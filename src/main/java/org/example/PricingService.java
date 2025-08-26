package org.example;

import org.example.Order;
import org.example.OrderItem;
public class PricingService {
    public void calculateTotal(Order order) {
        double total = 0;
        for (OrderItem item : order.getItems()) {
            total += item.getTotal();
        }
        order.setTotal(total);
    }
}