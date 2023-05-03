package com.italloramon.cardapio.model;

import com.italloramon.cardapio.dto.FoodRequestDTO;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter @Setter
@NoArgsConstructor @AllArgsConstructor
@Entity
public class Food {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private Double price;
    private String imageUrl;

    public Food(FoodRequestDTO foodRequestDTO) {
        this.title = foodRequestDTO.title();
        this.price = foodRequestDTO.price();
        this.imageUrl = foodRequestDTO.imageUrl();
    }
}
