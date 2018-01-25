package com.developer.SpringMySQL.models;

import javax.annotation.Generated;
import javax.persistence.*;

@Entity
@Table(name="USER_AUDIT")
public class UserAudit {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    public String auditId;
    @Column(name="appid")
    public String appId;
    @Column(name="groupid")
    public String groupId;
    @Column(name="userid")
    public String userId;
    @Column(name="event")
    public String event;
    @Column(name="activity")
    public String activityInfo;
    @Column(name="status")
    public String status;
    @Column(name="createddate")
    public String createdDate;


    public String getAuditId() {
        return auditId;
    }

    public void setAuditId(String auditId) {
        this.auditId = auditId;
    }

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }

    public String getActivityInfo() {
        return activityInfo;
    }

    public void setActivityInfo(String activityInfo) {
        this.activityInfo = activityInfo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCreatedDate() {
        return createdDate;
    }

    public void setCreatedDate(String createdDate) {
        this.createdDate = createdDate;
    }

    @Override
    public String toString() {
        return "UserAudit{" +
                "auditId='" + auditId + '\'' +
                ", appId='" + appId + '\'' +
                ", groupId='" + groupId + '\'' +
                ", userId='" + userId + '\'' +
                ", event='" + event + '\'' +
                ", activityInfo='" + activityInfo + '\'' +
                ", status='" + status + '\'' +
                ", createdDate='" + createdDate + '\'' +
                '}';
    }
}
