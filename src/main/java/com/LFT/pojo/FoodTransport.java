package com.LFT.pojo;

import java.util.Date;
import javax.persistence.*;

@Table(name = "`food_transport`")
public class FoodTransport {
    /**
     * 存粮运输id
     */
    @Id
    @Column(name = "`food_transport_id`")
    @GeneratedValue(generator = "JDBC")
    private Integer foodTransportId;

    /**
     * 粮食名称
     */
    @Column(name = "`food_name`")
    private String foodName;

    /**
     * 粮食数量
     */
    @Column(name = "`food_number`")
    private Double foodNumber;

    /**
     * 粮食类型
     */
    @Column(name = "`food_type`")
    private Integer foodType;

    /**
     * 转出仓库
     */
    @Column(name = "`food_transport_out`")
    private String foodTransportOut;

    /**
     * 转入仓库
     */
    @Column(name = "`food_transport_into`")
    private String foodTransportInto;

    /**
     * 转运时间
     */
    @Column(name = "`food_transport_time`")
    private Date foodTransportTime;

    /**
     * 转运完成时间
     */
    @Column(name = "`food_transport_complete`")
    private Date foodTransportComplete;

    /**
     * 获取存粮运输id
     *
     * @return food_transport_id - 存粮运输id
     */
    public Integer getFoodTransportId() {
        return foodTransportId;
    }

    /**
     * 设置存粮运输id
     *
     * @param foodTransportId 存粮运输id
     */
    public void setFoodTransportId(Integer foodTransportId) {
        this.foodTransportId = foodTransportId;
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
     * 获取粮食数量
     *
     * @return food_number - 粮食数量
     */
    public Double getFoodNumber() {
        return foodNumber;
    }

    /**
     * 设置粮食数量
     *
     * @param foodNumber 粮食数量
     */
    public void setFoodNumber(Double foodNumber) {
        this.foodNumber = foodNumber;
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
     * 获取转出仓库
     *
     * @return food_transport_out - 转出仓库
     */
    public String getFoodTransportOut() {
        return foodTransportOut;
    }

    /**
     * 设置转出仓库
     *
     * @param foodTransportOut 转出仓库
     */
    public void setFoodTransportOut(String foodTransportOut) {
        this.foodTransportOut = foodTransportOut;
    }

    /**
     * 获取转入仓库
     *
     * @return food_transport_into - 转入仓库
     */
    public String getFoodTransportInto() {
        return foodTransportInto;
    }

    /**
     * 设置转入仓库
     *
     * @param foodTransportInto 转入仓库
     */
    public void setFoodTransportInto(String foodTransportInto) {
        this.foodTransportInto = foodTransportInto;
    }

    /**
     * 获取转运时间
     *
     * @return food_transport_time - 转运时间
     */
    public Date getFoodTransportTime() {
        return foodTransportTime;
    }

    /**
     * 设置转运时间
     *
     * @param foodTransportTime 转运时间
     */
    public void setFoodTransportTime(Date foodTransportTime) {
        this.foodTransportTime = foodTransportTime;
    }

    /**
     * 获取转运完成时间
     *
     * @return food_transport_complete - 转运完成时间
     */
    public Date getFoodTransportComplete() {
        return foodTransportComplete;
    }

    /**
     * 设置转运完成时间
     *
     * @param foodTransportComplete 转运完成时间
     */
    public void setFoodTransportComplete(Date foodTransportComplete) {
        this.foodTransportComplete = foodTransportComplete;
    }
}