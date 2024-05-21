package com.oceanrider.back.service;

import com.oceanrider.back.model.SurfSpot;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
@Service
public interface SurfService {

    List<SurfSpot> findAllSpots();
    Optional<SurfSpot> findSpotById(Long id);
    SurfSpot saveSurfSpot(SurfSpot surfSpot);
    void deleteSpot(Long id);


    void deleteAllSpots();
}
