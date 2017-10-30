package com.lin.annoimation;

import java.lang.annotation.*;


@Target({ElementType.TYPE,ElementType.METHOD,ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface LoginAnno {
    String value() default "login";
}
