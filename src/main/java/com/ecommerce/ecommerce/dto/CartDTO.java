package com.ecommerce.ecommerce.dto;
import lombok.Data;

import java.util.*;

@Data
public class CartDTO {
    private Long id;
    private Long userId;
    private List<CartItemDTO> items;
}
