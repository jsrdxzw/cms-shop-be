package com.jsrdxzw.cmsshopbe.controller;

import com.jsrdxzw.cmsshopbe.annotation.AdminRequired;
import com.jsrdxzw.cmsshopbe.annotation.PermissionMeta;
import com.jsrdxzw.cmsshopbe.annotation.PermissionModule;
import com.jsrdxzw.cmsshopbe.model.Permission;
import com.jsrdxzw.cmsshopbe.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * @author xuzhiwei
 * @date 2021-01-26
 */
@Validated
@RestController
@RequestMapping("/cms/admin")
@PermissionModule(value = "管理员")
public class AdminController {
    @Autowired
    private AdminService adminService;

    @AdminRequired
    @GetMapping("/permission")
    @PermissionMeta(value = "查询所有可分配的权限", mount = false)
    public Map<String, List<Permission>> permission() {
        return adminService.getAllStructuralPermissions();
    }
}
