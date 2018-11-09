package com.LFT.pojo;

import java.util.Date;
import javax.persistence.*;

@Table(name = "`user_food`")
public class UserFood {
    /**
     * 用户粮食表id
     */
    @Id
    @Column(name = "`user_food_id`")
    @GeneratedValue(generator = "JDBC")
    private Integer userFoodId;

    /**
     * 用户id
     */
    @Column(name = "`user_id`")
    private Integer userId;

    /**
     * 粮食名称
     */
    @Column(name = "`food_name`")
    private String foodName;

    /**
     * 用户粮食总数量
     */
    @Column(name = "`user_food_number`")
    private Double userFoodNumber;

    /**
     * 粮食类型
     */
    @Column(name = "`food_type`")
    private Integer foodType;

    /**
     * 用户粮食总价格
     */
    @Column(name = "`user_food_price`")
    private Double userFoodPrice;

    /**
     * 更新时间
     */
    @Column(name = "`user_food_updatetime`")
    private Date userFoodUpdatetime;

    /**
     * 获取用户粮食表id
     *
     * @return user_food_id - 用户粮食表id
     */
    public Integer getUserFoodId() {
        return userFoodId;
    }

    /**
     * 设置用户粮食表id
     *
     * @param userFoodId 用户粮食表id
     */
    public void setUserFoodId(Integer userFoodId) {
        this.userFoodId = userFoodId;
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
     * 获取用户粮食总数量
     *
     * @return user_food_number - 用户粮食总数量
     */
    public Double getUserFoodNumber() {
        return userFoodNumber;
    }

    /**
     * 设置用户粮食总数量
     *
     * @param userFoodNumber 用户粮食总数量
     */
    public void setUserFoodNumber(Double userFoodNumber) {
        this.userFoodNumber = userFoodNumber;
    }

    /**
     * 获取粮食类型
     *
     * @return food_type - 粮食类型
     */
    public Integer getFoodType() {
        return foodType;
    }

    /**
     * 设置粮食类型
     *
     * @param foodType 粮食类型
     */
    public void setFoodType(Integer foodType) {
        this.foodType = foodType;
    }

    /**
     * 获取用户粮食总价格
     *
     * @return user_food_price - 用户粮食总价格
     */
    public Double getUserFoodPrice() {
        return userFoodPrice;
    }

    /**
     * 设置用户粮食总价格
     *
     * @param userFoodPrice 用户粮食总价格
     */
    public void setUserFoodPrice(Double userFoodPrice) {
        this.userFoodPrice = userFoodPrice;
    }

    /**
     * 获取更新时间
     *
     * @return user_food_updatetime - 更新时间
     */
    public Date getUserFoodUpdatetime() {
        return userFoodUpdatetime;
    }

    /**
     * 设置更新时间
     *
     * @param userFoodUpdatetime 更新时间
     */
    public void setUserFoodUpdatetime(Date userFoodUpdatetime) {
        this.userFoodUpdatetime = userFoodUpdatetime;
    }
}