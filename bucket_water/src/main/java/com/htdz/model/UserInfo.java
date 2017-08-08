package com.htdz.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.Collection;

/**
 * Created by yab on 2017/7/10.
 */
@Entity
@Table(name = "user_info", schema = "bucket_water_db", catalog = "")
public class UserInfo {
    private int userInfoId;
    private Integer userCBId;
    private String userInfoName;
    private String userInfoPwd;
    private String userInfoTel;
    private String userInfoType;
    private String userInfoLimit;
    private Collection<BJStatic> bJStaticsByUserInfoId;
    private Collection<BSStatics> bSStaticsByUserInfoId;
    private CBasic cBasicByUserCBId;
    private Collection<UserLogInfo> userLogInfosByUserInfoId;

    @Id
    @Column(name = "user_info_id", nullable = false)
    public int getUserInfoId() {
        return userInfoId;
    }

    public void setUserInfoId(int userInfoId) {
        this.userInfoId = userInfoId;
    }

   /* @Basic
    @Column(name = "user_c_b_id", nullable = true)
    public Integer getUserCBId() {
        return userCBId;
    }

    public void setUserCBId(Integer userCBId) {
        this.userCBId = userCBId;
    }*/

    @Basic
    @Column(name = "user_info_name", nullable = true, length = 10)
    public String getUserInfoName() {
        return userInfoName;
    }

    public void setUserInfoName(String userInfoName) {
        this.userInfoName = userInfoName;
    }

    @Basic
    @Column(name = "user_info_pwd", nullable = true, length = 16)
    public String getUserInfoPwd() {
        return userInfoPwd;
    }

    public void setUserInfoPwd(String userInfoPwd) {
        this.userInfoPwd = userInfoPwd;
    }

    @Basic
    @Column(name = "user_info_tel", nullable = true, length = 16)
    public String getUserInfoTel() {
        return userInfoTel;
    }

    public void setUserInfoTel(String userInfoTel) {
        this.userInfoTel = userInfoTel;
    }

    @Basic
    @Column(name = "user_info_type", nullable = true, length = 1)
    public String getUserInfoType() {
        return userInfoType;
    }

    public void setUserInfoType(String userInfoType) {
        this.userInfoType = userInfoType;
    }

    @Basic
    @Column(name = "user_info_limit", nullable = true, length = 1)
    public String getUserInfoLimit() {
        return userInfoLimit;
    }

    public void setUserInfoLimit(String userInfoLimit) {
        this.userInfoLimit = userInfoLimit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserInfo userInfo = (UserInfo) o;

        if (userInfoId != userInfo.userInfoId) return false;
        if (userCBId != null ? !userCBId.equals(userInfo.userCBId) : userInfo.userCBId != null) return false;
        if (userInfoName != null ? !userInfoName.equals(userInfo.userInfoName) : userInfo.userInfoName != null)
            return false;
        if (userInfoPwd != null ? !userInfoPwd.equals(userInfo.userInfoPwd) : userInfo.userInfoPwd != null)
            return false;
        if (userInfoTel != null ? !userInfoTel.equals(userInfo.userInfoTel) : userInfo.userInfoTel != null)
            return false;
        if (userInfoType != null ? !userInfoType.equals(userInfo.userInfoType) : userInfo.userInfoType != null)
            return false;
        if (userInfoLimit != null ? !userInfoLimit.equals(userInfo.userInfoLimit) : userInfo.userInfoLimit != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = userInfoId;
        result = 31 * result + (userCBId != null ? userCBId.hashCode() : 0);
        result = 31 * result + (userInfoName != null ? userInfoName.hashCode() : 0);
        result = 31 * result + (userInfoPwd != null ? userInfoPwd.hashCode() : 0);
        result = 31 * result + (userInfoTel != null ? userInfoTel.hashCode() : 0);
        result = 31 * result + (userInfoType != null ? userInfoType.hashCode() : 0);
        result = 31 * result + (userInfoLimit != null ? userInfoLimit.hashCode() : 0);
        return result;
    }

    @JsonIgnore
    @OneToMany(mappedBy = "userInfoByBJUserId")
    public Collection<BJStatic> getbJStaticsByUserInfoId() {
        return bJStaticsByUserInfoId;
    }

    public void setbJStaticsByUserInfoId(Collection<BJStatic> bJStaticsByUserInfoId) {
        this.bJStaticsByUserInfoId = bJStaticsByUserInfoId;
    }

    @JsonIgnore
    @OneToMany(mappedBy = "userInfoByBSUserId")
    public Collection<BSStatics> getbSStaticsByUserInfoId() {
        return bSStaticsByUserInfoId;
    }

    public void setbSStaticsByUserInfoId(Collection<BSStatics> bSStaticsByUserInfoId) {
        this.bSStaticsByUserInfoId = bSStaticsByUserInfoId;
    }

    @ManyToOne
    @JoinColumn(name = "user_c_b_id", referencedColumnName = "c_basic_id")
    public CBasic getcBasicByUserCBId() {
        return cBasicByUserCBId;
    }

    public void setcBasicByUserCBId(CBasic cBasicByUserCBId) {
        this.cBasicByUserCBId = cBasicByUserCBId;
    }

    @JsonIgnore
    @OneToMany(mappedBy = "userInfoByLogUserId")
    public Collection<UserLogInfo> getUserLogInfosByUserInfoId() {
        return userLogInfosByUserInfoId;
    }

    public void setUserLogInfosByUserInfoId(Collection<UserLogInfo> userLogInfosByUserInfoId) {
        this.userLogInfosByUserInfoId = userLogInfosByUserInfoId;
    }
}
