package com.example.rec.position.service;

import com.example.rec.position.api.request.PositionRequest;
import com.example.rec.position.api.response.PositionResponse;
import com.example.rec.position.domain.Position;
import com.example.rec.position.repository.PositionRepository;
import com.example.rec.position.support.PositionMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import javax.validation.ConstraintViolationException;
import java.net.http.HttpResponse;

@Service
public class PositionService {

    private final PositionRepository positionRepository;
    private final PositionMapper positionMapper;

    public PositionService(PositionRepository positionRepository, PositionMapper positionMapper) {
        this.positionRepository = positionRepository;
        this.positionMapper = positionMapper;
    }

    public PositionResponse create(PositionRequest positionRequest) {
        Position position = positionRepository.save(positionMapper.toPosition(positionRequest));
        return positionMapper.toPositionResponse(position);

    }
}