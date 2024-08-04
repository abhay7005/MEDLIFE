package com.medlife.api.aop;

import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
/**
 * @author Abhay
 *
 */
@Retention(RUNTIME)
@Target(ElementType.METHOD)
public @interface TrackExecutionTime {

}
