package com.client.ws.rasmooplus.mapper.wsrapay;

import com.client.ws.rasmooplus.dto.wsraspay.CustomerDto;
import com.client.ws.rasmooplus.model.User;

public class CustomerMapper {

    public static CustomerDto build(User user) {
        var fullName = user.getName().split(" ");
        var firstName = user.getName().split(" ")[0];
        var lastName = fullName.length > 1 ? user.getName().split(" ")[fullName.length - 1] : "";

        return new CustomerDto().builder()
                .cpf(user.getCpf())
                .firstName(firstName)
                .lastName(lastName)
                .email(user.getEmail())
                .build();
    }
}
