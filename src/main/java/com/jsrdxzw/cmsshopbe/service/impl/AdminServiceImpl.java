package com.jsrdxzw.cmsshopbe.service.impl;

import com.jsrdxzw.cmsshopbe.model.Permission;
import com.jsrdxzw.cmsshopbe.service.AdminService;
import com.jsrdxzw.cmsshopbe.service.PermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author xuzhiwei
 * @date 2021-01-26
 */
@Service
public class AdminServiceImpl implements AdminService {

    @Autowired
    private PermissionService permissionService;

    @Override
    public Map<String, List<Permission>> getAllStructuralPermissions() {
        List<Permission> allPermissions = permissionService.getAllPermissions();
        Map<String, List<Permission>> res = new HashMap<>();
        for (Permission permission : allPermissions) {
            if (res.containsKey(permission.getModule())) {
                res.get(permission.getModule()).add(permission);
            } else {
                List<Permission> l = new ArrayList<>();
                l.add(permission);
                res.put(permission.getModule(), l);
            }
        }
        return res;
    }
}
