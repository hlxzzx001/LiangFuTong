package com.LFT.pojo;

import java.util.Date;
import javax.persistence.*;

@Table(name = "`food_secondaryclassification`")
public class FoodSecondaryclassification {
    /**
     * 粮食二级分类id
     */
    @Id
    @Column(name = "`food_secondaryclassification_id`")
    @GeneratedValue(generator = "JDBC")
    private Integer foodSecondaryclassificationId;

    /**
     * 粮食一级分类
     */
    @Column(name = "`food_firstclassification_id`")
    private Integer foodFirstclassificationId;

    /**
     * 粮食二级分类名称
     */
    @Column(name = "`food_secondaryclassification_name`")
    private String foodSecondaryclassificationName;

    /**
     * 粮食二级分类创建时间
     */
    @Column(name = "`food_secondaryclassification_createtime`")
    private Date foodSecondaryclassificationCreatetime;

    /**
     * 获取粮食二级分类id
     *
     * @return food_secondaryclassification_id - 粮食二级分类id
     */
    public Integer getFoodSecondaryclassificationId() {
        return foodSecondaryclassificationId;
    }

    /**
     * 设置粮食二级分类id
     *
     * @param foodSecondaryclassificationId 粮食二级分类id
     */
    public void setFoodSecondaryclassificationId(Integer foodSecondaryclassificationId) {
        this.foodSecondaryclassificationId = foodSecondaryclassificationId;
    }

    /**
     * 获取粮食一级分类
     *
     * @return food_firstclassification_id - 粮食一级分类
     */
    public Integer getFoodFirstclassificationId() {
        return foodFirstclassificationId;
    }

    /**
     * 设置粮食一级分类
     *
     * @param foodFirstclassificationId 粮食一级分类
     */
    public void setFoodFirstclassificationId(Integer foodFirstclassificationId) {
        this.foodFirstclassificationId = foodFirstclassificationId;
    }

    /**
     * 获取粮食二级分类名称
     *
     * @return food_secondaryclassification_name - 粮食二级分类名称
     */
    public String getFoodSecondaryclassificationName() {
        return foodSecondaryclassificationName;
    }

    /**
     * 设置粮食二级分类名称
     *
     * @param foodSecondaryclassificationName 粮食二级分类名称
     */
    public void setFoodSecondaryclassificationName(String foodSecondaryclassificationName) {
        this.foodSecondaryclassificationName = foodSecondaryclassificationName;
    }

    /**
     * 获取粮食二级分类创建时间
     *
     * @return food_secondaryclassification_createtime - 粮食二级分类创建时间
     */
    public Date getFoodSecondaryclassificationCreatetime() {
        return foodSecondaryclassificationCreatetime;
    }

    /**
     * 设置粮食二级分类创建时间
     *
     * @param foodSecondaryclassificationCreatetime 粮食二级分类创建时间
     */
    public void setFoodSecondaryclassificationCreatetime(Date foodSecondaryclassificationCreatetime) {
        this.foodSecondaryclassificationCreatetime = foodSecondaryclassificationCreatetime;
    }
}