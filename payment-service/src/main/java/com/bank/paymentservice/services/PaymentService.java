package com.bank.paymentservice.services;

import org.springframework.stereotype.Service;

import com.bank.paymentservice.models.dtos.Payment;

@Service
public interface PaymentService {
    
    void sendPayment(Payment payment);
}
