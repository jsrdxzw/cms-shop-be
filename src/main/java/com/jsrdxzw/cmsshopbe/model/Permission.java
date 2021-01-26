package com.jsrdxzw.cmsshopbe.model;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * @author xuzhiwei
 * @date 2021-01-26
 */
@EqualsAndHashCode(callSuper = true)
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "cms_permission")
public class Permission extends BaseModel {
    /**
     * 权限名称，例如：访问首页
     */
    private String name;

    /**
     * 权限所属模块，例如：人员管理
     */
    private String module;

    /**
     * 0：关闭 1：开启
     */
    private Boolean mount;
}
