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
@Table(name = "b_r3", schema = "bucket_water_db", catalog = "")
public class BR3 {
    private int bR3Id;
    private String bR3BBId;
    private String bR3RfId;
    private Timestamp bR3Time;
    private Integer bR3UseNum;
    private BigDecimal bR3Long;
    private BigDecimal bR3Lat;
    private Collection<BLife> bLivesByBR3Id;
    private BBasic bBasicByBR3BBId;
    private RfBasic rfBasicByBR3RfId;

    @Id
    @Column(name = "b_r3_id", nullable = false)
    public int getbR3Id() {
        return bR3Id;
    }

    public void setbR3Id(int bR3Id) {
        this.bR3Id = bR3Id;
    }

/*    @Basic
    @Column(name = "b_r3_b_b_id", nullable = true, length = 8)
    public String getbR3BBId() {
        return bR3BBId;
    }

    public void setbR3BBId(String bR3BBId) {
        this.bR3BBId = bR3BBId;
    }

    @Basic
    @Column(name = "b_r3_rf_id", nullable = true, length = 8)
    public String getbR3RfId() {
        return bR3RfId;
    }

    public void setbR3RfId(String bR3RfId) {
        this.bR3RfId = bR3RfId;
    }

    @Basic*/
    @Column(name = "b_r3_time", nullable = true)
    public Timestamp getbR3Time() {
        return bR3Time;
    }

    public void setbR3Time(Timestamp bR3Time) {
        this.bR3Time = bR3Time;
    }

    @Basic
    @Column(name = "b_r3_use_num", nullable = true)
    public Integer getbR3UseNum() {
        return bR3UseNum;
    }

    public void setbR3UseNum(Integer bR3UseNum) {
        this.bR3UseNum = bR3UseNum;
    }

    @Basic
    @Column(name = "b_r3_long", nullable = true, precision = 6)
    public BigDecimal getbR3Long() {
        return bR3Long;
    }

    public void setbR3Long(BigDecimal bR3Long) {
        this.bR3Long = bR3Long;
    }

    @Basic
    @Column(name = "b_r3_lat", nullable = true, precision = 6)
    public BigDecimal getbR3Lat() {
        return bR3Lat;
    }

    public void setbR3Lat(BigDecimal bR3Lat) {
        this.bR3Lat = bR3Lat;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BR3 br3 = (BR3) o;

        if (bR3Id != br3.bR3Id) return false;
        if (bR3BBId != null ? !bR3BBId.equals(br3.bR3BBId) : br3.bR3BBId != null) return false;
        if (bR3RfId != null ? !bR3RfId.equals(br3.bR3RfId) : br3.bR3RfId != null) return false;
        if (bR3Time != null ? !bR3Time.equals(br3.bR3Time) : br3.bR3Time != null) return false;
        if (bR3UseNum != null ? !bR3UseNum.equals(br3.bR3UseNum) : br3.bR3UseNum != null) return false;
        if (bR3Long != null ? !bR3Long.equals(br3.bR3Long) : br3.bR3Long != null) return false;
        if (bR3Lat != null ? !bR3Lat.equals(br3.bR3Lat) : br3.bR3Lat != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = bR3Id;
        result = 31 * result + (bR3BBId != null ? bR3BBId.hashCode() : 0);
        result = 31 * result + (bR3RfId != null ? bR3RfId.hashCode() : 0);
        result = 31 * result + (bR3Time != null ? bR3Time.hashCode() : 0);
        result = 31 * result + (bR3UseNum != null ? bR3UseNum.hashCode() : 0);
        result = 31 * result + (bR3Long != null ? bR3Long.hashCode() : 0);
        result = 31 * result + (bR3Lat != null ? bR3Lat.hashCode() : 0);
        return result;
    }

    @JsonIgnore
    @OneToMany(mappedBy = "bR3ByBLFiltrId")
    public Collection<BLife> getbLivesByBR3Id() {
        return bLivesByBR3Id;
    }

    public void setbLivesByBR3Id(Collection<BLife> bLivesByBR3Id) {
        this.bLivesByBR3Id = bLivesByBR3Id;
    }

    @ManyToOne
    @JoinColumn(name = "b_r3_b_b_id", referencedColumnName = "bucket_basic_id")
    public BBasic getbBasicByBR3BBId() {
        return bBasicByBR3BBId;
    }

    public void setbBasicByBR3BBId(BBasic bBasicByBR3BBId) {
        this.bBasicByBR3BBId = bBasicByBR3BBId;
    }

    @ManyToOne
    @JoinColumn(name = "b_r3_rf_id", referencedColumnName = "rf_id")
    public RfBasic getRfBasicByBR3RfId() {
        return rfBasicByBR3RfId;
    }

    public void setRfBasicByBR3RfId(RfBasic rfBasicByBR3RfId) {
        this.rfBasicByBR3RfId = rfBasicByBR3RfId;
    }
}
