package com.jsrdxzw.cmsshopbe.service;

import com.jsrdxzw.cmsshopbe.model.Permission;

import java.util.List;

/**
 * @author xuzhiwei
 * @date 2021-01-26
 */
public interface PermissionService {
    /**
     * 获取所有的权限信息
     *
     * @return
     * @param mount
     */
    List<Permission> getAllPermissions(Boolean mount);
}
