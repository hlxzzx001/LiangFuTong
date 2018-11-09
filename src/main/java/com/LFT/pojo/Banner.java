package com.LFT.pojo;

import java.util.Date;
import javax.persistence.*;

@Table(name = "`banner`")
public class Banner {
    /**
     * bannerid
     */
    @Id
    @Column(name = "`banner_id`")
    @GeneratedValue(generator = "JDBC")
    private Integer bannerId;

    /**
     * 图片地址
     */
    @Column(name = "`banner_pictrue`")
    private String bannerPictrue;

    /**
     * 文章id
     */
    @Column(name = "`article_id`")
    private Integer articleId;

    /**
     * 添加时间
     */
    @Column(name = "`banner_addtime`")
    private Date bannerAddtime;

    /**
     * 状态
     */
    @Column(name = "`banner_status`")
    private Integer bannerStatus;

    /**
     * 连接地址
     */
    @Column(name = "`banner_address`")
    private String bannerAddress;

    /**
     * 获取bannerid
     *
     * @return banner_id - bannerid
     */
    public Integer getBannerId() {
        return bannerId;
    }

    /**
     * 设置bannerid
     *
     * @param bannerId bannerid
     */
    public void setBannerId(Integer bannerId) {
        this.bannerId = bannerId;
    }

    /**
     * 获取图片地址
     *
     * @return banner_pictrue - 图片地址
     */
    public String getBannerPictrue() {
        return bannerPictrue;
    }

    /**
     * 设置图片地址
     *
     * @param bannerPictrue 图片地址
     */
    public void setBannerPictrue(String bannerPictrue) {
        this.bannerPictrue = bannerPictrue;
    }

    /**
     * 获取文章id
     *
     * @return article_id - 文章id
     */
    public Integer getArticleId() {
        return articleId;
    }

    /**
     * 设置文章id
     *
     * @param articleId 文章id
     */
    public void setArticleId(Integer articleId) {
        this.articleId = articleId;
    }

    /**
     * 获取添加时间
     *
     * @return banner_addtime - 添加时间
     */
    public Date getBannerAddtime() {
        return bannerAddtime;
    }

    /**
     * 设置添加时间
     *
     * @param bannerAddtime 添加时间
     */
    public void setBannerAddtime(Date bannerAddtime) {
        this.bannerAddtime = bannerAddtime;
    }

    /**
     * 获取状态
     *
     * @return banner_status - 状态
     */
    public Integer getBannerStatus() {
        return bannerStatus;
    }

    /**
     * 设置状态
     *
     * @param bannerStatus 状态
     */
    public void setBannerStatus(Integer bannerStatus) {
        this.bannerStatus = bannerStatus;
    }

    /**
     * 获取连接地址
     *
     * @return banner_address - 连接地址
     */
    public String getBannerAddress() {
        return bannerAddress;
    }

    /**
     * 设置连接地址
     *
     * @param bannerAddress 连接地址
     */
    public void setBannerAddress(String bannerAddress) {
        this.bannerAddress = bannerAddress;
    }
}