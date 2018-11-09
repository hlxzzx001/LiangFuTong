package com.LFT.pojo;

import java.util.Date;
import javax.persistence.*;

@Table(name = "`article_type`")
public class ArticleType {
    /**
     * 文章类别id
     */
    @Id
    @Column(name = "`article_type_id`")
    @GeneratedValue(generator = "JDBC")
    private Integer articleTypeId;

    /**
     * 文章类别名
     */
    @Column(name = "`article_type_name`")
    private String articleTypeName;

    /**
     * 文章类别添加时间
     */
    @Column(name = "`article_type_addtime`")
    private Date articleTypeAddtime;

    /**
     * 获取文章类别id
     *
     * @return article_type_id - 文章类别id
     */
    public Integer getArticleTypeId() {
        return articleTypeId;
    }

    /**
     * 设置文章类别id
     *
     * @param articleTypeId 文章类别id
     */
    public void setArticleTypeId(Integer articleTypeId) {
        this.articleTypeId = articleTypeId;
    }

    /**
     * 获取文章类别名
     *
     * @return article_type_name - 文章类别名
     */
    public String getArticleTypeName() {
        return articleTypeName;
    }

    /**
     * 设置文章类别名
     *
     * @param articleTypeName 文章类别名
     */
    public void setArticleTypeName(String articleTypeName) {
        this.articleTypeName = articleTypeName;
    }

    /**
     * 获取文章类别添加时间
     *
     * @return article_type_addtime - 文章类别添加时间
     */
    public Date getArticleTypeAddtime() {
        return articleTypeAddtime;
    }

    /**
     * 设置文章类别添加时间
     *
     * @param articleTypeAddtime 文章类别添加时间
     */
    public void setArticleTypeAddtime(Date articleTypeAddtime) {
        this.articleTypeAddtime = articleTypeAddtime;
    }
}