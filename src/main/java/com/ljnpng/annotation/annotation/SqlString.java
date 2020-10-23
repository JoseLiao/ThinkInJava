package com.ljnpng.annotation.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @Classname Constraints
 * @Description String 字段
 * @Author liaojp
 * @Date 2020/10/23 16:28
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface SqlString {
    int value();

    String name() default "";

    Constraints constraints() default @Constraints;
}
