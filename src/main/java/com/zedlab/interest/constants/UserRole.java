package com.zedlab.interest.constants;

import com.google.common.collect.Sets;
import lombok.Getter;
import org.springframework.security.core.authority.SimpleGrantedAuthority;

import java.util.Set;
import java.util.stream.Collectors;

import static com.zedlab.interest.constants.UserPermissions.*;

@Getter
public enum UserRole {

    FOLLOWER(Sets.newHashSet(FOLLOWER_READ, FOLLOWER_WRITE)),
    ADVERTISER(Sets.newHashSet(FOLLOWER_READ, ADVERTISER_READ, ADVERTISER_WRITE)),
    ADMIN(Sets.newHashSet(FOLLOWER_READ, FOLLOWER_WRITE, ADVERTISER_READ, ADVERTISER_WRITE, ADMIN_READ, ADVERTISER_WRITE)),
    SUPER_ADMIN(Sets.newHashSet(FOLLOWER_READ, FOLLOWER_READ, ADVERTISER_READ, ADVERTISER_WRITE, ADMIN_READ, ADMIN_WRITE, SUPER_ADMIN_READ, SUPER_ADMIN_WRITE));

    private final Set<UserPermissions> permissions;

    UserRole(Set<UserPermissions> permissions) {
        this.permissions = permissions;
    }

    public Set<SimpleGrantedAuthority> getGrantedAuthorities() {
        Set<SimpleGrantedAuthority> authorities = getPermissions().stream()
                .map(permission -> new SimpleGrantedAuthority(permission.getPermission()))
                .collect(Collectors.toSet());
        authorities.add(new SimpleGrantedAuthority("ROLE_"+this.name()));
        return authorities;
    }
}
