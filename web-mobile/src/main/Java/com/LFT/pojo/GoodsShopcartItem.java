package com.LFT.pojo;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "`goods_shopcart_item`")
public class GoodsShopcartItem {
    /**
     * 购物车项id
     */
    @Id
    @Column(name = "`item_id`")
    @GeneratedValue(generator = "JDBC")
    private String itemId;

    /**
     * 购物车id
     */
    @Column(name = "`c_id`")
    private String cId;

    /**
     * 商品id
     */
    @Column(name = "`product_id`")
    private Integer productId;

    /**
     * 用户id
     */
    @Column(name = "`uid`")
    private Integer uid;

    /**
     * 商品名称
     */
    @Column(name = "`products_name`")
    private String productsName;

    /**
     * 商品单价
     */
    @Column(name = "`product_price`")
    private Double productPrice;

    /**
     * 支付方式
     */
    @Column(name = "`product_paytype`")
    private String productPaytype;

    /**
     * 商品数量
     */
    @Column(name = "`product_num`")
    private Integer productNum;

    /**
     * 商品图片
     */
    @Column(name = "`product_picture`")
    private String productPicture;

    /**
     * 商品规格
     */
    @Column(name = "`product_spec`")
    private String productSpec;

    /**
     * 创建时间
     */
    @Column(name = "`create_time`")
    private Date createTime;

    /**
     * 修改时间
     */
    @Column(name = "`update_time`")
    private Date updateTime;

    /**
     * 获取购物车项id
     *
     * @return item_id - 购物车项id
     */
    public String getItemId() {
        return itemId;
    }

    /**
     * 设置购物车项id
     *
     * @param itemId 购物车项id
     */
    public void setItemId(String itemId) {
        this.itemId = itemId;
    }

    /**
     * 获取购物车id
     *
     * @return c_id - 购物车id
     */
    public String getcId() {
        return cId;
    }

    /**
     * 设置购物车id
     *
     * @param cId 购物车id
     */
    public void setcId(String cId) {
        this.cId = cId;
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
     * 获取商品名称
     *
     * @return products_name - 商品名称
     */
    public String getProductsName() {
        return productsName;
    }

    /**
     * 设置商品名称
     *
     * @param productsName 商品名称
     */
    public void setProductsName(String productsName) {
        this.productsName = productsName;
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
     * 获取支付方式
     *
     * @return product_paytype - 支付方式
     */
    public String getProductPaytype() {
        return productPaytype;
    }

    /**
     * 设置支付方式
     *
     * @param productPaytype 支付方式
     */
    public void setProductPaytype(String productPaytype) {
        this.productPaytype = productPaytype;
    }

    /**
     * 获取商品数量
     *
     * @return product_num - 商品数量
     */
    public Integer getProductNum() {
        return productNum;
    }

    /**
     * 设置商品数量
     *
     * @param productNum 商品数量
     */
    public void setProductNum(Integer productNum) {
        this.productNum = productNum;
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
     * @return product_spec - 商品规格
     */
    public String getProductSpec() {
        return productSpec;
    }

    /**
     * 设置商品规格
     *
     * @param productSpec 商品规格
     */
    public void setProductSpec(String productSpec) {
        this.productSpec = productSpec;
    }

    /**
     * 获取创建时间
     *
     * @return create_time - 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间
     *
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取修改时间
     *
     * @return update_time - 修改时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置修改时间
     *
     * @param updateTime 修改时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }
}