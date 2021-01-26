package com.jsrdxzw.cmsshopbe.service.impl;

import com.jsrdxzw.cmsshopbe.model.Permission;
import com.jsrdxzw.cmsshopbe.repository.PermissionRepository;
import com.jsrdxzw.cmsshopbe.service.PermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author xuzhiwei
 * @date 2021-01-26
 */
@Service
public class PermissionServiceImpl implements PermissionService {
    @Autowired
    private PermissionRepository permissionRepository;

    @Override
    public List<Permission> getAllPermissions(Boolean mount) {
        return permissionRepository.getAllByMount(mount);
    }
}
