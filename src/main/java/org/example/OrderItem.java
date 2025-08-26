package org.example;

public class OrderItem {
    private String description;
    private double unitPrice;
    private int quantity;

    public OrderItem(String description, double unitPrice, int quantity) {
        this.description = description;
        this.unitPrice = unitPrice;
        this.quantity = quantity;
    }

    public String getDescription() { return description; }
    public double getUnitPrice() { return unitPrice; }
    public int getQuantity() { return quantity; }

    public double getTotal() {
        return unitPrice * quantity;
    }

    @Override
    public String toString() {
        return description + " x" + quantity + " = R$ " + getTotal();
    }
}