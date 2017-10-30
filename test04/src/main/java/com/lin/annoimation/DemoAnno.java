package com.lin.annoimation;

import java.lang.annotation.*;

@Target({ElementType.METHOD,ElementType.TYPE})
@Documented
@Retention(RetentionPolicy.RUNTIME)
public @interface DemoAnno {
    String value() default "";
}
