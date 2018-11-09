package com.LFT.pojo;

import java.util.Date;
import javax.persistence.*;

@Table(name = "`food_firstclassification`")
public class FoodFirstclassification {
    /**
     * 粮食一级分类id
     */
    @Id
    @Column(name = "`food_firstclassification_id`")
    @GeneratedValue(generator = "JDBC")
    private Integer foodFirstclassificationId;

    /**
     * 粮食一级分类名称
     */
    @Column(name = "`food_firstclassification_name`")
    private String foodFirstclassificationName;

    /**
     * 粮食一级分类添加时间
     */
    @Column(name = "`food_firstclassification_createtime`")
    private Date foodFirstclassificationCreatetime;

    /**
     * 获取粮食一级分类id
     *
     * @return food_firstclassification_id - 粮食一级分类id
     */
    public Integer getFoodFirstclassificationId() {
        return foodFirstclassificationId;
    }

    /**
     * 设置粮食一级分类id
     *
     * @param foodFirstclassificationId 粮食一级分类id
     */
    public void setFoodFirstclassificationId(Integer foodFirstclassificationId) {
        this.foodFirstclassificationId = foodFirstclassificationId;
    }

    /**
     * 获取粮食一级分类名称
     *
     * @return food_firstclassification_name - 粮食一级分类名称
     */
    public String getFoodFirstclassificationName() {
        return foodFirstclassificationName;
    }

    /**
     * 设置粮食一级分类名称
     *
     * @param foodFirstclassificationName 粮食一级分类名称
     */
    public void setFoodFirstclassificationName(String foodFirstclassificationName) {
        this.foodFirstclassificationName = foodFirstclassificationName;
    }

    /**
     * 获取粮食一级分类添加时间
     *
     * @return food_firstclassification_createtime - 粮食一级分类添加时间
     */
    public Date getFoodFirstclassificationCreatetime() {
        return foodFirstclassificationCreatetime;
    }

    /**
     * 设置粮食一级分类添加时间
     *
     * @param foodFirstclassificationCreatetime 粮食一级分类添加时间
     */
    public void setFoodFirstclassificationCreatetime(Date foodFirstclassificationCreatetime) {
        this.foodFirstclassificationCreatetime = foodFirstclassificationCreatetime;
    }
}