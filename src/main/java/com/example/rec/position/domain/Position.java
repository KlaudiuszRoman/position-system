package com.example.rec.position.domain;

import com.example.rec.position.validation.PositionDeviceIdValid;
import com.example.rec.position.validation.PositionLatitudeValid;
import com.example.rec.position.validation.PositionLongitudeValid;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name = "positions")
public class Position {

    @Id
    @GeneratedValue
    private Long id;
    @PositionDeviceIdValid
    private Long deviceId;
    @PositionLatitudeValid
    private Integer latitiude;
    @PositionLongitudeValid
    private Integer longitude;

    public Position() {
    }

    public Position(Long deviceId, Integer latitiude, Integer longitude) {
        this.deviceId = deviceId;
        this.latitiude = latitiude;
        this.longitude = longitude;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(Long deviceId) {
        this.deviceId = deviceId;
    }

    public Integer getLatitiude() {
        return latitiude;
    }

    public void setLatitiude(Integer latitiude) {
        this.latitiude = latitiude;
    }

    public Integer getLongitude() {
        return longitude;
    }

    public void setLongitude(Integer longitude) {
        this.longitude = longitude;
    }
}
