package com.zedlab.interest.constants;

import lombok.Getter;

@Getter
public enum UserPermissions {
    FOLLOWER_READ("follower:read"),
    FOLLOWER_WRITE("follower:write"),
    ADVERTISER_READ("advertiser:read"),
    ADVERTISER_WRITE("advertiser:write"),
    ADMIN_READ("admin:read"),
    ADMIN_WRITE("admin:write"),
    SUPER_ADMIN_READ("super_admin:read"),
    SUPER_ADMIN_WRITE("super_admin:write");

    private final String permission;

    UserPermissions(String permission) {
        this.permission = permission;
    }
}
