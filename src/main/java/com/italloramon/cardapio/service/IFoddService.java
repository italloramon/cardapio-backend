package com.italloramon.cardapio.service;

import com.italloramon.cardapio.dto.FoodRequestDTO;
import com.italloramon.cardapio.dto.FoodResponseDTO;
import com.italloramon.cardapio.model.Food;

import java.util.List;

public interface IFoddService {
    List<FoodResponseDTO> findAll();

    FoodResponseDTO save(FoodRequestDTO foodRequestDTO);
}
