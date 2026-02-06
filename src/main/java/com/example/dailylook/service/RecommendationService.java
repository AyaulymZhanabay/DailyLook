package com.example.dailylook.service;

import com.example.dailylook.model.ClothingItem;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class RecommendationService {

    public String recommend(List<ClothingItem> items, String season, String occasion) {

        List<ClothingItem> suitable = items.stream()
                .filter(i -> i.getSeason().equalsIgnoreCase(season) || i.getSeason().equalsIgnoreCase("ALL"))
                .filter(i -> i.getOccasion().equalsIgnoreCase(occasion))
                .toList();

        List<ClothingItem> tops = suitable.stream()
                .filter(i -> i.getType().equalsIgnoreCase("TOP"))
                .toList();

        List<ClothingItem> bottoms = suitable.stream()
                .filter(i -> i.getType().equalsIgnoreCase("BOTTOM"))
                .toList();

        if (tops.isEmpty() || bottoms.isEmpty()) {
            return "Not enough suitable clothes 😢";
        }

        return "Try wearing: " + tops.get(0).getName() + " + " + bottoms.get(0).getName();
    }
}