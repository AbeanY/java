package com.htdz.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.math.BigDecimal;
import java.sql.Timestamp;
import java.util.Collection;

/**
 * Created by yab on 2017/7/10.
 */
@Entity
@Table(name = "gateway_info", schema = "bucket_water_db", catalog = "")
public class GatewayInfo {
    private String gId;
    private Integer gCBId;
    private String gUserName;
    private String gUserPwd;
    private Timestamp gRegTime;
    private String gLink;
    private BigDecimal gLong;
    private BigDecimal gLat;
    private BigDecimal gHeight;
    private CBasic cBasicByGCBId;
    private Collection<RfBasic> rfBasicsByGId;

    @Id
    @Column(name = "g_id", nullable = false, length = 8)
    public String getgId() {
        return gId;
    }

    public void setgId(String gId) {
        this.gId = gId;
    }

/*
    @Basic
    @Column(name = "g_c_b_id", nullable = true)
    public Integer getgCBId() {
        return gCBId;
    }

    public void setgCBId(Integer gCBId) {
        this.gCBId = gCBId;
    }
*/

    @Basic
    @Column(name = "g_user_name", nullable = true, length = 20)
    public String getgUserName() {
        return gUserName;
    }

    public void setgUserName(String gUserName) {
        this.gUserName = gUserName;
    }

    @Basic
    @Column(name = "g_user_pwd", nullable = true, length = 20)
    public String getgUserPwd() {
        return gUserPwd;
    }

    public void setgUserPwd(String gUserPwd) {
        this.gUserPwd = gUserPwd;
    }

    @Basic
    @Column(name = "g_reg_time", nullable = true)
    public Timestamp getgRegTime() {
        return gRegTime;
    }

    public void setgRegTime(Timestamp gRegTime) {
        this.gRegTime = gRegTime;
    }

    @Basic
    @Column(name = "g_link", nullable = true, length = 1)
    public String getgLink() {
        return gLink;
    }

    public void setgLink(String gLink) {
        this.gLink = gLink;
    }

    @Basic
    @Column(name = "g_long", nullable = true, precision = 6)
    public BigDecimal getgLong() {
        return gLong;
    }

    public void setgLong(BigDecimal gLong) {
        this.gLong = gLong;
    }

    @Basic
    @Column(name = "g_lat", nullable = true, precision = 6)
    public BigDecimal getgLat() {
        return gLat;
    }

    public void setgLat(BigDecimal gLat) {
        this.gLat = gLat;
    }

    @Basic
    @Column(name = "g_height", nullable = true, precision = 6)
    public BigDecimal getgHeight() {
        return gHeight;
    }

    public void setgHeight(BigDecimal gHeight) {
        this.gHeight = gHeight;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        GatewayInfo that = (GatewayInfo) o;

        if (gId != null ? !gId.equals(that.gId) : that.gId != null) return false;
        if (gCBId != null ? !gCBId.equals(that.gCBId) : that.gCBId != null) return false;
        if (gUserName != null ? !gUserName.equals(that.gUserName) : that.gUserName != null) return false;
        if (gUserPwd != null ? !gUserPwd.equals(that.gUserPwd) : that.gUserPwd != null) return false;
        if (gRegTime != null ? !gRegTime.equals(that.gRegTime) : that.gRegTime != null) return false;
        if (gLink != null ? !gLink.equals(that.gLink) : that.gLink != null) return false;
        if (gLong != null ? !gLong.equals(that.gLong) : that.gLong != null) return false;
        if (gLat != null ? !gLat.equals(that.gLat) : that.gLat != null) return false;
        if (gHeight != null ? !gHeight.equals(that.gHeight) : that.gHeight != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = gId != null ? gId.hashCode() : 0;
        result = 31 * result + (gCBId != null ? gCBId.hashCode() : 0);
        result = 31 * result + (gUserName != null ? gUserName.hashCode() : 0);
        result = 31 * result + (gUserPwd != null ? gUserPwd.hashCode() : 0);
        result = 31 * result + (gRegTime != null ? gRegTime.hashCode() : 0);
        result = 31 * result + (gLink != null ? gLink.hashCode() : 0);
        result = 31 * result + (gLong != null ? gLong.hashCode() : 0);
        result = 31 * result + (gLat != null ? gLat.hashCode() : 0);
        result = 31 * result + (gHeight != null ? gHeight.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "g_c_b_id", referencedColumnName = "c_basic_id")
    public CBasic getcBasicByGCBId() {
        return cBasicByGCBId;
    }

    public void setcBasicByGCBId(CBasic cBasicByGCBId) {
        this.cBasicByGCBId = cBasicByGCBId;
    }

    @JsonIgnore
    @OneToMany(mappedBy = "gatewayInfoByRfGId")
    public Collection<RfBasic> getRfBasicsByGId() {
        return rfBasicsByGId;
    }

    public void setRfBasicsByGId(Collection<RfBasic> rfBasicsByGId) {
        this.rfBasicsByGId = rfBasicsByGId;
    }
}
