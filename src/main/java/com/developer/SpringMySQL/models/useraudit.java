package com.developer.SpringMySQL.models;

import javax.annotation.Generated;
import javax.persistence.*;

@Entity
@Table(name="useraudit")
public class useraudit {

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

}
