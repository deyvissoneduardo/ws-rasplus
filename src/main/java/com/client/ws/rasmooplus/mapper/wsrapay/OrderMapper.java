package com.client.ws.rasmooplus.mapper.wsrapay;

import com.client.ws.rasmooplus.dto.PaymentProcessDto;
import com.client.ws.rasmooplus.dto.wsraspay.OrderDto;

public class OrderMapper {

    public static OrderDto build(String customerId, PaymentProcessDto paymentProcessDto){
        return new OrderDto().builder()
                .discount(paymentProcessDto.getDiscount())
                .productAcronym(paymentProcessDto.getProductKey())
                .customerId(customerId)
                .build();
    }
}
