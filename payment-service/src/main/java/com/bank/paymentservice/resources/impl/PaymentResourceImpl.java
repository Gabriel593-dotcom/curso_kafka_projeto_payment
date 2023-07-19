package com.bank.paymentservice.resources.impl;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bank.paymentservice.models.dtos.Payment;
import com.bank.paymentservice.resources.PaymentResource;
import com.bank.paymentservice.services.PaymentService;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@RestController
@RequestMapping(value = "/payments")
public class PaymentResourceImpl implements PaymentResource {

  private final PaymentService paymentService;

  @Override
  public ResponseEntity<Payment> payment(Payment payment) {
    paymentService.sendPayment(payment);
    return ResponseEntity.status(HttpStatus.CREATED).build();
  }
}
