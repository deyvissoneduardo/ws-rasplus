package com.client.ws.rasmooplus.service.subscription_type;

import com.client.ws.rasmooplus.dto.SubscriptionTypeDto;
import com.client.ws.rasmooplus.exception.BadRequestException;
import com.client.ws.rasmooplus.exception.NotFoundException;
import com.client.ws.rasmooplus.mapper.SubcriptionTypeMapper;
import com.client.ws.rasmooplus.model.SubscriptionsType;
import com.client.ws.rasmooplus.repository.SubscriptionsTypeRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;
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
        return getSubscriptionsType(id);
    }

    @Override
    public SubscriptionsType create(SubscriptionTypeDto dto) {
        if (Objects.nonNull(dto.getId())) {
            throw new BadRequestException("id cannot be null");
        }
        return subscriptionsTypeRepository.save(SubcriptionTypeMapper.fromDtoToEntity(dto));
    }

    @Override
    public SubscriptionsType update(Long id, SubscriptionTypeDto dto) {
        getSubscriptionsType(id);
        dto.setId(id);
        return subscriptionsTypeRepository.save(SubcriptionTypeMapper.fromDtoToEntity(dto));
    }

    @Override
    public void delete(Long id) {
        getSubscriptionsType(id);
        subscriptionsTypeRepository.deleteById(id);
    }

    private SubscriptionsType getSubscriptionsType(Long id) {
        Optional<SubscriptionsType> subscriptionsType = subscriptionsTypeRepository.findById(id);
        if (subscriptionsType.isEmpty()) {
            throw new NotFoundException("Subscription Type Not Found");
        }
        return subscriptionsType.get();
    }
}
