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
    @Column(name = "`food_appointment_foodtype`")
    private Integer foodAppointmentFoodtype;

    /**
     * 粮食重量/现金金额
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
     * 1存粮 2提粮 3提现
     */
    @Column(name = "`food_appointment_type`")
    private Integer foodAppointmentType;

    /**
     * 预约存粮状态 1未完成 2完成
     */
    @Column(name = "`food_appointment_status`")
    private Integer foodAppointmentStatus;

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
     * @return food_appointment_foodtype - 粮食类别
     */
    public Integer getFoodAppointmentFoodtype() {
        return foodAppointmentFoodtype;
    }

    /**
     * 设置粮食类别
     *
     * @param foodAppointmentFoodtype 粮食类别
     */
    public void setFoodAppointmentFoodtype(Integer foodAppointmentFoodtype) {
        this.foodAppointmentFoodtype = foodAppointmentFoodtype;
    }

    /**
     * 获取粮食重量/现金金额
     *
     * @return food_appointment_number - 粮食重量/现金金额
     */
    public Double getFoodAppointmentNumber() {
        return foodAppointmentNumber;
    }

    /**
     * 设置粮食重量/现金金额
     *
     * @param foodAppointmentNumber 粮食重量/现金金额
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

    /**
     * 获取1存粮 2提粮 3提现
     *
     * @return food_appointment_type - 1存粮 2提粮 3提现
     */
    public Integer getFoodAppointmentType() {
        return foodAppointmentType;
    }

    /**
     * 设置1存粮 2提粮 3提现
     *
     * @param foodAppointmentType 1存粮 2提粮 3提现
     */
    public void setFoodAppointmentType(Integer foodAppointmentType) {
        this.foodAppointmentType = foodAppointmentType;
    }

    /**
     * 获取预约存粮状态 1未完成 2完成
     *
     * @return food_appointment_status - 预约存粮状态 1未完成 2完成
     */
    public Integer getFoodAppointmentStatus() {
        return foodAppointmentStatus;
    }

    /**
     * 设置预约存粮状态 1未完成 2完成
     *
     * @param foodAppointmentStatus 预约存粮状态 1未完成 2完成
     */
    public void setFoodAppointmentStatus(Integer foodAppointmentStatus) {
        this.foodAppointmentStatus = foodAppointmentStatus;
    }
}