package com.jsrdxzw.cmsshopbe.annotation;

import java.lang.annotation.*;

/**
 * @author xuzhiwei
 * @date 2021-01-26
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface PermissionModule {
    String value() default "";
}
