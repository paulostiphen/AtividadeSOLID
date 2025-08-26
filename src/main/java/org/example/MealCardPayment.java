package org.example;

import org.example.Order;
public class MealCardPayment implements PaymentMethod {
    private String company;

    public MealCardPayment(String company) {
        this.company = company;
    }

    @Override
    public boolean pay(Order order) {
        System.out.println("Pagamento via cartão refeição (" + company + ") concluído!");
        order.markAsPaid();
        return true;
    }
}