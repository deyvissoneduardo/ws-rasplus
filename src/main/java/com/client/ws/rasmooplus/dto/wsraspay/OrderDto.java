package com.client.ws.rasmooplus.dto.wsraspay;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrderDto {

    private String id;

    private Long discount;

    private String productAcronym;

    private String customerId;

}
