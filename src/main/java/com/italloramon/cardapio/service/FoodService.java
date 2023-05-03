package com.italloramon.cardapio.service;

import com.italloramon.cardapio.dto.FoodRequestDTO;
import com.italloramon.cardapio.dto.FoodResponseDTO;
import com.italloramon.cardapio.model.Food;
import com.italloramon.cardapio.repository.FoodRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@RequiredArgsConstructor
@Service
public class FoodService implements IFoddService{

    private final FoodRepository foodRepository;
    @Override
    public List<FoodResponseDTO> findAll() {
        return foodRepository.findAll().stream().map(FoodResponseDTO::new).toList();
    }

    @Override
    public FoodResponseDTO save(FoodRequestDTO foodRequestDTO) {
        return new FoodResponseDTO(foodRepository.save(new Food(foodRequestDTO)));
    }
}
