package com.client.ws.rasmooplus.dto;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class SubscriptionTypeDto {
    private Long id;

    @NotBlank(message = "cannot be is null")
    private String name;

    @Max(value = 12, message = "max value be is 12")
    private Long accessMonths;

    @NotBlank(message = "cannot be is null")
    private BigDecimal price;

    @NotBlank(message = "cannot be is null")
    @Size(min = 5, max = 15, message = "min 5 max 15")
    private String productKey;
}
