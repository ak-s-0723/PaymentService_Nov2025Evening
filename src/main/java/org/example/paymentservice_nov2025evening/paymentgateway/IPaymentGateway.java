package org.example.paymentservice_nov2025evening.paymentgateway;

public interface IPaymentGateway {

    String createPaymentLink(Long amount,String orderId,String phoneNumber,String name, String email);
}
