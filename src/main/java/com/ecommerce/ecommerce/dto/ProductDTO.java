package com.ecommerce.ecommerce.dto;
import lombok.Data;

import java.math.BigDecimal;
import java.util.*;

@Data
public class ProductDTO {
    private Long id;
    private String name;
    private String description;
    private BigDecimal price;
    private int quantity;
    private List<CommentDTO> comments;
}
