package org.example;

import org.example.Order;
public class PixPayment implements PaymentMethod {
    @Override
    public boolean pay(Order order) {
        System.out.println("Pagamento via PIX realizado com sucesso!");
        order.markAsPaid();
        return true;
    }
}