package com.carlosoliveira.ecommerce.product;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;

public record PurchaseRequest(
        @NotNull(message = "Product should be provided.")
        Integer productId,
        
        @Positive(message = "Quantity should be provided.")
        double quantity
) {
}
