package com.ecommerce.ecommerce.dto;

import lombok.Data;

import java.time.LocalDateTime;
import java.util.*;
import com.ecommerce.ecommerce.model.Order;

@Data
public class OrderDTO {
    private Long id;
    private Long userId;
    private String address;
    private String phoneNumber;
    private Order.OrderStatus status;
    private LocalDateTime createdAt;
    private List<OrderItemDTO> order;
}
