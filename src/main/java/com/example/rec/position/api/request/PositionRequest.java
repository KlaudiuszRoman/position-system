package com.example.rec.position.api.request;

import com.fasterxml.jackson.annotation.JsonCreator;

public class PositionRequest {
    private final Long deviceId;
    private final Integer latitiude;
    private final Integer longitude;

    @JsonCreator
    public PositionRequest(Long deviceId, Integer latitiude, Integer longitude) {
        this.deviceId = deviceId;
        this.latitiude = latitiude;
        this.longitude = longitude;

    }

    public Long getDeviceId() {
        return deviceId;
    }

    public Integer getLatitiude() {
        return latitiude;
    }

    public Integer getLongitude() {
        return longitude;
    }
}
