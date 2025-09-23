package com.client.ws.rasmooplus.integration.raspay;

import com.client.ws.rasmooplus.dto.wsraspay.CustomerDto;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

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
    }

    @Test
    void processPayment() {
    }
}