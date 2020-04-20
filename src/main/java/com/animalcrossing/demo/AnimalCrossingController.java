package com.animalcrossing.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

@RestController
public class AnimalCrossingController {
    @Autowired
    private BugsRepository bugsRepository;
    @Autowired
    private FishRepository fishRepository;

    @RequestMapping (value = "/api/animal-crossing", method = RequestMethod.GET)

    private Map<String, Object> getBugs (){
        Map<String, Object> dto = new HashMap<>();
        dto.put("bugs", bugsRepository.findAll().stream().sorted(Comparator.comparing(Bugs::getName)).map(this::bugsDTO));
        dto.put("fish", fishRepository.findAll().stream().map(this::fishDTO));
        return dto;
    }

    private Map<String, Object> bugsDTO (Bugs bugs){
        Map<String, Object> dto = new HashMap<>();
        dto.put("id", bugs.getId());
        dto.put("name", bugs.getName());
        dto.put("time", bugs.getTime());
        dto.put("price", bugs.getPrice());
        dto.put("location", bugs.getArea());
        dto.put("rarity", bugs.getRarity());
        dto.put("northern_hemisphere", bugs.getNorthSeason());
        dto.put("southern_hemisphere", bugs.getSouthSeason());
         return dto;
    }
    private Map<String, Object> fishDTO (Fish fish){
        Map<String, Object> dto = new HashMap<>();
        dto.put("id", fish.getId());
        dto.put("name", fish.getName());
        dto.put("price", fish.getPrice());
        dto.put("location", fish.getLocation());
        dto.put("rarity", fish.getRarity());
        dto.put("size", fish.getSize());
        dto.put("time", fish.getDate());
        dto.put("northern_hemisphere", fish.getNorthSeason());
        dto.put("southern_hemisphere", fish.getSouthSeason());

        return dto;
    }

    private Map<String, Object> makeMap(String key, Object value) {
        Map<String, Object> map = new HashMap<>();
        map.put(key, value);
        return map;
    }
}
