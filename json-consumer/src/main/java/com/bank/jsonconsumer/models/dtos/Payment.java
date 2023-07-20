package com.bank.jsonconsumer.models.dtos;

import java.io.Serializable;

import lombok.Getter;
import lombok.ToString;

@ToString
@Getter
public class Payment implements Serializable {

  public static final Long serialUID = 1L;

  private Long id;
  private Long idUser;
  private Long idProduct;
  private String cardNumber;
}
