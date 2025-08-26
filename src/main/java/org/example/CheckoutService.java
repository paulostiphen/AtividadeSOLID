package org.example;

import org.example.Order;
import org.example.Notifier;
import org.example.OrderRepository;
import org.example.PaymentMethod;
import org.example.PricingService;


public class CheckoutService {
    private PricingService pricingService;
    private OrderRepository orderRepository;
    private Notifier notifier;

    public CheckoutService(PricingService pricingService, OrderRepository orderRepository, Notifier notifier) {
        this.pricingService = pricingService;
        this.orderRepository = orderRepository;
        this.notifier = notifier;
    }

    public void checkout(Order order, PaymentMethod paymentMethod) {
        pricingService.calculateTotal(order);
        System.out.println("Total calculado: R$ " + order.getTotal());

        boolean success = paymentMethod.pay(order);

        if (success) {
            orderRepository.save(order);
            notifier.notify(order);
        } else {
            System.out.println("❌ Pagamento falhou. Pedido não concluído.");
        }
    }
}