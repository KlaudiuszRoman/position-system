package com.example.rec.position.repository;

import com.example.rec.position.domain.Position;
import org.springframework.data.jpa.repository.JpaRepository;


public interface PositionRepository extends JpaRepository<Position, Long> {
}
