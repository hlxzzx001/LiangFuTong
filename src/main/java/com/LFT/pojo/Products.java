package com.LFT.pojo;

import java.util.Date;
import javax.persistence.*;

@Table(name = "`products`")
public class Products {
    /**
     * 商品id
     */
    @Id
    @Column(name = "`product_id`")
    @GeneratedValue(generator = "JDBC")
    private Integer productId;

    /**
     * 商品名称
     */
    @Column(name = "`product_name`")
    private String productName;

    /**
     * 商品数量
     */
    @Column(name = "`product_number`")
    private Double productNumber;

    /**
     * 商品进货价
     */
    @Column(name = "`product_purchase`")
    private Double productPurchase;

    /**
     * 商品零售价
     */
    @Column(name = "`product_original`")
    private Double productOriginal;

    /**
     * 商品现价
     */
    @Column(name = "`product_present`")
    private Double productPresent;

    /**
     * 折扣价
     */
    @Column(name = "`product_discount`")
    private Double productDiscount;

    /**
     * 商品图片
     */
    @Column(name = "`product_picture`")
    private String productPicture;

    /**
     * 商品规格
     */
    @Column(name = "`product_specifications`")
    private String productSpecifications;

    /**
     * 商品类别
     */
    @Column(name = "`product_type`")
    private Integer productType;

    /**
     * 商品添加时间
     */
    @Column(name = "`product_addtime`")
    private Date productAddtime;

    /**
     * 商品活动
     */
    @Column(name = "`product_activity`")
    private Integer productActivity;

    /**
     * 商品所属门店
     */
    @Column(name = "`product_store`")
    private String productStore;

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
     * 获取商品进货价
     *
     * @return product_purchase - 商品进货价
     */
    public Double getProductPurchase() {
        return productPurchase;
    }

    /**
     * 设置商品进货价
     *
     * @param productPurchase 商品进货价
     */
    public void setProductPurchase(Double productPurchase) {
        this.productPurchase = productPurchase;
    }

    /**
     * 获取商品零售价
     *
     * @return product_original - 商品零售价
     */
    public Double getProductOriginal() {
        return productOriginal;
    }

    /**
     * 设置商品零售价
     *
     * @param productOriginal 商品零售价
     */
    public void setProductOriginal(Double productOriginal) {
        this.productOriginal = productOriginal;
    }

    /**
     * 获取商品现价
     *
     * @return product_present - 商品现价
     */
    public Double getProductPresent() {
        return productPresent;
    }

    /**
     * 设置商品现价
     *
     * @param productPresent 商品现价
     */
    public void setProductPresent(Double productPresent) {
        this.productPresent = productPresent;
    }

    /**
     * 获取折扣价
     *
     * @return product_discount - 折扣价
     */
    public Double getProductDiscount() {
        return productDiscount;
    }

    /**
     * 设置折扣价
     *
     * @param productDiscount 折扣价
     */
    public void setProductDiscount(Double productDiscount) {
        this.productDiscount = productDiscount;
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
     * 获取商品规格
     *
     * @return product_specifications - 商品规格
     */
    public String getProductSpecifications() {
        return productSpecifications;
    }

    /**
     * 设置商品规格
     *
     * @param productSpecifications 商品规格
     */
    public void setProductSpecifications(String productSpecifications) {
        this.productSpecifications = productSpecifications;
    }

    /**
     * 获取商品类别
     *
     * @return product_type - 商品类别
     */
    public Integer getProductType() {
        return productType;
    }

    /**
     * 设置商品类别
     *
     * @param productType 商品类别
     */
    public void setProductType(Integer productType) {
        this.productType = productType;
    }

    /**
     * 获取商品添加时间
     *
     * @return product_addtime - 商品添加时间
     */
    public Date getProductAddtime() {
        return productAddtime;
    }

    /**
     * 设置商品添加时间
     *
     * @param productAddtime 商品添加时间
     */
    public void setProductAddtime(Date productAddtime) {
        this.productAddtime = productAddtime;
    }

    /**
     * 获取商品活动
     *
     * @return product_activity - 商品活动
     */
    public Integer getProductActivity() {
        return productActivity;
    }

    /**
     * 设置商品活动
     *
     * @param productActivity 商品活动
     */
    public void setProductActivity(Integer productActivity) {
        this.productActivity = productActivity;
    }

    /**
     * 获取商品所属门店
     *
     * @return product_store - 商品所属门店
     */
    public String getProductStore() {
        return productStore;
    }

    /**
     * 设置商品所属门店
     *
     * @param productStore 商品所属门店
     */
    public void setProductStore(String productStore) {
        this.productStore = productStore;
    }
}