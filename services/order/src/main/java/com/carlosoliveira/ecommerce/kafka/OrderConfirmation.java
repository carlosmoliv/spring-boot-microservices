package com.carlosoliveira.ecommerce.kafka;

import com.carlosoliveira.ecommerce.customer.CustomerResponse;
import com.carlosoliveira.ecommerce.order.PaymentMethod;
import com.carlosoliveira.ecommerce.product.PurchaseResponse;

import java.math.BigDecimal;
import java.util.List;

public record OrderConfirmation(
        String orderReference,
        BigDecimal totalAmount,
        PaymentMethod paymentMethod,
        CustomerResponse customer,
        List<PurchaseResponse> products
) {
}
