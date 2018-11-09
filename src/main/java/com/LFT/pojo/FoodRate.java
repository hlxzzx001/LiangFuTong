package com.LFT.pojo;

import java.util.Date;
import javax.persistence.*;

@Table(name = "`food_rate`")
public class FoodRate {
    /**
     * 汇率id
     */
    @Id
    @Column(name = "`food_rate_id`")
    @GeneratedValue(generator = "JDBC")
    private Integer foodRateId;

    /**
     * 汇率名称
     */
    @Column(name = "`food_rate_name`")
    private String foodRateName;

    /**
     * 粮食一级分类
     */
    @Column(name = "`food_firstclassification`")
    private Integer foodFirstclassification;

    /**
     * 粮食二级分类
     */
    @Column(name = "`food_secondaryclassification`")
    private Integer foodSecondaryclassification;

    /**
     * 汇率内容
     */
    @Column(name = "`food_rate_content`")
    private Double foodRateContent;

    /**
     * 汇率更新时间
     */
    @Column(name = "`food_rate_updatetime`")
    private Date foodRateUpdatetime;

    /**
     * 地点
     */
    @Column(name = "`food_rate_store`")
    private String foodRateStore;

    /**
     * 获取汇率id
     *
     * @return food_rate_id - 汇率id
     */
    public Integer getFoodRateId() {
        return foodRateId;
    }

    /**
     * 设置汇率id
     *
     * @param foodRateId 汇率id
     */
    public void setFoodRateId(Integer foodRateId) {
        this.foodRateId = foodRateId;
    }

    /**
     * 获取汇率名称
     *
     * @return food_rate_name - 汇率名称
     */
    public String getFoodRateName() {
        return foodRateName;
    }

    /**
     * 设置汇率名称
     *
     * @param foodRateName 汇率名称
     */
    public void setFoodRateName(String foodRateName) {
        this.foodRateName = foodRateName;
    }

    /**
     * 获取粮食一级分类
     *
     * @return food_firstclassification - 粮食一级分类
     */
    public Integer getFoodFirstclassification() {
        return foodFirstclassification;
    }

    /**
     * 设置粮食一级分类
     *
     * @param foodFirstclassification 粮食一级分类
     */
    public void setFoodFirstclassification(Integer foodFirstclassification) {
        this.foodFirstclassification = foodFirstclassification;
    }

    /**
     * 获取粮食二级分类
     *
     * @return food_secondaryclassification - 粮食二级分类
     */
    public Integer getFoodSecondaryclassification() {
        return foodSecondaryclassification;
    }

    /**
     * 设置粮食二级分类
     *
     * @param foodSecondaryclassification 粮食二级分类
     */
    public void setFoodSecondaryclassification(Integer foodSecondaryclassification) {
        this.foodSecondaryclassification = foodSecondaryclassification;
    }

    /**
     * 获取汇率内容
     *
     * @return food_rate_content - 汇率内容
     */
    public Double getFoodRateContent() {
        return foodRateContent;
    }

    /**
     * 设置汇率内容
     *
     * @param foodRateContent 汇率内容
     */
    public void setFoodRateContent(Double foodRateContent) {
        this.foodRateContent = foodRateContent;
    }

    /**
     * 获取汇率更新时间
     *
     * @return food_rate_updatetime - 汇率更新时间
     */
    public Date getFoodRateUpdatetime() {
        return foodRateUpdatetime;
    }

    /**
     * 设置汇率更新时间
     *
     * @param foodRateUpdatetime 汇率更新时间
     */
    public void setFoodRateUpdatetime(Date foodRateUpdatetime) {
        this.foodRateUpdatetime = foodRateUpdatetime;
    }

    /**
     * 获取地点
     *
     * @return food_rate_store - 地点
     */
    public String getFoodRateStore() {
        return foodRateStore;
    }

    /**
     * 设置地点
     *
     * @param foodRateStore 地点
     */
    public void setFoodRateStore(String foodRateStore) {
        this.foodRateStore = foodRateStore;
    }
}