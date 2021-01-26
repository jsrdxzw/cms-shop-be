package com.jsrdxzw.cmsshopbe.service;

import com.jsrdxzw.cmsshopbe.model.Permission;

import java.util.List;
import java.util.Map;

/**
 * @author xuzhiwei
 * @date 2021-01-26
 */
public interface AdminService {

    /**
     * 获取结构化的权限信息
     *
     * @return Map<Module, Permission>
     */
    Map<String, List<Permission>> getAllStructuralPermissions();

}
