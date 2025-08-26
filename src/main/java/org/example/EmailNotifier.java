package org.example;

import org.example.Order;
public class EmailNotifier implements Notifier {
    @Override
    public void notify(Order order) {
        System.out.println(" Enviando email para " + order.getCustomer().getEmail() +
                ": Seu pedido #" + order.getId() + " foi confirmado!");
    }
}