package com.LFT.pojo;

import javax.persistence.*;

@Table(name = "`goods_shopcar`")
public class GoodsShopcar {
    /**
     * 主键
     */
    @Id
    @Column(name = "`c_id`")
    @GeneratedValue(generator = "JDBC")
    private Integer cId;

    /**
     * 用户id
     */
    @Column(name = "`uid`")
    private Integer uid;

    /**
     * 商品id
     */
    @Column(name = "`goods_id`")
    private Integer goodsId;

    /**
     * 数量
     */
    @Column(name = "`number`")
    private Integer number;

    /**
     * 订单状态
     */
    @Column(name = "`status`")
    private Byte status;

    /**
     * 创建时间
     */
    @Column(name = "`create_time`")
    private Integer createTime;

    /**
     * 更新时间
     */
    @Column(name = "`update_time`")
    private Integer updateTime;

    /**
     * 获取主键
     *
     * @return c_id - 主键
     */
    public Integer getcId() {
        return cId;
    }

    /**
     * 设置主键
     *
     * @param cId 主键
     */
    public void setcId(Integer cId) {
        this.cId = cId;
    }

    /**
     * 获取用户id
     *
     * @return uid - 用户id
     */
    public Integer getUid() {
        return uid;
    }

    /**
     * 设置用户id
     *
     * @param uid 用户id
     */
    public void setUid(Integer uid) {
        this.uid = uid;
    }

    /**
     * 获取商品id
     *
     * @return goods_id - 商品id
     */
    public Integer getGoodsId() {
        return goodsId;
    }

    /**
     * 设置商品id
     *
     * @param goodsId 商品id
     */
    public void setGoodsId(Integer goodsId) {
        this.goodsId = goodsId;
    }

    /**
     * 获取数量
     *
     * @return number - 数量
     */
    public Integer getNumber() {
        return number;
    }

    /**
     * 设置数量
     *
     * @param number 数量
     */
    public void setNumber(Integer number) {
        this.number = number;
    }

    /**
     * 获取订单状态
     *
     * @return status - 订单状态
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * 设置订单状态
     *
     * @param status 订单状态
     */
    public void setStatus(Byte status) {
        this.status = status;
    }

    /**
     * 获取创建时间
     *
     * @return create_time - 创建时间
     */
    public Integer getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间
     *
     * @param createTime 创建时间
     */
    public void setCreateTime(Integer createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取更新时间
     *
     * @return update_time - 更新时间
     */
    public Integer getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置更新时间
     *
     * @param updateTime 更新时间
     */
    public void setUpdateTime(Integer updateTime) {
        this.updateTime = updateTime;
    }
}