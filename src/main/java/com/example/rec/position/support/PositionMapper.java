package com.example.rec.position.support;

import com.example.rec.position.api.request.PositionRequest;
import com.example.rec.position.api.request.UpdatePositionRequest;
import com.example.rec.position.api.response.PositionResponse;
import com.example.rec.position.domain.Position;
import org.springframework.stereotype.Component;

@Component
public class PositionMapper {

    public Position toPosition(PositionRequest positionRequest) {

        return new Position(positionRequest.getDeviceId(),
                positionRequest.getLatitiude(),
                positionRequest.getLongitude());
    }

    public Position toPosition(Position position, UpdatePositionRequest positionRequest) {
        position.setDeviceId(positionRequest.getDeviceId());
        position.setLatitiude(positionRequest.getLatitiude());
        position.setLongitude(positionRequest.getLongitude());
        return position;
    }

    public PositionResponse toPositionResponse(Position position) {
        return new PositionResponse(position.getId(), position.getDeviceId(), position.getLatitiude(), position.getLongitude());
    }
}
