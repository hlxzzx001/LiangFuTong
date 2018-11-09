package com.LFT.pojo;

import java.util.Date;
import javax.persistence.*;

@Table(name = "`order`")
public class Order {
    /**
     * 订单id/号
     */
    @Id
    @Column(name = "`order_id`")
    @GeneratedValue(generator = "JDBC")
    private String orderId;

    /**
     * 订单金额
     */
    @Column(name = "`order_money`")
    private Double orderMoney;

    /**
     * 支付类型
     */
    @Column(name = "`order_paytype`")
    private Integer orderPaytype;

    /**
     * 订单状态
     */
    @Column(name = "`order_status`")
    private Integer orderStatus;

    /**
     * 订单创建时间
     */
    @Column(name = "`order_createtime`")
    private Date orderCreatetime;

    /**
     * 订单更新时间
     */
    @Column(name = "`order_updatetime`")
    private Date orderUpdatetime;

    /**
     * 订单关闭时间
     */
    @Column(name = "`order_closetime`")
    private Date orderClosetime;

    /**
     * 用户id
     */
    @Column(name = "`user_id`")
    private Integer userId;

    /**
     * 获取订单id/号
     *
     * @return order_id - 订单id/号
     */
    public String getOrderId() {
        return orderId;
    }

    /**
     * 设置订单id/号
     *
     * @param orderId 订单id/号
     */
    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    /**
     * 获取订单金额
     *
     * @return order_money - 订单金额
     */
    public Double getOrderMoney() {
        return orderMoney;
    }

    /**
     * 设置订单金额
     *
     * @param orderMoney 订单金额
     */
    public void setOrderMoney(Double orderMoney) {
        this.orderMoney = orderMoney;
    }

    /**
     * 获取支付类型
     *
     * @return order_paytype - 支付类型
     */
    public Integer getOrderPaytype() {
        return orderPaytype;
    }

    /**
     * 设置支付类型
     *
     * @param orderPaytype 支付类型
     */
    public void setOrderPaytype(Integer orderPaytype) {
        this.orderPaytype = orderPaytype;
    }

    /**
     * 获取订单状态
     *
     * @return order_status - 订单状态
     */
    public Integer getOrderStatus() {
        return orderStatus;
    }

    /**
     * 设置订单状态
     *
     * @param orderStatus 订单状态
     */
    public void setOrderStatus(Integer orderStatus) {
        this.orderStatus = orderStatus;
    }

    /**
     * 获取订单创建时间
     *
     * @return order_createtime - 订单创建时间
     */
    public Date getOrderCreatetime() {
        return orderCreatetime;
    }

    /**
     * 设置订单创建时间
     *
     * @param orderCreatetime 订单创建时间
     */
    public void setOrderCreatetime(Date orderCreatetime) {
        this.orderCreatetime = orderCreatetime;
    }

    /**
     * 获取订单更新时间
     *
     * @return order_updatetime - 订单更新时间
     */
    public Date getOrderUpdatetime() {
        return orderUpdatetime;
    }

    /**
     * 设置订单更新时间
     *
     * @param orderUpdatetime 订单更新时间
     */
    public void setOrderUpdatetime(Date orderUpdatetime) {
        this.orderUpdatetime = orderUpdatetime;
    }

    /**
     * 获取订单关闭时间
     *
     * @return order_closetime - 订单关闭时间
     */
    public Date getOrderClosetime() {
        return orderClosetime;
    }

    /**
     * 设置订单关闭时间
     *
     * @param orderClosetime 订单关闭时间
     */
    public void setOrderClosetime(Date orderClosetime) {
        this.orderClosetime = orderClosetime;
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