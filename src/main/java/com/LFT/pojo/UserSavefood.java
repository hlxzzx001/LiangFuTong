package com.LFT.pojo;

import java.util.Date;
import javax.persistence.*;

@Table(name = "`user_savefood`")
public class UserSavefood {
    /**
     * 用户存粮id
     */
    @Id
    @Column(name = "`user_savefood_id`")
    @GeneratedValue(generator = "JDBC")
    private String userSavefoodId;

    /**
     * 用户id
     */
    @Column(name = "`user_id`")
    private Integer userId;

    /**
     * 1提粮 或 2存粮 3提现
     */
    @Column(name = "`user_savefood_type`")
    private Integer userSavefoodType;

    /**
     * 粮食名称
     */
    @Column(name = "`food_name`")
    private String foodName;

    /**
     * 粮食id
     */
    @Column(name = "`food_id`")
    private String foodId;

    /**
     * 粮食类型
     */
    @Column(name = "`food_type`")
    private String foodType;

    /**
     * 提现金额
     */
    @Column(name = "`food_carrycash`")
    private Double foodCarrycash;

    /**
     * 数量
     */
    @Column(name = "`food_carrynumber`")
    private Double foodCarrynumber;

    /**
     * 粮食总价
     */
    @Column(name = "`user_savefood_price`")
    private Double userSavefoodPrice;

    /**
     * 时间
     */
    @Column(name = "`user_savefood_time`")
    private Date userSavefoodTime;

    /**
     * 交易地点
     */
    @Column(name = "`user_savefood_store`")
    private String userSavefoodStore;

    /**
     * 状态
     */
    @Column(name = "`user_savefood_status`")
    private Integer userSavefoodStatus;

    /**
     * 管理员id
     */
    @Column(name = "`admin_id`")
    private Integer adminId;

    /**
     * 获取用户存粮id
     *
     * @return user_savefood_id - 用户存粮id
     */
    public String getUserSavefoodId() {
        return userSavefoodId;
    }

    /**
     * 设置用户存粮id
     *
     * @param userSavefoodId 用户存粮id
     */
    public void setUserSavefoodId(String userSavefoodId) {
        this.userSavefoodId = userSavefoodId;
    }

    /**
     * 获取用户id
     *
     * @return user_id - 用户id
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * 设置用户id
     *
     * @param userId 用户id
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * 获取1提粮 或 2存粮 3提现
     *
     * @return user_savefood_type - 1提粮 或 2存粮 3提现
     */
    public Integer getUserSavefoodType() {
        return userSavefoodType;
    }

    /**
     * 设置1提粮 或 2存粮 3提现
     *
     * @param userSavefoodType 1提粮 或 2存粮 3提现
     */
    public void setUserSavefoodType(Integer userSavefoodType) {
        this.userSavefoodType = userSavefoodType;
    }

    /**
     * 获取粮食名称
     *
     * @return food_name - 粮食名称
     */
    public String getFoodName() {
        return foodName;
    }

    /**
     * 设置粮食名称
     *
     * @param foodName 粮食名称
     */
    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    /**
     * 获取粮食id
     *
     * @return food_id - 粮食id
     */
    public String getFoodId() {
        return foodId;
    }

    /**
     * 设置粮食id
     *
     * @param foodId 粮食id
     */
    public void setFoodId(String foodId) {
        this.foodId = foodId;
    }

    /**
     * 获取粮食类型
     *
     * @return food_type - 粮食类型
     */
    public String getFoodType() {
        return foodType;
    }

    /**
     * 设置粮食类型
     *
     * @param foodType 粮食类型
     */
    public void setFoodType(String foodType) {
        this.foodType = foodType;
    }

    /**
     * 获取提现金额
     *
     * @return food_carrycash - 提现金额
     */
    public Double getFoodCarrycash() {
        return foodCarrycash;
    }

    /**
     * 设置提现金额
     *
     * @param foodCarrycash 提现金额
     */
    public void setFoodCarrycash(Double foodCarrycash) {
        this.foodCarrycash = foodCarrycash;
    }

    /**
     * 获取数量
     *
     * @return food_carrynumber - 数量
     */
    public Double getFoodCarrynumber() {
        return foodCarrynumber;
    }

    /**
     * 设置数量
     *
     * @param foodCarrynumber 数量
     */
    public void setFoodCarrynumber(Double foodCarrynumber) {
        this.foodCarrynumber = foodCarrynumber;
    }

    /**
     * 获取粮食总价
     *
     * @return user_savefood_price - 粮食总价
     */
    public Double getUserSavefoodPrice() {
        return userSavefoodPrice;
    }

    /**
     * 设置粮食总价
     *
     * @param userSavefoodPrice 粮食总价
     */
    public void setUserSavefoodPrice(Double userSavefoodPrice) {
        this.userSavefoodPrice = userSavefoodPrice;
    }

    /**
     * 获取时间
     *
     * @return user_savefood_time - 时间
     */
    public Date getUserSavefoodTime() {
        return userSavefoodTime;
    }

    /**
     * 设置时间
     *
     * @param userSavefoodTime 时间
     */
    public void setUserSavefoodTime(Date userSavefoodTime) {
        this.userSavefoodTime = userSavefoodTime;
    }

    /**
     * 获取交易地点
     *
     * @return user_savefood_store - 交易地点
     */
    public String getUserSavefoodStore() {
        return userSavefoodStore;
    }

    /**
     * 设置交易地点
     *
     * @param userSavefoodStore 交易地点
     */
    public void setUserSavefoodStore(String userSavefoodStore) {
        this.userSavefoodStore = userSavefoodStore;
    }

    /**
     * 获取状态
     *
     * @return user_savefood_status - 状态
     */
    public Integer getUserSavefoodStatus() {
        return userSavefoodStatus;
    }

    /**
     * 设置状态
     *
     * @param userSavefoodStatus 状态
     */
    public void setUserSavefoodStatus(Integer userSavefoodStatus) {
        this.userSavefoodStatus = userSavefoodStatus;
    }

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
}