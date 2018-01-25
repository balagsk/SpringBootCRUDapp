package com.developer.SpringMySQL.models;

import com.fasterxml.jackson.annotation.JsonRootName;
import org.hibernate.annotations.GenericGenerator;
import org.springframework.data.repository.query.Param;

import javax.persistence.*;

/**
 * Created by Bala on 6/25/2017.
 */
@Entity
@Table(name = "USER_PROFILE")
//@JsonRootName("user")
public class User {


    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "USER_SEQ")
    @SequenceGenerator(sequenceName = "customer_seq", allocationSize = 1,initialValue = 100000,  name = "USER_SEQ" )
    public int id;
    @Column(name = "firstname")
    public String firstname;
    @Column(name = "lastname")
    public String lastname;
    @Column(name = "appid")
    public String appid;
    @Column(name = "groupid")
    public String groupid;
    @Column(name = "userid")
    public String userid;
    @Column(name = "mobile")
    public String mobile;
    @Column(name = "email")
    public String email;
    @Column(name = "address")
    public String address;
    @Column(name = "dob")
    public String dob;
    @Column(name = "gender")
    public String gender;
    @Column(name = "maritalstatus")
    public String maritalstatus;
    @Column(name = "lastlogin")
    public String lastlogin;
    @Column(name = "password")
    public String password;
    @Column(name = "status")
    public String status;
    @Column(name = "passwdchangedate")
    public String passwdchangedate;
    @Column(name = "modifieddate")
    public String modifieddate;
    @Column(name = "createddate")
    public String createddate;






    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getMaritalstatus() {
        return maritalstatus;
    }

    public void setMaritalstatus(String maritalstatus) {
        this.maritalstatus = maritalstatus;
    }

    public String getLastlogin() {
        return lastlogin;
    }

    public void setLastlogin(String lastlogin) {
        this.lastlogin = lastlogin;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPasswdchangedate() {
        return passwdchangedate;
    }

    public void setPasswdchangedate(String passwdchangedate) {
        this.passwdchangedate = passwdchangedate;
    }

    public String getModifieddate() {
        return modifieddate;
    }

    public void setModifieddate(String modifieddate) {
        this.modifieddate = modifieddate;
    }

    public String getCreateddate() {
        return createddate;
    }

    public void setCreateddate(String createddate) {
        this.createddate = createddate;
    }

    public String getAppid() {
        return appid;
    }

    public void setAppid(String appid) {
        this.appid = appid;
    }

    public String getGroupid() {
        return groupid;
    }

    public void setGroupid(String groupid) {
        this.groupid = groupid;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstname;
    }

    public void setFirstName(String firstName) {
        this.firstname = firstName;
    }

    public String getLastName() {
        return lastname;
    }

    public void setLastName(String lastName) {
        this.lastname = lastName;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", appid='" + appid + '\'' +
                ", groupid='" + groupid + '\'' +
                ", userid='" + userid + '\'' +
                ", mobile='" + mobile + '\'' +
                ", email='" + email + '\'' +
                ", address='" + address + '\'' +
                ", dob='" + dob + '\'' +
                ", gender='" + gender + '\'' +
                ", maritalstatus='" + maritalstatus + '\'' +
                ", lastlogin='" + lastlogin + '\'' +
                ", password='" + password + '\'' +
                ", status='" + status + '\'' +
                ", passwdchangedate='" + passwdchangedate + '\'' +
                ", modifieddate='" + modifieddate + '\'' +
                ", createddate='" + createddate + '\'' +
                '}';
    }
}
