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
@Table(name = "b_r4", schema = "bucket_water_db", catalog = "")
public class BR4 {
    private int bR4Id;
    private String bR4BBId;
    private String bR4RfId;
    private Timestamp bR4Time;
    private BigDecimal bR4Long;
    private BigDecimal bR4Lat;
    private Collection<BLife> bLivesByBR4Id;
    private BBasic bBasicByBR4BBId;
    private RfBasic rfBasicByBR4RfId;

    @Id
    @Column(name = "b_r4_id", nullable = false)
    public int getbR4Id() {
        return bR4Id;
    }

    public void setbR4Id(int bR4Id) {
        this.bR4Id = bR4Id;
    }

/*
    @Basic
    @Column(name = "b_r4_b_b_id", nullable = true, length = 8)
    public String getbR4BBId() {
        return bR4BBId;
    }

    public void setbR4BBId(String bR4BBId) {
        this.bR4BBId = bR4BBId;
    }

    @Basic
    @Column(name = "b_r4_rf_id", nullable = true, length = 8)
    public String getbR4RfId() {
        return bR4RfId;
    }

    public void setbR4RfId(String bR4RfId) {
        this.bR4RfId = bR4RfId;
    }
*/

    @Basic
    @Column(name = "b_r4_time", nullable = true)
    public Timestamp getbR4Time() {
        return bR4Time;
    }

    public void setbR4Time(Timestamp bR4Time) {
        this.bR4Time = bR4Time;
    }

    @Basic
    @Column(name = "b_r4_long", nullable = true, precision = 6)
    public BigDecimal getbR4Long() {
        return bR4Long;
    }

    public void setbR4Long(BigDecimal bR4Long) {
        this.bR4Long = bR4Long;
    }

    @Basic
    @Column(name = "b_r4_lat", nullable = true, precision = 6)
    public BigDecimal getbR4Lat() {
        return bR4Lat;
    }

    public void setbR4Lat(BigDecimal bR4Lat) {
        this.bR4Lat = bR4Lat;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BR4 br4 = (BR4) o;

        if (bR4Id != br4.bR4Id) return false;
        if (bR4BBId != null ? !bR4BBId.equals(br4.bR4BBId) : br4.bR4BBId != null) return false;
        if (bR4RfId != null ? !bR4RfId.equals(br4.bR4RfId) : br4.bR4RfId != null) return false;
        if (bR4Time != null ? !bR4Time.equals(br4.bR4Time) : br4.bR4Time != null) return false;
        if (bR4Long != null ? !bR4Long.equals(br4.bR4Long) : br4.bR4Long != null) return false;
        if (bR4Lat != null ? !bR4Lat.equals(br4.bR4Lat) : br4.bR4Lat != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = bR4Id;
        result = 31 * result + (bR4BBId != null ? bR4BBId.hashCode() : 0);
        result = 31 * result + (bR4RfId != null ? bR4RfId.hashCode() : 0);
        result = 31 * result + (bR4Time != null ? bR4Time.hashCode() : 0);
        result = 31 * result + (bR4Long != null ? bR4Long.hashCode() : 0);
        result = 31 * result + (bR4Lat != null ? bR4Lat.hashCode() : 0);
        return result;
    }

    @JsonIgnore
    @OneToMany(mappedBy = "bR4ByBLEndRegId")
    public Collection<BLife> getbLivesByBR4Id() {
        return bLivesByBR4Id;
    }

    public void setbLivesByBR4Id(Collection<BLife> bLivesByBR4Id) {
        this.bLivesByBR4Id = bLivesByBR4Id;
    }

    @ManyToOne
    @JoinColumn(name = "b_r4_b_b_id", referencedColumnName = "bucket_basic_id")
    public BBasic getbBasicByBR4BBId() {
        return bBasicByBR4BBId;
    }

    public void setbBasicByBR4BBId(BBasic bBasicByBR4BBId) {
        this.bBasicByBR4BBId = bBasicByBR4BBId;
    }

    @ManyToOne
    @JoinColumn(name = "b_r4_rf_id", referencedColumnName = "rf_id")
    public RfBasic getRfBasicByBR4RfId() {
        return rfBasicByBR4RfId;
    }

    public void setRfBasicByBR4RfId(RfBasic rfBasicByBR4RfId) {
        this.rfBasicByBR4RfId = rfBasicByBR4RfId;
    }
}
