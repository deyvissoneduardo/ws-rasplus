package com.client.ws.rasmooplus.integration.raspay;

import com.client.ws.rasmooplus.dto.wsraspay.CreditCardDto;
import com.client.ws.rasmooplus.dto.wsraspay.CustomerDto;
import com.client.ws.rasmooplus.dto.wsraspay.OrderDto;
import com.client.ws.rasmooplus.dto.wsraspay.PaymentDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.math.BigDecimal;

@SpringBootTest
class WsRaspayIntegrationImplTest {

    @Autowired
    private WsRaspayIntegration wsRaspayIntegration;

    @Test
    void createCustomer() {
        CustomerDto dto = new CustomerDto(null, "05283390101", "test@gmail.com", "Teste", "teste 01");
        wsRaspayIntegration.createCustomer(dto);
    }

    @Test
    void createOrder() {
        OrderDto dto = new OrderDto(null, BigDecimal.ZERO, "MONTH22", "68d16435e0c14a364821df1a");
        wsRaspayIntegration.createOrder(dto);
    }

    @Test
    void processPayment() {
        CreditCardDto creditCardDto = new CreditCardDto(123L, "05283390101", 06L, "1234123412341234", 0L, 2025L);
        PaymentDto dto = new PaymentDto(creditCardDto, "68d16435e0c14a364821df1a", "68d1ee766a6ad674dbfaa791");
        wsRaspayIntegration.processPayment(dto);
    }
}