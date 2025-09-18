package com.client.ws.rasmooplus.service.subscription_type;

import com.client.ws.rasmooplus.dto.SubscriptionTypeDto;
import com.client.ws.rasmooplus.exception.NotFoundException;
import com.client.ws.rasmooplus.model.SubscriptionsType;
import com.client.ws.rasmooplus.repository.SubscriptionsTypeRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SubscriptionTypeServiceImpl implements SubscriptionTypeService {

    private final SubscriptionsTypeRepository subscriptionsTypeRepository;

    public SubscriptionTypeServiceImpl(SubscriptionsTypeRepository subscriptionsTypeRepository) {
        this.subscriptionsTypeRepository = subscriptionsTypeRepository;
    }

    @Override
    public List<SubscriptionsType> findAll() {
        return subscriptionsTypeRepository.findAll();
    }

    @Override
    public SubscriptionsType findById(Long id) {
        Optional<SubscriptionsType> subscriptionsType = subscriptionsTypeRepository.findById(id);
        if (subscriptionsType.isEmpty()) {
            throw new NotFoundException("Subscription Type Not Found");
        }
        return subscriptionsType.get();
    }

    @Override
    public SubscriptionsType create(SubscriptionTypeDto dto) {
        return subscriptionsTypeRepository.save(SubscriptionsType
                .builder()
                .id(dto.getId())
                .name(dto.getName())
                .price(dto.getPrice())
                .accessMonths(dto.getAccessMonths())
                .productKey(dto.getProductKey())
                .build());
    }

    @Override
    public SubscriptionsType update(Long id, SubscriptionsType subscriptionsType) {
        return null;
    }


    @Override
    public void delete(Long id) {
        subscriptionsTypeRepository.deleteById(id);
    }
}
