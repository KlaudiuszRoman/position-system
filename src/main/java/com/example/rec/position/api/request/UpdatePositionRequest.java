package com.example.rec.position.api.request;

import com.fasterxml.jackson.annotation.JsonCreator;

public class UpdatePositionRequest extends PositionRequest {
    private final Long id;

    @JsonCreator
    public UpdatePositionRequest(Long deviceId,  Integer latitiude, Integer longitude, Long id) {
        super(deviceId, latitiude, longitude);
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
