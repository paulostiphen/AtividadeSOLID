package org.example;

import org.example.Order;
import org.example.Notifier;
import org.example.OrderRepository;
import org.example.PaymentMethod;
import org.example.PricingService;

public class Main {
    public static void main(String[] args) {
        // Criando cliente e pedido
        Customer cliente = new Customer("1", "Paulo", "paulo@email.com");
        Order pedido = new Order("101", cliente);
        pedido.addItem(new OrderItem("Pizza", 40.0, 1));
        pedido.addItem(new OrderItem("Refrigerante", 8.0, 2));

        // Serviços de checkout
        PricingService pricingService = new PricingService();
        OrderRepository repo = new InMemoryOrderRepository();
        Notifier notifier = new EmailNotifier();
        CheckoutService checkout = new CheckoutService(pricingService, repo, notifier);

        // Pagamento
        PaymentMethod pagamento = new CreditCardPayment("1234567812345678");

        // Finalizando o pedido
        checkout.checkout(pedido, pagamento);

        System.out.println("Resumo final: " + pedido);
    }
}