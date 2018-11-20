package com.LFT.pojo;

import javax.persistence.*;

@Table(name = "`food`")
public class Food {
    /**
     * 粮食id
     */
    @Id
    @Column(name = "`food_id`")
    @GeneratedValue(generator = "JDBC")
    private Integer foodId;

    /**
     * 粮食自定义名称
     */
    @Column(name = "`food_name`")
    private String foodName;

    /**
     * 粮食现金汇率
     */
    @Column(name = "`food_cashrate`")
    private Double foodCashrate;

    /**
     * 粮食之间的汇率
     */
    @Column(name = "`food_foodrate`")
    private Integer foodFoodrate;

    /**
     * 粮食类型
     */
    @Column(name = "`food_type`")
    private Integer foodType;

    /**
     * 粮食类别（二级分类）
     */
    @Column(name = "`food_category`")
    private String foodCategory;

    /**
     * 粮食等级（三级分类）
     */
    @Column(name = "`food_level`")
    private String foodLevel;

    /**
     * 粮食含水量
     */
    @Column(name = "`food_watercontent`")
    private Integer foodWatercontent;

    /**
     * 粮食价格
     */
    @Column(name = "`food_price`")
    private Double foodPrice;

    /**
     * 获取粮食id
     *
     * @return food_id - 粮食id
     */
    public Integer getFoodId() {
        return foodId;
    }

    /**
     * 设置粮食id
     *
     * @param foodId 粮食id
     */
    public void setFoodId(Integer foodId) {
        this.foodId = foodId;
    }

    /**
     * 获取粮食自定义名称
     *
     * @return food_name - 粮食自定义名称
     */
    public String getFoodName() {
        return foodName;
    }

    /**
     * 设置粮食自定义名称
     *
     * @param foodName 粮食自定义名称
     */
    public void setFoodName(String foodName) {
        this.foodName = foodName;
    }

    /**
     * 获取粮食现金汇率
     *
     * @return food_cashrate - 粮食现金汇率
     */
    public Double getFoodCashrate() {
        return foodCashrate;
    }

    /**
     * 设置粮食现金汇率
     *
     * @param foodCashrate 粮食现金汇率
     */
    public void setFoodCashrate(Double foodCashrate) {
        this.foodCashrate = foodCashrate;
    }

    /**
     * 获取粮食之间的汇率
     *
     * @return food_foodrate - 粮食之间的汇率
     */
    public Integer getFoodFoodrate() {
        return foodFoodrate;
    }

    /**
     * 设置粮食之间的汇率
     *
     * @param foodFoodrate 粮食之间的汇率
     */
    public void setFoodFoodrate(Integer foodFoodrate) {
        this.foodFoodrate = foodFoodrate;
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
     * 获取粮食类别（二级分类）
     *
     * @return food_category - 粮食类别（二级分类）
     */
    public String getFoodCategory() {
        return foodCategory;
    }

    /**
     * 设置粮食类别（二级分类）
     *
     * @param foodCategory 粮食类别（二级分类）
     */
    public void setFoodCategory(String foodCategory) {
        this.foodCategory = foodCategory;
    }

    /**
     * 获取粮食等级（三级分类）
     *
     * @return food_level - 粮食等级（三级分类）
     */
    public String getFoodLevel() {
        return foodLevel;
    }

    /**
     * 设置粮食等级（三级分类）
     *
     * @param foodLevel 粮食等级（三级分类）
     */
    public void setFoodLevel(String foodLevel) {
        this.foodLevel = foodLevel;
    }

    /**
     * 获取粮食含水量
     *
     * @return food_watercontent - 粮食含水量
     */
    public Integer getFoodWatercontent() {
        return foodWatercontent;
    }

    /**
     * 设置粮食含水量
     *
     * @param foodWatercontent 粮食含水量
     */
    public void setFoodWatercontent(Integer foodWatercontent) {
        this.foodWatercontent = foodWatercontent;
    }

    /**
     * 获取粮食价格
     *
     * @return food_price - 粮食价格
     */
    public Double getFoodPrice() {
        return foodPrice;
    }

    /**
     * 设置粮食价格
     *
     * @param foodPrice 粮食价格
     */
    public void setFoodPrice(Double foodPrice) {
        this.foodPrice = foodPrice;
    }
}