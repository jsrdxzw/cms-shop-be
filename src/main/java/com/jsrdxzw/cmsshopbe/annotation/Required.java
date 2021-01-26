package com.jsrdxzw.cmsshopbe.annotation;

import com.jsrdxzw.cmsshopbe.enumeration.UserLevel;

import java.lang.annotation.*;

/**
 * @author xuzhiwei
 * @date 2021-01-26
 */
@Target({ElementType.METHOD, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface Required {
    UserLevel level() default UserLevel.TOURIST;
}
