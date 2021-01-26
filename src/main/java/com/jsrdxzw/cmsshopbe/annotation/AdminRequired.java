package com.jsrdxzw.cmsshopbe.annotation;

import com.jsrdxzw.cmsshopbe.enumeration.UserLevel;

import java.lang.annotation.*;

/**
 * @author xuzhiwei
 * @date 2021-01-26
 */
@Target({ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Required(
        level = UserLevel.ADMIN
)
public @interface AdminRequired {

}
