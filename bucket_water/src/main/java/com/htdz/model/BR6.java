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
@Table(name = "b_r6", schema = "bucket_water_db", catalog = "")
public class BR6 {
    private int bR6Id;
    private String bR6BBId;
    private String bR6RfId;
    private Timestamp bR6Time;
    private BigDecimal bR6Long;
    private BigDecimal bR6Lat;
    private Collection<BLife> bLivesByBR6Id;
    private BBasic bBasicByBR6BBId;
    private RfBasic rfBasicByBR6RfId;

    @Id
    @Column(name = "b_r6_id", nullable = false)
    public int getbR6Id() {
        return bR6Id;
    }

    public void setbR6Id(int bR6Id) {
        this.bR6Id = bR6Id;
    }

   /* @Basic
    @Column(name = "b_r6_b_b_id", nullable = true, length = 8)
    public String getbR6BBId() {
        return bR6BBId;
    }

    public void setbR6BBId(String bR6BBId) {
        this.bR6BBId = bR6BBId;
    }

    @Basic
    @Column(name = "b_r6_rf_id", nullable = true, length = 8)
    public String getbR6RfId() {
        return bR6RfId;
    }

    public void setbR6RfId(String bR6RfId) {
        this.bR6RfId = bR6RfId;
    }*/

    @Basic
    @Column(name = "b_r6_time", nullable = true)
    public Timestamp getbR6Time() {
        return bR6Time;
    }

    public void setbR6Time(Timestamp bR6Time) {
        this.bR6Time = bR6Time;
    }

    @Basic
    @Column(name = "b_r6_long", nullable = true, precision = 6)
    public BigDecimal getbR6Long() {
        return bR6Long;
    }

    public void setbR6Long(BigDecimal bR6Long) {
        this.bR6Long = bR6Long;
    }

    @Basic
    @Column(name = "b_r6_lat", nullable = true, precision = 6)
    public BigDecimal getbR6Lat() {
        return bR6Lat;
    }

    public void setbR6Lat(BigDecimal bR6Lat) {
        this.bR6Lat = bR6Lat;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BR6 br6 = (BR6) o;

        if (bR6Id != br6.bR6Id) return false;
        if (bR6BBId != null ? !bR6BBId.equals(br6.bR6BBId) : br6.bR6BBId != null) return false;
        if (bR6RfId != null ? !bR6RfId.equals(br6.bR6RfId) : br6.bR6RfId != null) return false;
        if (bR6Time != null ? !bR6Time.equals(br6.bR6Time) : br6.bR6Time != null) return false;
        if (bR6Long != null ? !bR6Long.equals(br6.bR6Long) : br6.bR6Long != null) return false;
        if (bR6Lat != null ? !bR6Lat.equals(br6.bR6Lat) : br6.bR6Lat != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = bR6Id;
        result = 31 * result + (bR6BBId != null ? bR6BBId.hashCode() : 0);
        result = 31 * result + (bR6RfId != null ? bR6RfId.hashCode() : 0);
        result = 31 * result + (bR6Time != null ? bR6Time.hashCode() : 0);
        result = 31 * result + (bR6Long != null ? bR6Long.hashCode() : 0);
        result = 31 * result + (bR6Lat != null ? bR6Lat.hashCode() : 0);
        return result;
    }

    @JsonIgnore
    @OneToMany(mappedBy = "bR6ByBLWaterOId")
    public Collection<BLife> getbLivesByBR6Id() {
        return bLivesByBR6Id;
    }

    public void setbLivesByBR6Id(Collection<BLife> bLivesByBR6Id) {
        this.bLivesByBR6Id = bLivesByBR6Id;
    }

    @ManyToOne
    @JoinColumn(name = "b_r6_b_b_id", referencedColumnName = "bucket_basic_id")
    public BBasic getbBasicByBR6BBId() {
        return bBasicByBR6BBId;
    }

    public void setbBasicByBR6BBId(BBasic bBasicByBR6BBId) {
        this.bBasicByBR6BBId = bBasicByBR6BBId;
    }

    @ManyToOne
    @JoinColumn(name = "b_r6_rf_id", referencedColumnName = "rf_id")
    public RfBasic getRfBasicByBR6RfId() {
        return rfBasicByBR6RfId;
    }

    public void setRfBasicByBR6RfId(RfBasic rfBasicByBR6RfId) {
        this.rfBasicByBR6RfId = rfBasicByBR6RfId;
    }
}
