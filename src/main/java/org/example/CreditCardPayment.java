package org.example;

import org.example.Order;
public class CreditCardPayment implements PaymentMethod {
    private String cardNumber;

    public CreditCardPayment(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    public boolean pay(Order order) {
        System.out.println("Pagamento no cartão de crédito (" + maskCard() + ") aprovado!");
        order.markAsPaid();
        return true;
    }

    private String maskCard() {
        if (cardNumber.length() >= 4) {
            return "**** **** **** " + cardNumber.substring(cardNumber.length() - 4);
        }
        return cardNumber;
    }
}