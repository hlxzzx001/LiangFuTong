package com.LFT.pojo;

import java.util.Date;
import javax.persistence.*;

@Table(name = "`activities`")
public class Activities {
    /**
     * 活动id
     */
    @Id
    @Column(name = "`activitie_id`")
    @GeneratedValue(generator = "JDBC")
    private Integer activitieId;

    /**
     * 活动名称
     */
    @Column(name = "`activities_name`")
    private String activitiesName;

    /**
     * 活动开始时间
     */
    @Column(name = "`activities_start`")
    private Date activitiesStart;

    /**
     * 活动结束时间
     */
    @Column(name = "`activities_over`")
    private Date activitiesOver;

    /**
     * 获取活动id
     *
     * @return activitie_id - 活动id
     */
    public Integer getActivitieId() {
        return activitieId;
    }

    /**
     * 设置活动id
     *
     * @param activitieId 活动id
     */
    public void setActivitieId(Integer activitieId) {
        this.activitieId = activitieId;
    }

    /**
     * 获取活动名称
     *
     * @return activities_name - 活动名称
     */
    public String getActivitiesName() {
        return activitiesName;
    }

    /**
     * 设置活动名称
     *
     * @param activitiesName 活动名称
     */
    public void setActivitiesName(String activitiesName) {
        this.activitiesName = activitiesName;
    }

    /**
     * 获取活动开始时间
     *
     * @return activities_start - 活动开始时间
     */
    public Date getActivitiesStart() {
        return activitiesStart;
    }

    /**
     * 设置活动开始时间
     *
     * @param activitiesStart 活动开始时间
     */
    public void setActivitiesStart(Date activitiesStart) {
        this.activitiesStart = activitiesStart;
    }

    /**
     * 获取活动结束时间
     *
     * @return activities_over - 活动结束时间
     */
    public Date getActivitiesOver() {
        return activitiesOver;
    }

    /**
     * 设置活动结束时间
     *
     * @param activitiesOver 活动结束时间
     */
    public void setActivitiesOver(Date activitiesOver) {
        this.activitiesOver = activitiesOver;
    }
}