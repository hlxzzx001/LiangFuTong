package com.LFT.pojo;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "`order_item`")
public class OrderItem {
    /**
     * 订单项id
     */
    @Id
    @Column(name = "`orderitem_id`")
    @GeneratedValue(generator = "JDBC")
    private String orderitemId;

    /**
     * 订单id
     */
    @Column(name = "`order_id`")
    private String orderId;

    /**
     * 商品id
     */
    @Column(name = "`product_id`")
    private Integer productId;

    /**
     * 商品数量
     */
    @Column(name = "`product_number`")
    private Integer productNumber;

    /**
     * 商品标题/名称
     */
    @Column(name = "`product_name`")
    private String productName;

    /**
     * 商品单价
     */
    @Column(name = "`product_price`")
    private Double productPrice;

    /**
     * 订单项总金额
     */
    @Column(name = "`orderitem_totalmoney`")
    private Double orderitemTotalmoney;

    /**
     * 商品图片
     */
    @Column(name = "`product_picture`")
    private String productPicture;

    /**
     * 订单项支付方式
     */
    @Column(name = "`order_item_pay`")
    private String orderItemPay;

    /**
     * 获取订单项id
     *
     * @return orderitem_id - 订单项id
     */
    public String getOrderitemId() {
        return orderitemId;
    }

    /**
     * 设置订单项id
     *
     * @param orderitemId 订单项id
     */
    public void setOrderitemId(String orderitemId) {
        this.orderitemId = orderitemId;
    }

    /**
     * 获取订单id
     *
     * @return order_id - 订单id
     */
    public String getOrderId() {
        return orderId;
    }

    /**
     * 设置订单id
     *
     * @param orderId 订单id
     */
    public void setOrderId(String orderId) {
        this.orderId = orderId;
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
    public Integer getProductNumber() {
        return productNumber;
    }

    /**
     * 设置商品数量
     *
     * @param productNumber 商品数量
     */
    public void setProductNumber(Integer productNumber) {
        this.productNumber = productNumber;
    }

    /**
     * 获取商品标题/名称
     *
     * @return product_name - 商品标题/名称
     */
    public String getProductName() {
        return productName;
    }

    /**
     * 设置商品标题/名称
     *
     * @param productName 商品标题/名称
     */
    public void setProductName(String productName) {
        this.productName = productName;
    }

    /**
     * 获取商品单价
     *
     * @return product_price - 商品单价
     */
    public Double getProductPrice() {
        return productPrice;
    }

    /**
     * 设置商品单价
     *
     * @param productPrice 商品单价
     */
    public void setProductPrice(Double productPrice) {
        this.productPrice = productPrice;
    }

    /**
     * 获取订单项总金额
     *
     * @return orderitem_totalmoney - 订单项总金额
     */
    public Double getOrderitemTotalmoney() {
        return orderitemTotalmoney;
    }

    /**
     * 设置订单项总金额
     *
     * @param orderitemTotalmoney 订单项总金额
     */
    public void setOrderitemTotalmoney(Double orderitemTotalmoney) {
        this.orderitemTotalmoney = orderitemTotalmoney;
    }

    /**
     * 获取商品图片
     *
     * @return product_picture - 商品图片
     */
    public String getProductPicture() {
        return productPicture;
    }

    /**
     * 设置商品图片
     *
     * @param productPicture 商品图片
     */
    public void setProductPicture(String productPicture) {
        this.productPicture = productPicture;
    }

    /**
     * 获取订单项支付方式
     *
     * @return order_item_pay - 订单项支付方式
     */
    public String getOrderItemPay() {
        return orderItemPay;
    }

    /**
     * 设置订单项支付方式
     *
     * @param orderItemPay 订单项支付方式
     */
    public void setOrderItemPay(String orderItemPay) {
        this.orderItemPay = orderItemPay;
    }
}