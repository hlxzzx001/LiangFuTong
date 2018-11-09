package com.LFT.pojo;

import java.util.Date;
import javax.persistence.*;

@Table(name = "`article`")
public class Article {
    /**
     * 文章id
     */
    @Id
    @Column(name = "`article_id`")
    @GeneratedValue(generator = "JDBC")
    private Integer articleId;

    /**
     * 发布人id
     */
    @Column(name = "`user_id`")
    private Integer userId;

    /**
     * 文章标题
     */
    @Column(name = "`article_title`")
    private String articleTitle;

    /**
     * 文章内容
     */
    @Column(name = "`article_content`")
    private String articleContent;

    /**
     * 文章视频
     */
    @Column(name = "`article_video`")
    private String articleVideo;

    /**
     * 文件附件
     */
    @Column(name = "`article_attachment`")
    private String articleAttachment;

    /**
     * 文章添加时间
     */
    @Column(name = "`article_addtime`")
    private Date articleAddtime;

    /**
     * 文章更新时间
     */
    @Column(name = "`article_updatetime`")
    private Date articleUpdatetime;

    /**
     * 文章状态
     */
    @Column(name = "`article_status`")
    private Integer articleStatus;

    /**
     * 文章类别
     */
    @Column(name = "`article_type`")
    private Integer articleType;

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
     * 获取发布人id
     *
     * @return user_id - 发布人id
     */
    public Integer getUserId() {
        return userId;
    }

    /**
     * 设置发布人id
     *
     * @param userId 发布人id
     */
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    /**
     * 获取文章标题
     *
     * @return article_title - 文章标题
     */
    public String getArticleTitle() {
        return articleTitle;
    }

    /**
     * 设置文章标题
     *
     * @param articleTitle 文章标题
     */
    public void setArticleTitle(String articleTitle) {
        this.articleTitle = articleTitle;
    }

    /**
     * 获取文章内容
     *
     * @return article_content - 文章内容
     */
    public String getArticleContent() {
        return articleContent;
    }

    /**
     * 设置文章内容
     *
     * @param articleContent 文章内容
     */
    public void setArticleContent(String articleContent) {
        this.articleContent = articleContent;
    }

    /**
     * 获取文章视频
     *
     * @return article_video - 文章视频
     */
    public String getArticleVideo() {
        return articleVideo;
    }

    /**
     * 设置文章视频
     *
     * @param articleVideo 文章视频
     */
    public void setArticleVideo(String articleVideo) {
        this.articleVideo = articleVideo;
    }

    /**
     * 获取文件附件
     *
     * @return article_attachment - 文件附件
     */
    public String getArticleAttachment() {
        return articleAttachment;
    }

    /**
     * 设置文件附件
     *
     * @param articleAttachment 文件附件
     */
    public void setArticleAttachment(String articleAttachment) {
        this.articleAttachment = articleAttachment;
    }

    /**
     * 获取文章添加时间
     *
     * @return article_addtime - 文章添加时间
     */
    public Date getArticleAddtime() {
        return articleAddtime;
    }

    /**
     * 设置文章添加时间
     *
     * @param articleAddtime 文章添加时间
     */
    public void setArticleAddtime(Date articleAddtime) {
        this.articleAddtime = articleAddtime;
    }

    /**
     * 获取文章更新时间
     *
     * @return article_updatetime - 文章更新时间
     */
    public Date getArticleUpdatetime() {
        return articleUpdatetime;
    }

    /**
     * 设置文章更新时间
     *
     * @param articleUpdatetime 文章更新时间
     */
    public void setArticleUpdatetime(Date articleUpdatetime) {
        this.articleUpdatetime = articleUpdatetime;
    }

    /**
     * 获取文章状态
     *
     * @return article_status - 文章状态
     */
    public Integer getArticleStatus() {
        return articleStatus;
    }

    /**
     * 设置文章状态
     *
     * @param articleStatus 文章状态
     */
    public void setArticleStatus(Integer articleStatus) {
        this.articleStatus = articleStatus;
    }

    /**
     * 获取文章类别
     *
     * @return article_type - 文章类别
     */
    public Integer getArticleType() {
        return articleType;
    }

    /**
     * 设置文章类别
     *
     * @param articleType 文章类别
     */
    public void setArticleType(Integer articleType) {
        this.articleType = articleType;
    }
}