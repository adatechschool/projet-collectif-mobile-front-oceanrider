package com.oceanrider.back.repository;

import com.oceanrider.back.model.SurfSpot;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SurfRepo extends JpaRepository<SurfSpot, Long> {

}
