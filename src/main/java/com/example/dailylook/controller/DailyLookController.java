package com.example.dailylook.controller;

import com.example.dailylook.model.ClothingItem;
import com.example.dailylook.model.User;
import com.example.dailylook.repository.ClothingItemRepository;
import com.example.dailylook.repository.UserRepository;
import com.example.dailylook.service.RecommendationService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class DailyLookController {

    private final UserRepository userRepo;
    private final ClothingItemRepository clothingRepo;
    private final RecommendationService recommendationService;

    public DailyLookController(UserRepository userRepo, ClothingItemRepository clothingRepo, RecommendationService recommendationService) {
        this.userRepo = userRepo;
        this.clothingRepo = clothingRepo;
        this.recommendationService = recommendationService;
    }

    @PostMapping("/user")
    public User createUser(@RequestBody User user) {
        return userRepo.save(user);
    }

    @PostMapping("/clothing")
    public ClothingItem addClothing(@RequestBody ClothingItem item) {
        return clothingRepo.save(item);
    }

    @GetMapping("/recommend")
    public String recommend(
            @RequestParam String season,
            @RequestParam String occasion
    ) {
        List<ClothingItem> items = clothingRepo.findAll();
        return recommendationService.recommend(items, season, occasion);
    }
}