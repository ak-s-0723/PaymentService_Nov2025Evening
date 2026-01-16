package org.example.paymentservice_nov2025evening.controllers;

import org.example.paymentservice_nov2025evening.dtos.PaymentRequestDto;
import org.example.paymentservice_nov2025evening.services.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("/payment")
@RestController
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @PostMapping
    public String generatePaymentLink(@RequestBody PaymentRequestDto paymentRequestDto) {
       return paymentService.getPaymentLink(paymentRequestDto.getAmount(),paymentRequestDto.getOrderId(),paymentRequestDto.getPhoneNumber(),paymentRequestDto.getName(),paymentRequestDto.getEmail());
    }
}
