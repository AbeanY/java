package com.htdz.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Collection;

/**
 * Created by yab on 2017/7/10.
 */
@Entity
@Table(name = "c_basic", schema = "bucket_water_db", catalog = "")
public class CBasic {
    private int cBasicId;
    private String cName;
    private BigDecimal cLong;
    private BigDecimal cLat;
    private String cAptitude1;
    private String cAptitude2;
    private String cAptitude3;
    private String cAptitude4;
    private String cAptitude5;
    private String cComment;
    private Collection<CElectronic> cElectronicsByCBasicId;
    private Collection<GatewayInfo> gatewayInfosByCBasicId;
    private Collection<UserInfo> userInfosByCBasicId;

    @Id
    @Column(name = "c_basic_id", nullable = false)
    public int getcBasicId() {
        return cBasicId;
    }

    public void setcBasicId(int cBasicId) {
        this.cBasicId = cBasicId;
    }

    @Basic
    @Column(name = "c_name", nullable = true, length = 20)
    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName;
    }

    @Basic
    @Column(name = "c_long", nullable = true, precision = 6)
    public BigDecimal getcLong() {
        return cLong;
    }

    public void setcLong(BigDecimal cLong) {
        this.cLong = cLong;
    }

    @Basic
    @Column(name = "c_lat", nullable = true, precision = 6)
    public BigDecimal getcLat() {
        return cLat;
    }

    public void setcLat(BigDecimal cLat) {
        this.cLat = cLat;
    }

    @Basic
    @Column(name = "c_aptitude1", nullable = true, length = 20)
    public String getcAptitude1() {
        return cAptitude1;
    }

    public void setcAptitude1(String cAptitude1) {
        this.cAptitude1 = cAptitude1;
    }

    @Basic
    @Column(name = "c_aptitude2", nullable = true, length = 20)
    public String getcAptitude2() {
        return cAptitude2;
    }

    public void setcAptitude2(String cAptitude2) {
        this.cAptitude2 = cAptitude2;
    }

    @Basic
    @Column(name = "c_aptitude3", nullable = true, length = 20)
    public String getcAptitude3() {
        return cAptitude3;
    }

    public void setcAptitude3(String cAptitude3) {
        this.cAptitude3 = cAptitude3;
    }

    @Basic
    @Column(name = "c_aptitude4", nullable = true, length = 20)
    public String getcAptitude4() {
        return cAptitude4;
    }

    public void setcAptitude4(String cAptitude4) {
        this.cAptitude4 = cAptitude4;
    }

    @Basic
    @Column(name = "c_aptitude5", nullable = true, length = 20)
    public String getcAptitude5() {
        return cAptitude5;
    }

    public void setcAptitude5(String cAptitude5) {
        this.cAptitude5 = cAptitude5;
    }

    @Basic
    @Column(name = "c_comment", nullable = true, length = 45)
    public String getcComment() {
        return cComment;
    }

    public void setcComment(String cComment) {
        this.cComment = cComment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CBasic cBasic = (CBasic) o;

        if (cBasicId != cBasic.cBasicId) return false;
        if (cName != null ? !cName.equals(cBasic.cName) : cBasic.cName != null) return false;
        if (cLong != null ? !cLong.equals(cBasic.cLong) : cBasic.cLong != null) return false;
        if (cLat != null ? !cLat.equals(cBasic.cLat) : cBasic.cLat != null) return false;
        if (cAptitude1 != null ? !cAptitude1.equals(cBasic.cAptitude1) : cBasic.cAptitude1 != null) return false;
        if (cAptitude2 != null ? !cAptitude2.equals(cBasic.cAptitude2) : cBasic.cAptitude2 != null) return false;
        if (cAptitude3 != null ? !cAptitude3.equals(cBasic.cAptitude3) : cBasic.cAptitude3 != null) return false;
        if (cAptitude4 != null ? !cAptitude4.equals(cBasic.cAptitude4) : cBasic.cAptitude4 != null) return false;
        if (cAptitude5 != null ? !cAptitude5.equals(cBasic.cAptitude5) : cBasic.cAptitude5 != null) return false;
        if (cComment != null ? !cComment.equals(cBasic.cComment) : cBasic.cComment != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = cBasicId;
        result = 31 * result + (cName != null ? cName.hashCode() : 0);
        result = 31 * result + (cLong != null ? cLong.hashCode() : 0);
        result = 31 * result + (cLat != null ? cLat.hashCode() : 0);
        result = 31 * result + (cAptitude1 != null ? cAptitude1.hashCode() : 0);
        result = 31 * result + (cAptitude2 != null ? cAptitude2.hashCode() : 0);
        result = 31 * result + (cAptitude3 != null ? cAptitude3.hashCode() : 0);
        result = 31 * result + (cAptitude4 != null ? cAptitude4.hashCode() : 0);
        result = 31 * result + (cAptitude5 != null ? cAptitude5.hashCode() : 0);
        result = 31 * result + (cComment != null ? cComment.hashCode() : 0);
        return result;
    }

    @JsonIgnore
    @OneToMany(mappedBy = "cBasicByCECBId")
    public Collection<CElectronic> getcElectronicsByCBasicId() {
        return cElectronicsByCBasicId;
    }

    public void setcElectronicsByCBasicId(Collection<CElectronic> cElectronicsByCBasicId) {
        this.cElectronicsByCBasicId = cElectronicsByCBasicId;
    }

    @JsonIgnore
    @OneToMany(mappedBy = "cBasicByGCBId")
    public Collection<GatewayInfo> getGatewayInfosByCBasicId() {
        return gatewayInfosByCBasicId;
    }

    public void setGatewayInfosByCBasicId(Collection<GatewayInfo> gatewayInfosByCBasicId) {
        this.gatewayInfosByCBasicId = gatewayInfosByCBasicId;
    }

    @JsonIgnore
    @OneToMany(mappedBy = "cBasicByUserCBId")
    public Collection<UserInfo> getUserInfosByCBasicId() {
        return userInfosByCBasicId;
    }

    public void setUserInfosByCBasicId(Collection<UserInfo> userInfosByCBasicId) {
        this.userInfosByCBasicId = userInfosByCBasicId;
    }
}
