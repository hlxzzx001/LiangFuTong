package com.LFT.pojo;

import javax.persistence.*;

@Table(name = "`admin`")
public class Admin {
    /**
     * 管理员id
     */
    @Id
    @Column(name = "`admin_id`")
    @GeneratedValue(generator = "JDBC")
    private Integer adminId;

    /**
     * 管理员账号
     */
    @Column(name = "`admin_account`")
    private String adminAccount;

    /**
     * 管理员密码
     */
    @Column(name = "`admin_password`")
    private String adminPassword;

    /**
     * 管理员权限
     */
    @Column(name = "`admin_permissions`")
    private Integer adminPermissions;

    /**
     * 管理员类型
     */
    @Column(name = "`admin_type`")
    private Integer adminType;

    /**
     * 管理员称谓
     */
    @Column(name = "`admin_nickname`")
    private String adminNickname;

    /**
     * 所属门店或仓库
     */
    @Column(name = "`admin_store`")
    private String adminStore;

    /**
     * 获取管理员id
     *
     * @return admin_id - 管理员id
     */
    public Integer getAdminId() {
        return adminId;
    }

    /**
     * 设置管理员id
     *
     * @param adminId 管理员id
     */
    public void setAdminId(Integer adminId) {
        this.adminId = adminId;
    }

    /**
     * 获取管理员账号
     *
     * @return admin_account - 管理员账号
     */
    public String getAdminAccount() {
        return adminAccount;
    }

    /**
     * 设置管理员账号
     *
     * @param adminAccount 管理员账号
     */
    public void setAdminAccount(String adminAccount) {
        this.adminAccount = adminAccount;
    }

    /**
     * 获取管理员密码
     *
     * @return admin_password - 管理员密码
     */
    public String getAdminPassword() {
        return adminPassword;
    }

    /**
     * 设置管理员密码
     *
     * @param adminPassword 管理员密码
     */
    public void setAdminPassword(String adminPassword) {
        this.adminPassword = adminPassword;
    }

    /**
     * 获取管理员权限
     *
     * @return admin_permissions - 管理员权限
     */
    public Integer getAdminPermissions() {
        return adminPermissions;
    }

    /**
     * 设置管理员权限
     *
     * @param adminPermissions 管理员权限
     */
    public void setAdminPermissions(Integer adminPermissions) {
        this.adminPermissions = adminPermissions;
    }

    /**
     * 获取管理员类型
     *
     * @return admin_type - 管理员类型
     */
    public Integer getAdminType() {
        return adminType;
    }

    /**
     * 设置管理员类型
     *
     * @param adminType 管理员类型
     */
    public void setAdminType(Integer adminType) {
        this.adminType = adminType;
    }

    /**
     * 获取管理员称谓
     *
     * @return admin_nickname - 管理员称谓
     */
    public String getAdminNickname() {
        return adminNickname;
    }

    /**
     * 设置管理员称谓
     *
     * @param adminNickname 管理员称谓
     */
    public void setAdminNickname(String adminNickname) {
        this.adminNickname = adminNickname;
    }

    /**
     * 获取所属门店或仓库
     *
     * @return admin_store - 所属门店或仓库
     */
    public String getAdminStore() {
        return adminStore;
    }

    /**
     * 设置所属门店或仓库
     *
     * @param adminStore 所属门店或仓库
     */
    public void setAdminStore(String adminStore) {
        this.adminStore = adminStore;
    }
}