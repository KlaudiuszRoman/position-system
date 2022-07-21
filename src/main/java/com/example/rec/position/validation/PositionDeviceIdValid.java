package com.example.rec.position.validation;



import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.*;

@Documented
@Constraint(validatedBy = PositionDeviceIdValidator.class)
@Target( { ElementType.METHOD, ElementType.FIELD })
@Retention(RetentionPolicy.RUNTIME)
public @interface PositionDeviceIdValid {
    String message() default "Invalid device id";
    Class<?>[] groups() default {};
    Class<? extends Payload>[] payload() default {};
}
