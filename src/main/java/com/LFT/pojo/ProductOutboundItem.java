package com.LFT.pojo;

import javax.persistence.*;

@Table(name = "`product_outbound_item`")
public class ProductOutboundItem {
    /**
     * 出库订单项id
     */
    @Id
    @Column(name = "`product_outbound_item_id`")
    @GeneratedValue(generator = "JDBC")
    private Integer productOutboundItemId;

    /**
     * 出库单id
     */
    @Column(name = "`product_outbound_id`")
    private String productOutboundId;

    /**
     * 商品id
     */
    @Column(name = "`product_id`")
    private Integer productId;

    /**
     * 商品数量
     */
    @Column(name = "`product_number`")
    private Double productNumber;

    /**
     * 商品名称
     */
    @Column(name = "`product_name`")
    private String productName;

    /**
     * 订单项小计
     */
    @Column(name = "`product_subtotal`")
    private Double productSubtotal;

    /**
     * 获取出库订单项id
     *
     * @return product_outbound_item_id - 出库订单项id
     */
    public Integer getProductOutboundItemId() {
        return productOutboundItemId;
    }

    /**
     * 设置出库订单项id
     *
     * @param productOutboundItemId 出库订单项id
     */
    public void setProductOutboundItemId(Integer productOutboundItemId) {
        this.productOutboundItemId = productOutboundItemId;
    }

    /**
     * 获取出库单id
     *
     * @return product_outbound_id - 出库单id
     */
    public String getProductOutboundId() {
        return productOutboundId;
    }

    /**
     * 设置出库单id
     *
     * @param productOutboundId 出库单id
     */
    public void setProductOutboundId(String productOutboundId) {
        this.productOutboundId = productOutboundId;
    }

    /**
     * 获取商品id
     *
     * @return product_id - 商品id
     */
    public Integer getProductId() {
        return productId;
    }

    /**
     * 设置商品id
     *
     * @param productId 商品id
     */
    public void setProductId(Integer productId) {
        this.productId = productId;
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
     * 获取商品名称
     *
     * @return product_name - 商品名称
     */
    public String getProductName() {
        return productName;
    }

    /**
     * 设置商品名称
     *
     * @param productName 商品名称
     */
    public void setProductName(String productName) {
        this.productName = productName;
    }

    /**
     * 获取订单项小计
     *
     * @return product_subtotal - 订单项小计
     */
    public Double getProductSubtotal() {
        return productSubtotal;
    }

    /**
     * 设置订单项小计
     *
     * @param productSubtotal 订单项小计
     */
    public void setProductSubtotal(Double productSubtotal) {
        this.productSubtotal = productSubtotal;
    }
}