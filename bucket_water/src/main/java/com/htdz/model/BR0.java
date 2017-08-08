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
@Table(name = "b_r0", schema = "bucket_water_db", catalog = "")
public class BR0 {
    private int bR0Id;
    private String bR0BBId;
    private String bR0RfId;
    private Timestamp bR0Time;
    private BigDecimal bR0Long;
    private BigDecimal bR0Lat;
    private Collection<BLife> bLivesByBR0Id;
    private BBasic bBasicByBR0BBId;
    private RfBasic rfBasicByBR0RfId;

    @Id
    @Column(name = "b_r0_id", nullable = false)
    public int getbR0Id() {
        return bR0Id;
    }

    public void setbR0Id(int bR0Id) {
        this.bR0Id = bR0Id;
    }

/*
    @Basic
    @Column(name = "b_r0_b_b_id", nullable = true, length = 8)
    public String getbR0BBId() {
        return bR0BBId;
    }

    public void setbR0BBId(String bR0BBId) {
        this.bR0BBId = bR0BBId;
    }

    @Basic
    @Column(name = "b_r0_rf_id", nullable = true, length = 8)
    public String getbR0RfId() {
        return bR0RfId;
    }

    public void setbR0RfId(String bR0RfId) {
        this.bR0RfId = bR0RfId;
    }
*/

    @Basic
    @Column(name = "b_r0_time", nullable = true)
    public Timestamp getbR0Time() {
        return bR0Time;
    }

    public void setbR0Time(Timestamp bR0Time) {
        this.bR0Time = bR0Time;
    }

    @Basic
    @Column(name = "b_r0_long", nullable = true, precision = 6)
    public BigDecimal getbR0Long() {
        return bR0Long;
    }

    public void setbR0Long(BigDecimal bR0Long) {
        this.bR0Long = bR0Long;
    }

    @Basic
    @Column(name = "b_r0_lat", nullable = true, precision = 6)
    public BigDecimal getbR0Lat() {
        return bR0Lat;
    }

    public void setbR0Lat(BigDecimal bR0Lat) {
        this.bR0Lat = bR0Lat;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BR0 br0 = (BR0) o;

        if (bR0Id != br0.bR0Id) return false;
        if (bR0BBId != null ? !bR0BBId.equals(br0.bR0BBId) : br0.bR0BBId != null) return false;
        if (bR0RfId != null ? !bR0RfId.equals(br0.bR0RfId) : br0.bR0RfId != null) return false;
        if (bR0Time != null ? !bR0Time.equals(br0.bR0Time) : br0.bR0Time != null) return false;
        if (bR0Long != null ? !bR0Long.equals(br0.bR0Long) : br0.bR0Long != null) return false;
        if (bR0Lat != null ? !bR0Lat.equals(br0.bR0Lat) : br0.bR0Lat != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = bR0Id;
        result = 31 * result + (bR0BBId != null ? bR0BBId.hashCode() : 0);
        result = 31 * result + (bR0RfId != null ? bR0RfId.hashCode() : 0);
        result = 31 * result + (bR0Time != null ? bR0Time.hashCode() : 0);
        result = 31 * result + (bR0Long != null ? bR0Long.hashCode() : 0);
        result = 31 * result + (bR0Lat != null ? bR0Lat.hashCode() : 0);
        return result;
    }
    
    @JsonIgnore
    @OneToMany(mappedBy = "bR0ByBLRegId")
    public Collection<BLife> getbLivesByBR0Id() {
        return bLivesByBR0Id;
    }

    public void setbLivesByBR0Id(Collection<BLife> bLivesByBR0Id) {
        this.bLivesByBR0Id = bLivesByBR0Id;
    }

    @ManyToOne
    @JoinColumn(name = "b_r0_b_b_id", referencedColumnName = "bucket_basic_id")
    public BBasic getbBasicByBR0BBId() {
        return bBasicByBR0BBId;
    }

    public void setbBasicByBR0BBId(BBasic bBasicByBR0BBId) {
        this.bBasicByBR0BBId = bBasicByBR0BBId;
    }

    @ManyToOne
    @JoinColumn(name = "b_r0_rf_id", referencedColumnName = "rf_id")
    public RfBasic getRfBasicByBR0RfId() {
        return rfBasicByBR0RfId;
    }

    public void setRfBasicByBR0RfId(RfBasic rfBasicByBR0RfId) {
        this.rfBasicByBR0RfId = rfBasicByBR0RfId;
    }
}
