package org.example.paymentservice_nov2025evening.services;

import org.example.paymentservice_nov2025evening.paymentgateway.IPaymentGateway;
import org.example.paymentservice_nov2025evening.paymentgateway.PaymentGatewayChooserStrategy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    @Autowired
    private PaymentGatewayChooserStrategy strategy;

    public String getPaymentLink(Long amount,String orderId,String phoneNumber,
                                 String name, String email) {
        IPaymentGateway paymentGateway = strategy.getBestPaymentGateway();
        return paymentGateway.createPaymentLink(amount, orderId, phoneNumber,
                name, email);
    }
}
