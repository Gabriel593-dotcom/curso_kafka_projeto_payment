package com.bank.paymentservice.resources.impl;

import com.bank.paymentservice.models.dtos.Payment;
import com.bank.paymentservice.resources.Paymentresource;
import com.bank.paymentservice.services.PaymentService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@RequestMapping(value = "/payments")
public class PaymentResourceImpl implements Paymentresource {

  private final PaymentService paymentService;

  @Override
  public ResponseEntity<Payment> payment(Payment payment) {
    paymentService.sendPayment(payment);
    return ResponseEntity.status(HttpStatus.CREATED).build();
  }
}
