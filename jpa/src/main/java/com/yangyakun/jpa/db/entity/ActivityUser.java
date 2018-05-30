package com.yangyakun.jpa.db.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

@Entity(name = "activity_user")
public class ActivityUser implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue
    private Integer id;
    @Column
    private Integer activiyId;
    @Column
    private Integer activityMemberId;

    public ActivityUser(Integer activiyId, Integer activityMemberId) {
        this.activiyId = activiyId;
        this.activityMemberId = activityMemberId;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getActiviyId() {
        return activiyId;
    }

    public void setActiviyId(Integer activiyId) {
        this.activiyId = activiyId;
    }

    public Integer getActivityMemberId() {
        return activityMemberId;
    }

    public void setActivityMemberId(Integer activityMemberId) {
        this.activityMemberId = activityMemberId;
    }

    @Override
    public String toString() {
        return "ActivityUser{" +
                "id=" + id +
                ", activiyId=" + activiyId +
                ", activityMemberId=" + activityMemberId +
                '}';
    }
}
