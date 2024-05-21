package com.oceanrider.back.service;

import com.oceanrider.back.model.SurfSpot;
import com.oceanrider.back.repository.SurfRepo;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class SurfServiceImpl implements SurfService{

    private final SurfRepo surfRepo;

    public SurfServiceImpl(SurfRepo surfRepo) {
        this.surfRepo = surfRepo;
    }

    /**
     * @return
     */
    @Override
    public List<SurfSpot> findAllSpots() {
        return surfRepo.findAll();
    }

    /**
     * @param id
     * @return
     */
    @Override
    public Optional<SurfSpot> findSpotById(Long id) {
        return surfRepo.findById(id);
    }

    /**
     * @param surfSpot
     * @return
     */
    @Override
    public SurfSpot saveSurfSpot(SurfSpot surfSpot) {
        return surfRepo.save(surfSpot);
    }

    /**
     * @param id
     */
    @Override
    public void deleteSpot(Long id) {
        surfRepo.deleteById(id);
    }

    @Override
    public void deleteAllSpots() {
        surfRepo.deleteAll();
    }
}
