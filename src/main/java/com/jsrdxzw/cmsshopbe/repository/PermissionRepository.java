package com.jsrdxzw.cmsshopbe.repository;

import com.jsrdxzw.cmsshopbe.model.Permission;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @author xuzhiwei
 * @date 2021-01-26
 */
public interface PermissionRepository extends JpaRepository<Permission, Long> {
    /**
     * getAllByMount
     *
     * @param mount
     * @return
     */
    List<Permission> getAllByMount(Boolean mount);
}
