package com.bank.paymentservice.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.bank.paymentservice.models.dtos.Payment;

public interface PaymentResource {
    
    @PostMapping
    ResponseEntity<Payment> payment(@RequestBody Payment payment);
}
