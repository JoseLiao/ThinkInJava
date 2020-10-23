package com.ljnpng.annotation.annotation;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @Classname Constraints
 * @Description 关键字
 * @Author liaojp
 * @Date 2020/10/23 16:28
 */
@Documented
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.FIELD)
public @interface Constraints {
    boolean primaryKey() default false;
    boolean unique() default false;
    boolean allowNull() default true;
}
