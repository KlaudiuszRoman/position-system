package com.example.rec.position.api;

import com.example.rec.position.api.request.PositionRequest;
import com.example.rec.position.api.response.PositionResponse;
import com.example.rec.position.service.PositionService;
//import io.swagger.annotations.Api;
//import io.swagger.annotations.ApiOperation;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
//@Api(tags = "Positions")
@RequestMapping("/api/positions")
public class PositionApi {

    private final PositionService positionService;

    PositionApi(PositionService positionService) {
        this.positionService = positionService;
    }

    @PostMapping
    //@ApiOperation("Create position")
    public ResponseEntity<PositionResponse> create(@Valid @RequestBody PositionRequest positionRequest) {
        PositionResponse positionResponse = positionService.create(positionRequest);
        return ResponseEntity.status(HttpStatus.CREATED).body(positionResponse);
    }
}
