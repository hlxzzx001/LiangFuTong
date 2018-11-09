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
     * 粮食名称
     */
    @Column(name = "`food_name`")
    private String foodName;

    /**
     * 粮食库存
     */
    @Column(name = "`food_repertory`")
    private Double foodRepertory;

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
     * 粮食价格
     */
    @Column(name = "`food_price`")
    private Double foodPrice;

    /**
     * 粮食所属门店
     */
    @Column(name = "`food_store`")
    private String foodStore;

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
     * 获取粮食库存
     *
     * @return food_repertory - 粮食库存
     */
    public Double getFoodRepertory() {
        return foodRepertory;
    }

    /**
     * 设置粮食库存
     *
     * @param foodRepertory 粮食库存
     */
    public void setFoodRepertory(Double foodRepertory) {
        this.foodRepertory = foodRepertory;
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

    /**
     * 获取粮食所属门店
     *
     * @return food_store - 粮食所属门店
     */
    public String getFoodStore() {
        return foodStore;
    }

    /**
     * 设置粮食所属门店
     *
     * @param foodStore 粮食所属门店
     */
    public void setFoodStore(String foodStore) {
        this.foodStore = foodStore;
    }
}