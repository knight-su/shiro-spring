package com.suxin.service;

import com.suxin.entity.Permission;

public interface PermissionService {

    Permission createPermission(Permission permission);

    void deletePermission(Long permissionId);
}
