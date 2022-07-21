package com.example.rec.position.api.response;

public class PositionResponse {
    private final Long id;
    private final Long deviceId;
    private final Integer latitiude;
    private final Integer longitude;

    public PositionResponse(Long id, Long deviceId, Integer latitiude, Integer longitude) {
        this.id = id;
        this.deviceId = deviceId;
        this.latitiude = latitiude;
        this.longitude = longitude;
    }

    public Long getId() {
        return id;
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
