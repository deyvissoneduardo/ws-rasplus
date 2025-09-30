package com.client.ws.rasmooplus.service.payment;

import com.client.ws.rasmooplus.dto.PaymentProcessDto;

public interface PaymentInfoService {
    Boolean process(PaymentProcessDto dto);
}
