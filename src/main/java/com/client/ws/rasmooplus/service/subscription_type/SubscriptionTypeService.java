package com.client.ws.rasmooplus.service.subscription_type;

import com.client.ws.rasmooplus.dto.SubscriptionTypeDto;
import com.client.ws.rasmooplus.model.SubscriptionsType;

import java.util.List;

public interface SubscriptionTypeService {
    List<SubscriptionsType> findAll();

    SubscriptionsType findById(Long id);

    SubscriptionsType create(SubscriptionTypeDto dto);

    SubscriptionsType update(Long id, SubscriptionsType subscriptionsType);

    void delete(Long id);
}
