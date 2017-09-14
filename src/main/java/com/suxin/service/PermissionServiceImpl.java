package com.suxin.service;

import com.suxin.dao.PermissionDao;
import com.suxin.entity.Permission;
import lombok.Data;

@Data
public class PermissionServiceImpl implements PermissionService {

    private PermissionDao permissionDao;

    public Permission createPermission(Permission permission) {
        return permissionDao.createPermission(permission);
    }

    public void deletePermission(Long permissionId) {
        permissionDao.deletePermission(permissionId);
    }
}
