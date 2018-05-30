package com.yangyakun.jpa.db.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;
import java.sql.Timestamp;

@Entity
public class Activity implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue
    private Integer id;
    @Column(nullable = false)
    private String address;
    @Column(nullable = false)
    private Integer number;
    @Column(nullable = false)
    private String info;
    @Column(nullable = false)
    private Integer createUserId;
    @Column(nullable = false)
    private Timestamp activityDate;
    @Column(nullable = false)
    private Timestamp createDate;

    public Activity(String address, Integer number, String info, Integer createUserId, Timestamp activityDate, Timestamp createDate) {
        this.address = address;
        this.number = number;
        this.info = info;
        this.createUserId = createUserId;
        this.activityDate = activityDate;
        this.createDate = createDate;
    }

    public Activity() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }

    public Integer getCreateUserId() {
        return createUserId;
    }

    public void setCreateUserId(Integer createUserId) {
        this.createUserId = createUserId;
    }

    public Timestamp getActivityDate() {
        return activityDate;
    }

    public void setActivityDate(Timestamp activityDate) {
        this.activityDate = activityDate;
    }

    public Timestamp getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Timestamp createDate) {
        this.createDate = createDate;
    }

    @Override
    public String toString() {
        return "Activity{" +
                "id=" + id +
                ", address='" + address + '\'' +
                ", number=" + number +
                ", info='" + info + '\'' +
                ", createUserId=" + createUserId +
                ", activityDate=" + activityDate +
                ", createDate=" + createDate +
                '}';
    }
}

