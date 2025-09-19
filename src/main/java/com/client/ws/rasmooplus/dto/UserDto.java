package com.client.ws.rasmooplus.dto;

import com.client.ws.rasmooplus.model.SubscriptionsType;
import com.client.ws.rasmooplus.model.UserType;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.br.CPF;

import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserDto {
    private Long id;

    @NotBlank(message = "cannot be is null")
    private String name;

    @Email(message = "email is invalid")
    private String email;

    @NotBlank(message = "cannot be is null")
    @Size(min = 11, message = "min of the 11 numbers")
    private String phone;

    @CPF(message = "cpf is invalid")
    private String cpf;

    private LocalDate dtSubscription = LocalDate.now();

    private LocalDate dtExpiration = LocalDate.now();

    private Long userTypeId;

    private Long subscriptionsTypeId;
}
