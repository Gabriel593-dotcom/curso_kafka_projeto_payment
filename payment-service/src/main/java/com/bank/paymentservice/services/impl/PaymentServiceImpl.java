package com.bank.paymentservice.services.impl;

import com.bank.paymentservice.models.dtos.Payment;
import com.bank.paymentservice.services.PaymentService;
import java.io.Serializable;
import lombok.RequiredArgsConstructor;
import lombok.SneakyThrows;
import lombok.extern.log4j.Log4j2;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Log4j2
@Service
public class PaymentServiceImpl implements PaymentService {

  private final KafkaTemplate<String, Serializable> kafkaTemplate;

  @SneakyThrows
  @Override
  public void sendPayment(Payment payment) {
    log.info("Recebi o pagamento {}", payment.toString());
    Thread.sleep(1000);

    log.info("Enviando pagamento...");
    kafkaTemplate.send("payment-topic", payment);
  }
}
