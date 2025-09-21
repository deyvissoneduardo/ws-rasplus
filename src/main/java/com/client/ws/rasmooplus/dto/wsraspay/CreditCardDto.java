package com.client.ws.rasmooplus.dto.wsraspay;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CreditCardDto {

    private Long cvv;

    private String documentNumber;

    private Long month;

    private String number;

    private Long installments;

    private Long year;
}
