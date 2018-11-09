package com.LFT.pojo;

import java.util.Date;
import javax.persistence.*;

@Table(name = "`mission`")
public class Mission {
    /**
     * 任务id
     */
    @Id
    @Column(name = "`mission_id`")
    @GeneratedValue(generator = "JDBC")
    private Integer missionId;

    /**
     * 发布人id
     */
    @Column(name = "`pubuser_id`")
    private Integer pubuserId;

    /**
     * 任务发布时间
     */
    @Column(name = "`mission_pubdate`")
    private Date missionPubdate;

    /**
     * 任务报酬
     */
    @Column(name = "`mission_salary`")
    private Double missionSalary;

    /**
     * 任务内容
     */
    @Column(name = "`mission_content`")
    private String missionContent;

    /**
     * 任务地点
     */
    @Column(name = "`mission_position`")
    private String missionPosition;

    /**
     * 任务状态
     */
    @Column(name = "`mission_status`")
    private Integer missionStatus;

    /**
     * 任务被接受时间
     */
    @Column(name = "`mission_received`")
    private Date missionReceived;

    /**
     * 任务完成时间
     */
    @Column(name = "`mission_complete`")
    private Date missionComplete;

    /**
     * 任务确认完成时间
     */
    @Column(name = "`mission_confirm`")
    private Date missionConfirm;

    /**
     * 任务审核通过时间
     */
    @Column(name = "`mission_check`")
    private Date missionCheck;

    /**
     * 接收人id
     */
    @Column(name = "`recuser_id`")
    private Integer recuserId;

    /**
     * 获取任务id
     *
     * @return mission_id - 任务id
     */
    public Integer getMissionId() {
        return missionId;
    }

    /**
     * 设置任务id
     *
     * @param missionId 任务id
     */
    public void setMissionId(Integer missionId) {
        this.missionId = missionId;
    }

    /**
     * 获取发布人id
     *
     * @return pubuser_id - 发布人id
     */
    public Integer getPubuserId() {
        return pubuserId;
    }

    /**
     * 设置发布人id
     *
     * @param pubuserId 发布人id
     */
    public void setPubuserId(Integer pubuserId) {
        this.pubuserId = pubuserId;
    }

    /**
     * 获取任务发布时间
     *
     * @return mission_pubdate - 任务发布时间
     */
    public Date getMissionPubdate() {
        return missionPubdate;
    }

    /**
     * 设置任务发布时间
     *
     * @param missionPubdate 任务发布时间
     */
    public void setMissionPubdate(Date missionPubdate) {
        this.missionPubdate = missionPubdate;
    }

    /**
     * 获取任务报酬
     *
     * @return mission_salary - 任务报酬
     */
    public Double getMissionSalary() {
        return missionSalary;
    }

    /**
     * 设置任务报酬
     *
     * @param missionSalary 任务报酬
     */
    public void setMissionSalary(Double missionSalary) {
        this.missionSalary = missionSalary;
    }

    /**
     * 获取任务内容
     *
     * @return mission_content - 任务内容
     */
    public String getMissionContent() {
        return missionContent;
    }

    /**
     * 设置任务内容
     *
     * @param missionContent 任务内容
     */
    public void setMissionContent(String missionContent) {
        this.missionContent = missionContent;
    }

    /**
     * 获取任务地点
     *
     * @return mission_position - 任务地点
     */
    public String getMissionPosition() {
        return missionPosition;
    }

    /**
     * 设置任务地点
     *
     * @param missionPosition 任务地点
     */
    public void setMissionPosition(String missionPosition) {
        this.missionPosition = missionPosition;
    }

    /**
     * 获取任务状态
     *
     * @return mission_status - 任务状态
     */
    public Integer getMissionStatus() {
        return missionStatus;
    }

    /**
     * 设置任务状态
     *
     * @param missionStatus 任务状态
     */
    public void setMissionStatus(Integer missionStatus) {
        this.missionStatus = missionStatus;
    }

    /**
     * 获取任务被接受时间
     *
     * @return mission_received - 任务被接受时间
     */
    public Date getMissionReceived() {
        return missionReceived;
    }

    /**
     * 设置任务被接受时间
     *
     * @param missionReceived 任务被接受时间
     */
    public void setMissionReceived(Date missionReceived) {
        this.missionReceived = missionReceived;
    }

    /**
     * 获取任务完成时间
     *
     * @return mission_complete - 任务完成时间
     */
    public Date getMissionComplete() {
        return missionComplete;
    }

    /**
     * 设置任务完成时间
     *
     * @param missionComplete 任务完成时间
     */
    public void setMissionComplete(Date missionComplete) {
        this.missionComplete = missionComplete;
    }

    /**
     * 获取任务确认完成时间
     *
     * @return mission_confirm - 任务确认完成时间
     */
    public Date getMissionConfirm() {
        return missionConfirm;
    }

    /**
     * 设置任务确认完成时间
     *
     * @param missionConfirm 任务确认完成时间
     */
    public void setMissionConfirm(Date missionConfirm) {
        this.missionConfirm = missionConfirm;
    }

    /**
     * 获取任务审核通过时间
     *
     * @return mission_check - 任务审核通过时间
     */
    public Date getMissionCheck() {
        return missionCheck;
    }

    /**
     * 设置任务审核通过时间
     *
     * @param missionCheck 任务审核通过时间
     */
    public void setMissionCheck(Date missionCheck) {
        this.missionCheck = missionCheck;
    }

    /**
     * 获取接收人id
     *
     * @return recuser_id - 接收人id
     */
    public Integer getRecuserId() {
        return recuserId;
    }

    /**
     * 设置接收人id
     *
     * @param recuserId 接收人id
     */
    public void setRecuserId(Integer recuserId) {
        this.recuserId = recuserId;
    }
}