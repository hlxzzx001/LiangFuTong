package com.LFT.pojo;

import java.util.Date;
import javax.persistence.*;

@Table(name = "`user_log`")
public class UserLog {
    /**
     * 用户日志id
     */
    @Id
    @Column(name = "`user_log_id`")
    @GeneratedValue(generator = "JDBC")
    private Integer userLogId;

    /**
     * 用户id
     */
    @Column(name = "`user_id`")
    private Integer userId;

    /**
     * 日志记录时间
     */
    @Column(name = "`user_log_time`")
    private Date userLogTime;

    /**
     * 用户变动粮食或兑换商品名称
     */
    @Column(name = "`user_log_content`")
    private String userLogContent;

    /**
     * 存粮净重
     */
    @Column(name = "`user_log_suttle`")
    private Double userLogSuttle;

    /**
     * 积分变动数值或粮食结算数量
     */
    @Column(name = "`user_log_number`")
    private Double userLogNumber;

    /**
     * 粮食含水量
     */
    @Column(name = "`user_log_foodwatercontent`")
    private Integer userLogFoodwatercontent;

    /**
     * 粮食金额金额
     */
    @Column(name = "`user_log_money`")
    private Double userLogMoney;

    /**
     *  1提粮 2存粮 3提现 4积分获得 5积分兑换 
     */
    @Column(name = "`user_log_type`")
    private Integer userLogType;

    /**
     * 获取用户日志id
     *
     * @return user_log_id - 用户日志id
     */
    public Integer getUserLogId() {
        return userLogId;
    }

    /**
     * 设置用户日志id
     *
     * @param userLogId 用户日志id
     */
    public void setUserLogId(Integer userLogId) {
        this.userLogId = userLogId;
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
     * 获取日志记录时间
     *
     * @return user_log_time - 日志记录时间
     */
    public Date getUserLogTime() {
        return userLogTime;
    }

    /**
     * 设置日志记录时间
     *
     * @param userLogTime 日志记录时间
     */
    public void setUserLogTime(Date userLogTime) {
        this.userLogTime = userLogTime;
    }

    /**
     * 获取用户变动粮食或兑换商品名称
     *
     * @return user_log_content - 用户变动粮食或兑换商品名称
     */
    public String getUserLogContent() {
        return userLogContent;
    }

    /**
     * 设置用户变动粮食或兑换商品名称
     *
     * @param userLogContent 用户变动粮食或兑换商品名称
     */
    public void setUserLogContent(String userLogContent) {
        this.userLogContent = userLogContent;
    }

    /**
     * 获取存粮净重
     *
     * @return user_log_suttle - 存粮净重
     */
    public Double getUserLogSuttle() {
        return userLogSuttle;
    }

    /**
     * 设置存粮净重
     *
     * @param userLogSuttle 存粮净重
     */
    public void setUserLogSuttle(Double userLogSuttle) {
        this.userLogSuttle = userLogSuttle;
    }

    /**
     * 获取积分变动数值或粮食结算数量
     *
     * @return user_log_number - 积分变动数值或粮食结算数量
     */
    public Double getUserLogNumber() {
        return userLogNumber;
    }

    /**
     * 设置积分变动数值或粮食结算数量
     *
     * @param userLogNumber 积分变动数值或粮食结算数量
     */
    public void setUserLogNumber(Double userLogNumber) {
        this.userLogNumber = userLogNumber;
    }

    /**
     * 获取粮食含水量
     *
     * @return user_log_foodwatercontent - 粮食含水量
     */
    public Integer getUserLogFoodwatercontent() {
        return userLogFoodwatercontent;
    }

    /**
     * 设置粮食含水量
     *
     * @param userLogFoodwatercontent 粮食含水量
     */
    public void setUserLogFoodwatercontent(Integer userLogFoodwatercontent) {
        this.userLogFoodwatercontent = userLogFoodwatercontent;
    }

    /**
     * 获取粮食金额金额
     *
     * @return user_log_money - 粮食金额金额
     */
    public Double getUserLogMoney() {
        return userLogMoney;
    }

    /**
     * 设置粮食金额金额
     *
     * @param userLogMoney 粮食金额金额
     */
    public void setUserLogMoney(Double userLogMoney) {
        this.userLogMoney = userLogMoney;
    }

    /**
     * 获取 1提粮 2存粮 3提现 4积分获得 5积分兑换 
     *
     * @return user_log_type -  1提粮 2存粮 3提现 4积分获得 5积分兑换 
     */
    public Integer getUserLogType() {
        return userLogType;
    }

    /**
     * 设置 1提粮 2存粮 3提现 4积分获得 5积分兑换 
     *
     * @param userLogType  1提粮 2存粮 3提现 4积分获得 5积分兑换 
     */
    public void setUserLogType(Integer userLogType) {
        this.userLogType = userLogType;
    }
}