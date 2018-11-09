package com.LFT.pojo;

import java.util.Date;
import javax.persistence.*;

@Table(name = "`food_appointment`")
public class FoodAppointment {
    /**
     * 预约存粮id
     */
    @Id
    @Column(name = "`food_appointment_id`")
    @GeneratedValue(generator = "JDBC")
    private Integer foodAppointmentId;

    /**
     * 粮食类别
     */
    @Column(name = "`food_appointment_type`")
    private Integer foodAppointmentType;

    /**
     * 粮食重量
     */
    @Column(name = "`food_appointment_number`")
    private Double foodAppointmentNumber;

    /**
     * 预约门店
     */
    @Column(name = "`food_appointment_store`")
    private String foodAppointmentStore;

    /**
     * 预约时间
     */
    @Column(name = "`food_appointment_time`")
    private Date foodAppointmentTime;

    /**
     * 用户id
     */
    @Column(name = "`user_id`")
    private Integer userId;

    /**
     * 获取预约存粮id
     *
     * @return food_appointment_id - 预约存粮id
     */
    public Integer getFoodAppointmentId() {
        return foodAppointmentId;
    }

    /**
     * 设置预约存粮id
     *
     * @param foodAppointmentId 预约存粮id
     */
    public void setFoodAppointmentId(Integer foodAppointmentId) {
        this.foodAppointmentId = foodAppointmentId;
    }

    /**
     * 获取粮食类别
     *
     * @return food_appointment_type - 粮食类别
     */
    public Integer getFoodAppointmentType() {
        return foodAppointmentType;
    }

    /**
     * 设置粮食类别
     *
     * @param foodAppointmentType 粮食类别
     */
    public void setFoodAppointmentType(Integer foodAppointmentType) {
        this.foodAppointmentType = foodAppointmentType;
    }

    /**
     * 获取粮食重量
     *
     * @return food_appointment_number - 粮食重量
     */
    public Double getFoodAppointmentNumber() {
        return foodAppointmentNumber;
    }

    /**
     * 设置粮食重量
     *
     * @param foodAppointmentNumber 粮食重量
     */
    public void setFoodAppointmentNumber(Double foodAppointmentNumber) {
        this.foodAppointmentNumber = foodAppointmentNumber;
    }

    /**
     * 获取预约门店
     *
     * @return food_appointment_store - 预约门店
     */
    public String getFoodAppointmentStore() {
        return foodAppointmentStore;
    }

    /**
     * 设置预约门店
     *
     * @param foodAppointmentStore 预约门店
     */
    public void setFoodAppointmentStore(String foodAppointmentStore) {
        this.foodAppointmentStore = foodAppointmentStore;
    }

    /**
     * 获取预约时间
     *
     * @return food_appointment_time - 预约时间
     */
    public Date getFoodAppointmentTime() {
        return foodAppointmentTime;
    }

    /**
     * 设置预约时间
     *
     * @param foodAppointmentTime 预约时间
     */
    public void setFoodAppointmentTime(Date foodAppointmentTime) {
        this.foodAppointmentTime = foodAppointmentTime;
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
}