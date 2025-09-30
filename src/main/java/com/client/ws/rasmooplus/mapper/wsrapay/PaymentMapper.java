package com.client.ws.rasmooplus.mapper.wsrapay;

import com.client.ws.rasmooplus.dto.wsraspay.CreditCardDto;
import com.client.ws.rasmooplus.dto.wsraspay.PaymentDto;

public class PaymentMapper {

    public static PaymentDto build(String costomerId, String orderId, CreditCardDto dto) {
        return PaymentDto.builder()
                .creditCard(dto)
                .orderId(orderId)
                .customerId(costomerId)
                .build();
    }
}
