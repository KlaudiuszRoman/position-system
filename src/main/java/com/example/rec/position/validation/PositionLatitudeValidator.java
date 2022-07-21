package com.example.rec.position.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import java.util.regex.Pattern;


public class PositionLatitudeValidator implements ConstraintValidator<PositionLatitudeValid, Integer> {
    @Override
    public void initialize(PositionLatitudeValid positionLatitude) {
    }

    @Override
    public boolean isValid(Integer positionLatitude, ConstraintValidatorContext cxt) {
       if ( positionLatitude <= 900000 && positionLatitude >= -900000 ) {
           return true;
       }
       else {
           return false;
       }
    }
}