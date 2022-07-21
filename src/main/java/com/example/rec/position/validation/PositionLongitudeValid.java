package com.example.rec.position.validation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = PositionLongitudeValidator.class)
@Target( { ElementType.METHOD, ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface PositionLongitudeValid {
    String message() default "Invalid longitude";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}