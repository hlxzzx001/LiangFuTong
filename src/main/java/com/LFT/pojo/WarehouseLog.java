package com.LFT.pojo;

import java.util.Date;
import javax.persistence.*;

@Table(name = "`warehouse_log`")
public class WarehouseLog {
    /**
     * 仓储记录id
     */
    @Id
    @Column(name = "`warehouse_log_id`")
    @GeneratedValue(generator = "JDBC")
    private Integer warehouseLogId;

    /**
     * 用户
     */
    @Column(name = "`user_id`")
    private Integer userId;

    /**
     * 粮食名称
     */
    @Column(name = "`food_name`")
    private String foodName;

    /**
     * 仓储记录时间
     */
    @Column(name = "`warehouse_log_time`")
    private Date warehouseLogTime;

    /**
     * 仓储记录地点
     */
    @Column(name = "`warehouse_log_place`")
    private String warehouseLogPlace;

    /**
     * 仓储记录类型
     */
    @Column(name = "`warehouse_log_type`")
    private Integer warehouseLogType;

    /**
     * 记录数量
     */
    @Column(name = "`warehouse_log_number`")
    private Double warehouseLogNumber;

    /**
     * 获取仓储记录id
     *
     * @return warehouse_log_id - 仓储记录id
     */
    public Integer getWarehouseLogId() {
        return warehouseLogId;
    }

    /**
     * 设置仓储记录id
     *
     * @param warehouseLogId 仓储记录id
     */
    public void setWarehouseLogId(Integer warehouseLogId) {
        this.warehouseLogId = warehouseLogId;
    }

    /**
     * 获取用户
     *
     * @return user_id - 用户
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * 设置用户
     *
     * @param userId 用户
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
     * 获取仓储记录时间
     *
     * @return warehouse_log_time - 仓储记录时间
     */
    public Date getWarehouseLogTime() {
        return warehouseLogTime;
    }

    /**
     * 设置仓储记录时间
     *
     * @param warehouseLogTime 仓储记录时间
     */
    public void setWarehouseLogTime(Date warehouseLogTime) {
        this.warehouseLogTime = warehouseLogTime;
    }

    /**
     * 获取仓储记录地点
     *
     * @return warehouse_log_place - 仓储记录地点
     */
    public String getWarehouseLogPlace() {
        return warehouseLogPlace;
    }

    /**
     * 设置仓储记录地点
     *
     * @param warehouseLogPlace 仓储记录地点
     */
    public void setWarehouseLogPlace(String warehouseLogPlace) {
        this.warehouseLogPlace = warehouseLogPlace;
    }

    /**
     * 获取仓储记录类型
     *
     * @return warehouse_log_type - 仓储记录类型
     */
    public Integer getWarehouseLogType() {
        return warehouseLogType;
    }

    /**
     * 设置仓储记录类型
     *
     * @param warehouseLogType 仓储记录类型
     */
    public void setWarehouseLogType(Integer warehouseLogType) {
        this.warehouseLogType = warehouseLogType;
    }

    /**
     * 获取记录数量
     *
     * @return warehouse_log_number - 记录数量
     */
    public Double getWarehouseLogNumber() {
        return warehouseLogNumber;
    }

    /**
     * 设置记录数量
     *
     * @param warehouseLogNumber 记录数量
     */
    public void setWarehouseLogNumber(Double warehouseLogNumber) {
        this.warehouseLogNumber = warehouseLogNumber;
    }
}