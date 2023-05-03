package com.italloramon.cardapio.repository;

import com.italloramon.cardapio.model.Food;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FoodRepository extends JpaRepository<Food, Long> {
}
