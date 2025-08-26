package org.example;

import java.util.ArrayList;
import java.util.List;

public class Order {
    private String id;
    private Customer customer;
    private List<OrderItem> items = new ArrayList<>();
    private double total;
    private boolean paid;

    public Order(String id, Customer customer) {
        this.id = id;
        this.customer = customer;
    }

    public void addItem(OrderItem item) {
        items.add(item);
    }

    public String getId() { return id; }
    public Customer getCustomer() { return customer; }
    public List<OrderItem> getItems() { return items; }
    public double getTotal() { return total; }
    public boolean isPaid() { return paid; }

    public void setTotal(double total) {
        this.total = total;
    }

    public void markAsPaid() {
        this.paid = true;
    }

    @Override
    public String toString() {
        return "Pedido #" + id + " de " + customer.getName() + " - Total: R$ " + total + (paid ? " [PAGO]" : " [PENDENTE]");
    }
}