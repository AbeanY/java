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
@Table(name = "b_r2", schema = "bucket_water_db", catalog = "")
public class BR2 {
    private int bR2Id;
    private String bR2BBId;
    private String bR2RfId;
    private Timestamp bR2Time;
    private BigDecimal bR2Long;
    private BigDecimal bR2Lat;
    private Collection<BLife> bLivesByBR2Id;
    private BBasic bBasicByBR2BBId;
    private RfBasic rfBasicByBR2RfId;

    @Id
    @Column(name = "b_r2_id", nullable = false)
    public int getbR2Id() {
        return bR2Id;
    }

    public void setbR2Id(int bR2Id) {
        this.bR2Id = bR2Id;
    }

/*
    @Basic
    @Column(name = "b_r2_b_b_id", nullable = true, length = 8)
    public String getbR2BBId() {
        return bR2BBId;
    }

    public void setbR2BBId(String bR2BBId) {
        this.bR2BBId = bR2BBId;
    }

    @Basic
    @Column(name = "b_r2_rf_id", nullable = true, length = 8)
    public String getbR2RfId() {
        return bR2RfId;
    }

    public void setbR2RfId(String bR2RfId) {
        this.bR2RfId = bR2RfId;
    }
*/

    @Basic
    @Column(name = "b_r2_time", nullable = true)
    public Timestamp getbR2Time() {
        return bR2Time;
    }

    public void setbR2Time(Timestamp bR2Time) {
        this.bR2Time = bR2Time;
    }

    @Basic
    @Column(name = "b_r2_long", nullable = true, precision = 6)
    public BigDecimal getbR2Long() {
        return bR2Long;
    }

    public void setbR2Long(BigDecimal bR2Long) {
        this.bR2Long = bR2Long;
    }

    @Basic
    @Column(name = "b_r2_lat", nullable = true, precision = 6)
    public BigDecimal getbR2Lat() {
        return bR2Lat;
    }

    public void setbR2Lat(BigDecimal bR2Lat) {
        this.bR2Lat = bR2Lat;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BR2 br2 = (BR2) o;

        if (bR2Id != br2.bR2Id) return false;
        if (bR2BBId != null ? !bR2BBId.equals(br2.bR2BBId) : br2.bR2BBId != null) return false;
        if (bR2RfId != null ? !bR2RfId.equals(br2.bR2RfId) : br2.bR2RfId != null) return false;
        if (bR2Time != null ? !bR2Time.equals(br2.bR2Time) : br2.bR2Time != null) return false;
        if (bR2Long != null ? !bR2Long.equals(br2.bR2Long) : br2.bR2Long != null) return false;
        if (bR2Lat != null ? !bR2Lat.equals(br2.bR2Lat) : br2.bR2Lat != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = bR2Id;
        result = 31 * result + (bR2BBId != null ? bR2BBId.hashCode() : 0);
        result = 31 * result + (bR2RfId != null ? bR2RfId.hashCode() : 0);
        result = 31 * result + (bR2Time != null ? bR2Time.hashCode() : 0);
        result = 31 * result + (bR2Long != null ? bR2Long.hashCode() : 0);
        result = 31 * result + (bR2Lat != null ? bR2Lat.hashCode() : 0);
        return result;
    }

    @JsonIgnore
    @OneToMany(mappedBy = "bR2ByBLRefluxId")
    public Collection<BLife> getbLivesByBR2Id() {
        return bLivesByBR2Id;
    }

    public void setbLivesByBR2Id(Collection<BLife> bLivesByBR2Id) {
        this.bLivesByBR2Id = bLivesByBR2Id;
    }

    @ManyToOne
    @JoinColumn(name = "b_r2_b_b_id", referencedColumnName = "bucket_basic_id")
    public BBasic getbBasicByBR2BBId() {
        return bBasicByBR2BBId;
    }

    public void setbBasicByBR2BBId(BBasic bBasicByBR2BBId) {
        this.bBasicByBR2BBId = bBasicByBR2BBId;
    }

    @ManyToOne
    @JoinColumn(name = "b_r2_rf_id", referencedColumnName = "rf_id")
    public RfBasic getRfBasicByBR2RfId() {
        return rfBasicByBR2RfId;
    }

    public void setRfBasicByBR2RfId(RfBasic rfBasicByBR2RfId) {
        this.rfBasicByBR2RfId = rfBasicByBR2RfId;
    }
}
