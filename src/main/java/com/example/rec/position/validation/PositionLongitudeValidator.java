package com.example.rec.position.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class PositionLongitudeValidator implements ConstraintValidator<PositionLongitudeValid, Integer> {
    @Override
    public void initialize(PositionLongitudeValid positionLongitude) {
    }

    @Override
    public boolean isValid(Integer positionLongitude, ConstraintValidatorContext cxt) {

        if ( positionLongitude <= 1800000 && positionLongitude >= -1800000 ) {
            return true;
        }
        else {
            return false;
        }
    }
}