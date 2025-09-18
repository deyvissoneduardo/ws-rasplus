package com.client.ws.rasmooplus.mapper;

import com.client.ws.rasmooplus.dto.SubscriptionTypeDto;
import com.client.ws.rasmooplus.model.SubscriptionsType;

public class SubcriptionTypeMapper {

    public static SubscriptionsType fromDtoToEntity(SubscriptionTypeDto dto) {
        return SubscriptionsType
                .builder()
                .id(dto.getId())
                .name(dto.getName())
                .price(dto.getPrice())
                .accessMonths(dto.getAccessMonths())
                .productKey(dto.getProductKey())
                .build();
    }
}
