package com.oceanrider.back.controller;


import com.oceanrider.back.model.SurfSpot;
import com.oceanrider.back.service.SurfService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class APIController {

    private final SurfService surfService;

    public APIController(SurfService surfService) {
        this.surfService = surfService;
    }

    @GetMapping("/spots")
    public List<SurfSpot> findAllSpots(){
        return surfService.findAllSpots();
    }
}
