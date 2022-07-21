package com.example.rec.position.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class PositionDeviceIdValidator implements ConstraintValidator<PositionDeviceIdValid, Long> {
    @Override
    public void initialize(PositionDeviceIdValid positionDeviceId) {
    }

    @Override
    public boolean isValid(Long positionDeviceId, ConstraintValidatorContext cxt) {
        if (positionDeviceId >= 100000000l && positionDeviceId <= 999999999l) {
            return true;
        }
        else {
            return false;
        }
    }
}
