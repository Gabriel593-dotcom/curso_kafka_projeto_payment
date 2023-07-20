package com.bank.jsonconsumer.listeners;

import com.bank.jsonconsumer.models.dtos.Payment;
import lombok.SneakyThrows;
import lombok.extern.log4j.Log4j2;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

@Log4j2
@Component
public class JsonListener {

  @SneakyThrows
  @KafkaListener(
    topics = "payment-topic",
    groupId = "create-group",
    containerFactory = "jsonContainerFactory"
  )
  public void antiFraud(@Payload Payment payment) {
    Thread.sleep(1000);
    log.info("Pagamento recebido {}", payment);

    Thread.sleep(2000);
    log.info("Validando fraude ...");

    log.info("Compra aprovada ...");
    Thread.sleep(3000);
  }

  @SneakyThrows
  @KafkaListener(
    topics = "payment-topic",
    groupId = "pdf-group",
    containerFactory = "jsonContainerFactory"
  )
  public void pdfGenerator() {
    Thread.sleep(4000);
    log.info("Gerando PDF ...");
  }

  @SneakyThrows
  @KafkaListener(
    topics = "payment-topic",
    groupId = "email-group",
    containerFactory = "jsonContainerFactory"
  )
  public void sendEmail(@Payload Payment payment) {
    Thread.sleep(5000);
    log.info("Enviando email de confirmação ... {}", payment);
  }
}
