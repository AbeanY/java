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
@Table(name = "b_r1", schema = "bucket_water_db", catalog = "")
public class BR1 {
    private int bR1Id;
    private String bR1BBId;
    private String bR1RfId;
    private Timestamp bR1Time;
    private BigDecimal bR1Long;
    private BigDecimal bR1Lat;
    private Collection<BLife> bLivesByBR1Id;
    private BBasic bBasicByBR1BBId;
    private RfBasic rfBasicByBR1RfId;

    @Id
    @Column(name = "b_r1_id", nullable = false)
    public int getbR1Id() {
        return bR1Id;
    }

    public void setbR1Id(int bR1Id) {
        this.bR1Id = bR1Id;
    }

/*    @Basic
    @Column(name = "b_r1_b_b_id", nullable = true, length = 8)
    public String getbR1BBId() {
        return bR1BBId;
    }

    public void setbR1BBId(String bR1BBId) {
        this.bR1BBId = bR1BBId;
    }

    @Basic
    @Column(name = "b_r1_rf_id", nullable = true, length = 8)
    public String getbR1RfId() {
        return bR1RfId;
    }

    public void setbR1RfId(String bR1RfId) {
        this.bR1RfId = bR1RfId;
    }*/

    @Basic
    @Column(name = "b_r1_time", nullable = true)
    public Timestamp getbR1Time() {
        return bR1Time;
    }

    public void setbR1Time(Timestamp bR1Time) {
        this.bR1Time = bR1Time;
    }

    @Basic
    @Column(name = "b_r1_long", nullable = true, precision = 6)
    public BigDecimal getbR1Long() {
        return bR1Long;
    }

    public void setbR1Long(BigDecimal bR1Long) {
        this.bR1Long = bR1Long;
    }

    @Basic
    @Column(name = "b_r1_lat", nullable = true, precision = 6)
    public BigDecimal getbR1Lat() {
        return bR1Lat;
    }

    public void setbR1Lat(BigDecimal bR1Lat) {
        this.bR1Lat = bR1Lat;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BR1 br1 = (BR1) o;

        if (bR1Id != br1.bR1Id) return false;
        if (bR1BBId != null ? !bR1BBId.equals(br1.bR1BBId) : br1.bR1BBId != null) return false;
        if (bR1RfId != null ? !bR1RfId.equals(br1.bR1RfId) : br1.bR1RfId != null) return false;
        if (bR1Time != null ? !bR1Time.equals(br1.bR1Time) : br1.bR1Time != null) return false;
        if (bR1Long != null ? !bR1Long.equals(br1.bR1Long) : br1.bR1Long != null) return false;
        if (bR1Lat != null ? !bR1Lat.equals(br1.bR1Lat) : br1.bR1Lat != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = bR1Id;
        result = 31 * result + (bR1BBId != null ? bR1BBId.hashCode() : 0);
        result = 31 * result + (bR1RfId != null ? bR1RfId.hashCode() : 0);
        result = 31 * result + (bR1Time != null ? bR1Time.hashCode() : 0);
        result = 31 * result + (bR1Long != null ? bR1Long.hashCode() : 0);
        result = 31 * result + (bR1Lat != null ? bR1Lat.hashCode() : 0);
        return result;
    }

    @JsonIgnore
    @OneToMany(mappedBy = "bR1ByBLScrapId")
    public Collection<BLife> getbLivesByBR1Id() {
        return bLivesByBR1Id;
    }

    public void setbLivesByBR1Id(Collection<BLife> bLivesByBR1Id) {
        this.bLivesByBR1Id = bLivesByBR1Id;
    }

    @ManyToOne
    @JoinColumn(name = "b_r1_b_b_id", referencedColumnName = "bucket_basic_id")
    public BBasic getbBasicByBR1BBId() {
        return bBasicByBR1BBId;
    }

    public void setbBasicByBR1BBId(BBasic bBasicByBR1BBId) {
        this.bBasicByBR1BBId = bBasicByBR1BBId;
    }

    @ManyToOne
    @JoinColumn(name = "b_r1_rf_id", referencedColumnName = "rf_id")
    public RfBasic getRfBasicByBR1RfId() {
        return rfBasicByBR1RfId;
    }

    public void setRfBasicByBR1RfId(RfBasic rfBasicByBR1RfId) {
        this.rfBasicByBR1RfId = rfBasicByBR1RfId;
    }
}
