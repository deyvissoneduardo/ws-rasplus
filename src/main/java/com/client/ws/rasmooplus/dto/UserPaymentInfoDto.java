package com.client.ws.rasmooplus.dto;

import com.client.ws.rasmooplus.model.User;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.time.LocalDate;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class UserPaymentInfoDto {

    private Long id;

    @NotNull(message = "is not null")
    @Size(min = 16, max = 16)
    private String cardNumber;

    @NotNull(message = "is not null")
    @Size(min = 1, max = 12)
    private Long cardExpirationMonth;

    private Long cardExpirationYear;

    @NotNull(message = "is not null")
    @Size(min = 3, max = 3)
    private String cardSecurityCode;

    private BigDecimal price;

    private Long instalments;

    private LocalDate dtPayment = LocalDate.now();

    @NotNull(message = "is not null")
    private Long userId;
}
