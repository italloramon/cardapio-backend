package com.italloramon.cardapio.controller;

import com.italloramon.cardapio.dto.FoodRequestDTO;
import com.italloramon.cardapio.dto.FoodResponseDTO;
import com.italloramon.cardapio.service.FoodService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/foods")
@RequiredArgsConstructor
public class FoodController {
    private final FoodService foodService;

    @GetMapping
    public List<FoodResponseDTO> findAll() {
        return foodService.findAll();
    }

    @PostMapping
    public FoodResponseDTO save(@RequestBody FoodRequestDTO foodRequestDTO) {
        return foodService.save(foodRequestDTO);
    }

}
