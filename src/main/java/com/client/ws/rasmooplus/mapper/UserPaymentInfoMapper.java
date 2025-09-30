package com.client.ws.rasmooplus.mapper;

import com.client.ws.rasmooplus.dto.UserPaymentInfoDto;
import com.client.ws.rasmooplus.model.User;
import com.client.ws.rasmooplus.model.UserPaymentInfo;

public class UserPaymentInfoMapper {
    public static UserPaymentInfo fromDtoToEntity(UserPaymentInfoDto dto, User user) {
        return new UserPaymentInfo().builder()
                .id(dto.getId())
                .user(user)
                .dtPayment(dto.getDtPayment())
                .price(dto.getPrice())
                .cardNumber(dto.getCardNumber())
                .cardExpirationYear(dto.getCardExpirationYear())
                .cardSecurityCode(dto.getCardSecurityCode())
                .instalments(dto.getInstalments())
                .cardExpirationMonth(dto.getCardExpirationMonth())
                .build();
    }
}
