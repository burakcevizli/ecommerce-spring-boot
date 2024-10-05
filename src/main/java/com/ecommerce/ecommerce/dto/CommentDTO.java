package com.ecommerce.ecommerce.dto;

import lombok.Data;

@Data
public class CommentDTO {
    private Long id;
    private String content;
    private int score;
    private int userId;
}
