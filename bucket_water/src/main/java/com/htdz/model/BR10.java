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
@Table(name = "b_r10", schema = "bucket_water_db", catalog = "")
public class BR10 {
    private int bR10Id;
    private String bR10BBId;
    private String bR10RfId;
    private Timestamp bR10Time;
    private BigDecimal bR10Long;
    private BigDecimal b10Lat;
    private Collection<BLife> bLivesByBR10Id;
    private BBasic bBasicByBR10BBId;
    private RfBasic rfBasicByBR10RfId;

    @Id
    @Column(name = "b_r10_id", nullable = false)
    public int getbR10Id() {
        return bR10Id;
    }

    public void setbR10Id(int bR10Id) {
        this.bR10Id = bR10Id;
    }

   /* @Basic
    @Column(name = "b_r10_b_b_id", nullable = true, length = 8)
    public String getbR10BBId() {
        return bR10BBId;
    }

    public void setbR10BBId(String bR10BBId) {
        this.bR10BBId = bR10BBId;
    }

    @Basic
    @Column(name = "b_r10_rf_id", nullable = true, length = 8)
    public String getbR10RfId() {
        return bR10RfId;
    }

    public void setbR10RfId(String bR10RfId) {
        this.bR10RfId = bR10RfId;
    }*/

    @Basic
    @Column(name = "b_r10_time", nullable = true)
    public Timestamp getbR10Time() {
        return bR10Time;
    }

    public void setbR10Time(Timestamp bR10Time) {
        this.bR10Time = bR10Time;
    }

    @Basic
    @Column(name = "b_r10_long", nullable = true, precision = 6)
    public BigDecimal getbR10Long() {
        return bR10Long;
    }

    public void setbR10Long(BigDecimal bR10Long) {
        this.bR10Long = bR10Long;
    }

    @Basic
    @Column(name = "b_10_lat", nullable = true, precision = 6)
    public BigDecimal getB10Lat() {
        return b10Lat;
    }

    public void setB10Lat(BigDecimal b10Lat) {
        this.b10Lat = b10Lat;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BR10 br10 = (BR10) o;

        if (bR10Id != br10.bR10Id) return false;
        if (bR10BBId != null ? !bR10BBId.equals(br10.bR10BBId) : br10.bR10BBId != null) return false;
        if (bR10RfId != null ? !bR10RfId.equals(br10.bR10RfId) : br10.bR10RfId != null) return false;
        if (bR10Time != null ? !bR10Time.equals(br10.bR10Time) : br10.bR10Time != null) return false;
        if (bR10Long != null ? !bR10Long.equals(br10.bR10Long) : br10.bR10Long != null) return false;
        if (b10Lat != null ? !b10Lat.equals(br10.b10Lat) : br10.b10Lat != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = bR10Id;
        result = 31 * result + (bR10BBId != null ? bR10BBId.hashCode() : 0);
        result = 31 * result + (bR10RfId != null ? bR10RfId.hashCode() : 0);
        result = 31 * result + (bR10Time != null ? bR10Time.hashCode() : 0);
        result = 31 * result + (bR10Long != null ? bR10Long.hashCode() : 0);
        result = 31 * result + (b10Lat != null ? b10Lat.hashCode() : 0);
        return result;
    }

    @JsonIgnore
    @OneToMany(mappedBy = "bR10ByBLFinishIId")
    public Collection<BLife> getbLivesByBR10Id() {
        return bLivesByBR10Id;
    }

    public void setbLivesByBR10Id(Collection<BLife> bLivesByBR10Id) {
        this.bLivesByBR10Id = bLivesByBR10Id;
    }

    @ManyToOne
    @JoinColumn(name = "b_r10_b_b_id", referencedColumnName = "bucket_basic_id")
    public BBasic getbBasicByBR10BBId() {
        return bBasicByBR10BBId;
    }

    public void setbBasicByBR10BBId(BBasic bBasicByBR10BBId) {
        this.bBasicByBR10BBId = bBasicByBR10BBId;
    }

    @ManyToOne
    @JoinColumn(name = "b_r10_rf_id", referencedColumnName = "rf_id")
    public RfBasic getRfBasicByBR10RfId() {
        return rfBasicByBR10RfId;
    }

    public void setRfBasicByBR10RfId(RfBasic rfBasicByBR10RfId) {
        this.rfBasicByBR10RfId = rfBasicByBR10RfId;
    }
}
