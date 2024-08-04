package com.medlife.api.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import javax.validation.Payload;
import javax.validation.Constraint;

/**
 * @author Abhay
 *
 */

@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.FIELD, ElementType.METHOD, ElementType.PARAMETER })
@Constraint(validatedBy = NotBeforeCurrentDateValidator.class)
public @interface NotBeforeCurrentDate {

    String message() default "Date cannot be before the current date";

    Class<?>[] groups() default {};

    Class<? extends Payload>[] payload() default {};
}
