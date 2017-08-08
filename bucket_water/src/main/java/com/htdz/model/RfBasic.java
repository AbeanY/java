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
@Table(name = "rf_basic", schema = "bucket_water_db", catalog = "")
public class RfBasic {
    private String rfId;
    private String rfGId;
    private Timestamp rfRegTime;
    private String rfWaterPlant;
    private String rfLink;
    private BigDecimal rfLong;
    private BigDecimal rfLat;
    private BigDecimal rfHeight;
    private String rfProduceName;
    private String rfWaterType;
    private String rfWaterBrand;
    private String rfBProSide;
    private String rfBOwnSide;
    private String rfBLegalUse;
    private Collection<BR0> bR0sByRfId;
    private Collection<BR1> bR1sByRfId;
    private Collection<BR10> bR10sByRfId;
    private Collection<BR11> bR11sByRfId;
    private Collection<BR2> bR2sByRfId;
    private Collection<BR3> bR3sByRfId;
    private Collection<BR4> bR4sByRfId;
    private Collection<BR6> bR6sByRfId;
    private GatewayInfo gatewayInfoByRfGId;

    @Id
    @Column(name = "rf_id", nullable = false, length = 8)
    public String getRfId() {
        return rfId;
    }

    public void setRfId(String rfId) {
        this.rfId = rfId;
    }
/*

    @Basic
    @Column(name = "rf_g_id", nullable = true, length = 8)
    public String getRfGId() {
        return rfGId;
    }

    public void setRfGId(String rfGId) {
        this.rfGId = rfGId;
    }
*/

    @Basic
    @Column(name = "rf_reg_time", nullable = true)
    public Timestamp getRfRegTime() {
        return rfRegTime;
    }

    public void setRfRegTime(Timestamp rfRegTime) {
        this.rfRegTime = rfRegTime;
    }

    @Basic
    @Column(name = "rf_water_plant", nullable = true, length = 20)
    public String getRfWaterPlant() {
        return rfWaterPlant;
    }

    public void setRfWaterPlant(String rfWaterPlant) {
        this.rfWaterPlant = rfWaterPlant;
    }

    @Basic
    @Column(name = "rf_link", nullable = true, length = 1)
    public String getRfLink() {
        return rfLink;
    }

    public void setRfLink(String rfLink) {
        this.rfLink = rfLink;
    }

    @Basic
    @Column(name = "rf_long", nullable = true, precision = 6)
    public BigDecimal getRfLong() {
        return rfLong;
    }

    public void setRfLong(BigDecimal rfLong) {
        this.rfLong = rfLong;
    }

    @Basic
    @Column(name = "rf_lat", nullable = true, precision = 6)
    public BigDecimal getRfLat() {
        return rfLat;
    }

    public void setRfLat(BigDecimal rfLat) {
        this.rfLat = rfLat;
    }

    @Basic
    @Column(name = "rf_height", nullable = true, precision = 6)
    public BigDecimal getRfHeight() {
        return rfHeight;
    }

    public void setRfHeight(BigDecimal rfHeight) {
        this.rfHeight = rfHeight;
    }

    @Basic
    @Column(name = "rf_produce_name", nullable = true, length = 20)
    public String getRfProduceName() {
        return rfProduceName;
    }

    public void setRfProduceName(String rfProduceName) {
        this.rfProduceName = rfProduceName;
    }

    @Basic
    @Column(name = "rf_water_type", nullable = true, length = 1)
    public String getRfWaterType() {
        return rfWaterType;
    }

    public void setRfWaterType(String rfWaterType) {
        this.rfWaterType = rfWaterType;
    }

    @Basic
    @Column(name = "rf_water_brand", nullable = true, length = 1)
    public String getRfWaterBrand() {
        return rfWaterBrand;
    }

    public void setRfWaterBrand(String rfWaterBrand) {
        this.rfWaterBrand = rfWaterBrand;
    }

    @Basic
    @Column(name = "rf_b_pro_side", nullable = true, length = 20)
    public String getRfBProSide() {
        return rfBProSide;
    }

    public void setRfBProSide(String rfBProSide) {
        this.rfBProSide = rfBProSide;
    }

    @Basic
    @Column(name = "rf_b_own_side", nullable = true, length = 20)
    public String getRfBOwnSide() {
        return rfBOwnSide;
    }

    public void setRfBOwnSide(String rfBOwnSide) {
        this.rfBOwnSide = rfBOwnSide;
    }

    @Basic
    @Column(name = "rf_b_legal_use", nullable = true, length = 20)
    public String getRfBLegalUse() {
        return rfBLegalUse;
    }

    public void setRfBLegalUse(String rfBLegalUse) {
        this.rfBLegalUse = rfBLegalUse;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        RfBasic rfBasic = (RfBasic) o;

        if (rfId != null ? !rfId.equals(rfBasic.rfId) : rfBasic.rfId != null) return false;
        if (rfGId != null ? !rfGId.equals(rfBasic.rfGId) : rfBasic.rfGId != null) return false;
        if (rfRegTime != null ? !rfRegTime.equals(rfBasic.rfRegTime) : rfBasic.rfRegTime != null) return false;
        if (rfWaterPlant != null ? !rfWaterPlant.equals(rfBasic.rfWaterPlant) : rfBasic.rfWaterPlant != null)
            return false;
        if (rfLink != null ? !rfLink.equals(rfBasic.rfLink) : rfBasic.rfLink != null) return false;
        if (rfLong != null ? !rfLong.equals(rfBasic.rfLong) : rfBasic.rfLong != null) return false;
        if (rfLat != null ? !rfLat.equals(rfBasic.rfLat) : rfBasic.rfLat != null) return false;
        if (rfHeight != null ? !rfHeight.equals(rfBasic.rfHeight) : rfBasic.rfHeight != null) return false;
        if (rfProduceName != null ? !rfProduceName.equals(rfBasic.rfProduceName) : rfBasic.rfProduceName != null)
            return false;
        if (rfWaterType != null ? !rfWaterType.equals(rfBasic.rfWaterType) : rfBasic.rfWaterType != null) return false;
        if (rfWaterBrand != null ? !rfWaterBrand.equals(rfBasic.rfWaterBrand) : rfBasic.rfWaterBrand != null)
            return false;
        if (rfBProSide != null ? !rfBProSide.equals(rfBasic.rfBProSide) : rfBasic.rfBProSide != null) return false;
        if (rfBOwnSide != null ? !rfBOwnSide.equals(rfBasic.rfBOwnSide) : rfBasic.rfBOwnSide != null) return false;
        if (rfBLegalUse != null ? !rfBLegalUse.equals(rfBasic.rfBLegalUse) : rfBasic.rfBLegalUse != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = rfId != null ? rfId.hashCode() : 0;
        result = 31 * result + (rfGId != null ? rfGId.hashCode() : 0);
        result = 31 * result + (rfRegTime != null ? rfRegTime.hashCode() : 0);
        result = 31 * result + (rfWaterPlant != null ? rfWaterPlant.hashCode() : 0);
        result = 31 * result + (rfLink != null ? rfLink.hashCode() : 0);
        result = 31 * result + (rfLong != null ? rfLong.hashCode() : 0);
        result = 31 * result + (rfLat != null ? rfLat.hashCode() : 0);
        result = 31 * result + (rfHeight != null ? rfHeight.hashCode() : 0);
        result = 31 * result + (rfProduceName != null ? rfProduceName.hashCode() : 0);
        result = 31 * result + (rfWaterType != null ? rfWaterType.hashCode() : 0);
        result = 31 * result + (rfWaterBrand != null ? rfWaterBrand.hashCode() : 0);
        result = 31 * result + (rfBProSide != null ? rfBProSide.hashCode() : 0);
        result = 31 * result + (rfBOwnSide != null ? rfBOwnSide.hashCode() : 0);
        result = 31 * result + (rfBLegalUse != null ? rfBLegalUse.hashCode() : 0);
        return result;
    }

    @JsonIgnore
    @OneToMany(mappedBy = "rfBasicByBR0RfId")
    public Collection<BR0> getbR0sByRfId() {
        return bR0sByRfId;
    }


    public void setbR0sByRfId(Collection<BR0> bR0sByRfId) {
        this.bR0sByRfId = bR0sByRfId;
    }

    @JsonIgnore
    @OneToMany(mappedBy = "rfBasicByBR1RfId")
    public Collection<BR1> getbR1sByRfId() {
        return bR1sByRfId;
    }


    public void setbR1sByRfId(Collection<BR1> bR1sByRfId) {
        this.bR1sByRfId = bR1sByRfId;
    }

    @JsonIgnore
    @OneToMany(mappedBy = "rfBasicByBR10RfId")
    public Collection<BR10> getbR10sByRfId() {
        return bR10sByRfId;
    }

    public void setbR10sByRfId(Collection<BR10> bR10sByRfId) {
        this.bR10sByRfId = bR10sByRfId;
    }

    @JsonIgnore
    @OneToMany(mappedBy = "rfBasicByBR11RfId")
    public Collection<BR11> getbR11sByRfId() {
        return bR11sByRfId;
    }

    public void setbR11sByRfId(Collection<BR11> bR11sByRfId) {
        this.bR11sByRfId = bR11sByRfId;
    }

    @JsonIgnore
    @OneToMany(mappedBy = "rfBasicByBR2RfId")
    public Collection<BR2> getbR2sByRfId() {
        return bR2sByRfId;
    }

    public void setbR2sByRfId(Collection<BR2> bR2sByRfId) {
        this.bR2sByRfId = bR2sByRfId;
    }

    @JsonIgnore
    @OneToMany(mappedBy = "rfBasicByBR3RfId")
    public Collection<BR3> getbR3sByRfId() {
        return bR3sByRfId;
    }

    public void setbR3sByRfId(Collection<BR3> bR3sByRfId) {
        this.bR3sByRfId = bR3sByRfId;
    }

    @JsonIgnore
    @OneToMany(mappedBy = "rfBasicByBR4RfId")
    public Collection<BR4> getbR4sByRfId() {
        return bR4sByRfId;
    }

    public void setbR4sByRfId(Collection<BR4> bR4sByRfId) {
        this.bR4sByRfId = bR4sByRfId;
    }

    @JsonIgnore
    @OneToMany(mappedBy = "rfBasicByBR6RfId")
    public Collection<BR6> getbR6sByRfId() {
        return bR6sByRfId;
    }

    public void setbR6sByRfId(Collection<BR6> bR6sByRfId) {
        this.bR6sByRfId = bR6sByRfId;
    }

    @ManyToOne
    @JoinColumn(name = "rf_g_id", referencedColumnName = "g_id")
    public GatewayInfo getGatewayInfoByRfGId() {
        return gatewayInfoByRfGId;
    }

    public void setGatewayInfoByRfGId(GatewayInfo gatewayInfoByRfGId) {
        this.gatewayInfoByRfGId = gatewayInfoByRfGId;
    }
}
