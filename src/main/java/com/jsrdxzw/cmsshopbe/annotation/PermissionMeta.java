package com.jsrdxzw.cmsshopbe.annotation;

import java.lang.annotation.*;

/**
 * @author xuzhiwei
 * @date 2021-01-26
 */
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface PermissionMeta {
    String value();

    String module() default "";

    boolean mount() default true;
}
