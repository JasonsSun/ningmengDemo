package com.shiro.springboot.bean;

import java.io.Serializable;
import java.util.List;

/**
 * Created by archerlj on 2017/6/30.
 */


public class SysRole implements Serializable {

    private static final long serialVersionUID = 1L;
    private Long id; // 编号
    private String role; // 角色标识程序中判断使用,如"admin",这个是唯一的:
    private String description; // 角色描述,UI界面显示使用
    private Boolean available = Boolean.FALSE; // 是否可用,如果不可用将不会添加给用户

    private List<SysPermission> permissions;
    private List<UserInfo> userInfos;// 一个角色对应多个用户

    public List<UserInfo> getUserInfos() {
        return userInfos;
    }

    public void setUserInfos(List<UserInfo> userInfos) {
        this.userInfos = userInfos;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Boolean getAvailable() {
        return available;
    }

    public void setAvailable(Boolean available) {
        this.available = available;
    }

    public List<SysPermission> getPermissions() {
        return permissions;
    }

    public void setPermissions(List<SysPermission> permissions) {
        this.permissions = permissions;
    }
//    @Override
//    public String toString() {
//        return "SysRole [id=" + id + ", role=" + role + ", description=" + description + ", available=" + available
//                + ", permissions=" + permissions + "]";
//    }
}
