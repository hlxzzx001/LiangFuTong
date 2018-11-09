package com.LFT.pojo;

import java.util.Date;
import javax.persistence.*;

@Table(name = "`product_type`")
public class ProductType {
    /**
     * 商品类别id
     */
    @Id
    @Column(name = "`product_type_id`")
    @GeneratedValue(generator = "JDBC")
    private Integer productTypeId;

    /**
     * 商品类别名称
     */
    @Column(name = "`product_type_name`")
    private String productTypeName;

    /**
     * 商品类别添加时间
     */
    @Column(name = "`product_type_addtime`")
    private Date productTypeAddtime;

    /**
     * 获取商品类别id
     *
     * @return product_type_id - 商品类别id
     */
    public Integer getProductTypeId() {
        return productTypeId;
    }

    /**
     * 设置商品类别id
     *
     * @param productTypeId 商品类别id
     */
    public void setProductTypeId(Integer productTypeId) {
        this.productTypeId = productTypeId;
    }

    /**
     * 获取商品类别名称
     *
     * @return product_type_name - 商品类别名称
     */
    public String getProductTypeName() {
        return productTypeName;
    }

    /**
     * 设置商品类别名称
     *
     * @param productTypeName 商品类别名称
     */
    public void setProductTypeName(String productTypeName) {
        this.productTypeName = productTypeName;
    }

    /**
     * 获取商品类别添加时间
     *
     * @return product_type_addtime - 商品类别添加时间
     */
    public Date getProductTypeAddtime() {
        return productTypeAddtime;
    }

    /**
     * 设置商品类别添加时间
     *
     * @param productTypeAddtime 商品类别添加时间
     */
    public void setProductTypeAddtime(Date productTypeAddtime) {
        this.productTypeAddtime = productTypeAddtime;
    }
}