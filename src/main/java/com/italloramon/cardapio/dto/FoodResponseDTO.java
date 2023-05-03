package com.italloramon.cardapio.dto;

import com.italloramon.cardapio.model.Food;

public record FoodResponseDTO(Long id,
                              String title,
                              Double price,
                              String imageUrl) {
    public FoodResponseDTO(Food food) {
        this(food.getId(), food.getTitle(), food.getPrice(), food.getImageUrl());
    }
}
