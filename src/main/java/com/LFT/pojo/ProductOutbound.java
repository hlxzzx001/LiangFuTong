package com.LFT.pojo;

import java.util.Date;
import javax.persistence.*;

@Table(name = "`product_outbound`")
public class ProductOutbound {
    /**
     * 商品出库id
     */
    @Id
    @Column(name = "`product_outbound_id`")
    @GeneratedValue(generator = "JDBC")
    private String productOutboundId;

    /**
     * 商品出库时间
     */
    @Column(name = "`product_outbound_time`")
    private Date productOutboundTime;

    /**
     * 商品数量
     */
    @Column(name = "`product_number`")
    private Double productNumber;

    /**
     * 商品总价格
     */
    @Column(name = "`product_outbound_price`")
    private Double productOutboundPrice;

    /**
     * 结算方式
     */
    @Column(name = "`product_outbound_method`")
    private Integer productOutboundMethod;

    /**
     * 收货人id
     */
    @Column(name = "`product_outbound_consignee`")
    private Integer productOutboundConsignee;

    /**
     * 操作人id
     */
    @Column(name = "`product_outbound_operator`")
    private Integer productOutboundOperator;

    /**
     * 获取商品出库id
     *
     * @return product_outbound_id - 商品出库id
     */
    public String getProductOutboundId() {
        return productOutboundId;
    }

    /**
     * 设置商品出库id
     *
     * @param productOutboundId 商品出库id
     */
    public void setProductOutboundId(String productOutboundId) {
        this.productOutboundId = productOutboundId;
    }

    /**
     * 获取商品出库时间
     *
     * @return product_outbound_time - 商品出库时间
     */
    public Date getProductOutboundTime() {
        return productOutboundTime;
    }

    /**
     * 设置商品出库时间
     *
     * @param productOutboundTime 商品出库时间
     */
    public void setProductOutboundTime(Date productOutboundTime) {
        this.productOutboundTime = productOutboundTime;
    }

    /**
     * 获取商品数量
     *
     * @return product_number - 商品数量
     */
    public Double getProductNumber() {
        return productNumber;
    }

    /**
     * 设置商品数量
     *
     * @param productNumber 商品数量
     */
    public void setProductNumber(Double productNumber) {
        this.productNumber = productNumber;
    }

    /**
     * 获取商品总价格
     *
     * @return product_outbound_price - 商品总价格
     */
    public Double getProductOutboundPrice() {
        return productOutboundPrice;
    }

    /**
     * 设置商品总价格
     *
     * @param productOutboundPrice 商品总价格
     */
    public void setProductOutboundPrice(Double productOutboundPrice) {
        this.productOutboundPrice = productOutboundPrice;
    }

    /**
     * 获取结算方式
     *
     * @return product_outbound_method - 结算方式
     */
    public Integer getProductOutboundMethod() {
        return productOutboundMethod;
    }

    /**
     * 设置结算方式
     *
     * @param productOutboundMethod 结算方式
     */
    public void setProductOutboundMethod(Integer productOutboundMethod) {
        this.productOutboundMethod = productOutboundMethod;
    }

    /**
     * 获取收货人id
     *
     * @return product_outbound_consignee - 收货人id
     */
    public Integer getProductOutboundConsignee() {
        return productOutboundConsignee;
    }

    /**
     * 设置收货人id
     *
     * @param productOutboundConsignee 收货人id
     */
    public void setProductOutboundConsignee(Integer productOutboundConsignee) {
        this.productOutboundConsignee = productOutboundConsignee;
    }

    /**
     * 获取操作人id
     *
     * @return product_outbound_operator - 操作人id
     */
    public Integer getProductOutboundOperator() {
        return productOutboundOperator;
    }

    /**
     * 设置操作人id
     *
     * @param productOutboundOperator 操作人id
     */
    public void setProductOutboundOperator(Integer productOutboundOperator) {
        this.productOutboundOperator = productOutboundOperator;
    }
}