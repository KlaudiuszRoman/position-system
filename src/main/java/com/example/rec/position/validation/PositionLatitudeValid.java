package com.example.rec.position.validation;

import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = PositionLatitudeValidator.class)
@Target( { ElementType.METHOD, ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface PositionLatitudeValid {
    String message() default "Invalid latitude";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}