package com.htdz.model;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by yab on 2017/7/10.
 */
@Entity
@Table(name = "user_log_info", schema = "bucket_water_db", catalog = "")
public class UserLogInfo {
    private int logId;
    private Integer logUserId;
    private Timestamp logTime;
    private String logIp;
    private String logOs;
    private String logBrower;
    private UserInfo userInfoByLogUserId;

    @Id
    @Column(name = "log_id", nullable = false)
    public int getLogId() {
        return logId;
    }

    public void setLogId(int logId) {
        this.logId = logId;
    }

 /*   @Basic
    @Column(name = "log_user_id", nullable = true)
    public Integer getLogUserId() {
        return logUserId;
    }

    public void setLogUserId(Integer logUserId) {
        this.logUserId = logUserId;
    }*/

    @Basic
    @Column(name = "log_time", nullable = true)
    public Timestamp getLogTime() {
        return logTime;
    }

    public void setLogTime(Timestamp logTime) {
        this.logTime = logTime;
    }

    @Basic
    @Column(name = "log_ip", nullable = true, length = 20)
    public String getLogIp() {
        return logIp;
    }

    public void setLogIp(String logIp) {
        this.logIp = logIp;
    }

    @Basic
    @Column(name = "log_os", nullable = true, length = 20)
    public String getLogOs() {
        return logOs;
    }

    public void setLogOs(String logOs) {
        this.logOs = logOs;
    }

    @Basic
    @Column(name = "log_brower", nullable = true, length = 20)
    public String getLogBrower() {
        return logBrower;
    }

    public void setLogBrower(String logBrower) {
        this.logBrower = logBrower;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserLogInfo that = (UserLogInfo) o;

        if (logId != that.logId) return false;
        if (logUserId != null ? !logUserId.equals(that.logUserId) : that.logUserId != null) return false;
        if (logTime != null ? !logTime.equals(that.logTime) : that.logTime != null) return false;
        if (logIp != null ? !logIp.equals(that.logIp) : that.logIp != null) return false;
        if (logOs != null ? !logOs.equals(that.logOs) : that.logOs != null) return false;
        if (logBrower != null ? !logBrower.equals(that.logBrower) : that.logBrower != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = logId;
        result = 31 * result + (logUserId != null ? logUserId.hashCode() : 0);
        result = 31 * result + (logTime != null ? logTime.hashCode() : 0);
        result = 31 * result + (logIp != null ? logIp.hashCode() : 0);
        result = 31 * result + (logOs != null ? logOs.hashCode() : 0);
        result = 31 * result + (logBrower != null ? logBrower.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "log_user_id", referencedColumnName = "user_info_id")
    public UserInfo getUserInfoByLogUserId() {
        return userInfoByLogUserId;
    }

    public void setUserInfoByLogUserId(UserInfo userInfoByLogUserId) {
        this.userInfoByLogUserId = userInfoByLogUserId;
    }
}
