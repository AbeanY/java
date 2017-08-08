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
@Table(name = "b_r11", schema = "bucket_water_db", catalog = "")
public class BR11 {
    private int bR11Id;
    private String bR11BBId;
    private String bR11RfId;
    private Timestamp bR11Time;
    private BigDecimal bR11Long;
    private BigDecimal bR11Lat;
    private Collection<BLife> bLivesByBR11Id;
    private BBasic bBasicByBR11BBId;
    private RfBasic rfBasicByBR11RfId;

    @Id
    @Column(name = "b_r11_id", nullable = false)
    public int getbR11Id() {
        return bR11Id;
    }

    public void setbR11Id(int bR11Id) {
        this.bR11Id = bR11Id;
    }

  /*  @Basic
    @Column(name = "b_r11_b_b_id", nullable = true, length = 8)
    public String getbR11BBId() {
        return bR11BBId;
    }

    public void setbR11BBId(String bR11BBId) {
        this.bR11BBId = bR11BBId;
    }

    @Basic
    @Column(name = "b_r11_rf_id", nullable = true, length = 8)
    public String getbR11RfId() {
        return bR11RfId;
    }

    public void setbR11RfId(String bR11RfId) {
        this.bR11RfId = bR11RfId;
    }*/

    @Basic
    @Column(name = "b_r11_time", nullable = true)
    public Timestamp getbR11Time() {
        return bR11Time;
    }

    public void setbR11Time(Timestamp bR11Time) {
        this.bR11Time = bR11Time;
    }

    @Basic
    @Column(name = "b_r11_long", nullable = true, precision = 6)
    public BigDecimal getbR11Long() {
        return bR11Long;
    }

    public void setbR11Long(BigDecimal bR11Long) {
        this.bR11Long = bR11Long;
    }

    @Basic
    @Column(name = "b_r11_lat", nullable = true, precision = 6)
    public BigDecimal getbR11Lat() {
        return bR11Lat;
    }

    public void setbR11Lat(BigDecimal bR11Lat) {
        this.bR11Lat = bR11Lat;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BR11 br11 = (BR11) o;

        if (bR11Id != br11.bR11Id) return false;
        if (bR11BBId != null ? !bR11BBId.equals(br11.bR11BBId) : br11.bR11BBId != null) return false;
        if (bR11RfId != null ? !bR11RfId.equals(br11.bR11RfId) : br11.bR11RfId != null) return false;
        if (bR11Time != null ? !bR11Time.equals(br11.bR11Time) : br11.bR11Time != null) return false;
        if (bR11Long != null ? !bR11Long.equals(br11.bR11Long) : br11.bR11Long != null) return false;
        if (bR11Lat != null ? !bR11Lat.equals(br11.bR11Lat) : br11.bR11Lat != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = bR11Id;
        result = 31 * result + (bR11BBId != null ? bR11BBId.hashCode() : 0);
        result = 31 * result + (bR11RfId != null ? bR11RfId.hashCode() : 0);
        result = 31 * result + (bR11Time != null ? bR11Time.hashCode() : 0);
        result = 31 * result + (bR11Long != null ? bR11Long.hashCode() : 0);
        result = 31 * result + (bR11Lat != null ? bR11Lat.hashCode() : 0);
        return result;
    }

    @JsonIgnore
    @OneToMany(mappedBy = "bR11ByBLEmptyId")
    public Collection<BLife> getbLivesByBR11Id() {
        return bLivesByBR11Id;
    }

    public void setbLivesByBR11Id(Collection<BLife> bLivesByBR11Id) {
        this.bLivesByBR11Id = bLivesByBR11Id;
    }

    @ManyToOne
    @JoinColumn(name = "b_r11_b_b_id", referencedColumnName = "bucket_basic_id")
    public BBasic getbBasicByBR11BBId() {
        return bBasicByBR11BBId;
    }

    public void setbBasicByBR11BBId(BBasic bBasicByBR11BBId) {
        this.bBasicByBR11BBId = bBasicByBR11BBId;
    }

    @ManyToOne
    @JoinColumn(name = "b_r11_rf_id", referencedColumnName = "rf_id")
    public RfBasic getRfBasicByBR11RfId() {
        return rfBasicByBR11RfId;
    }

    public void setRfBasicByBR11RfId(RfBasic rfBasicByBR11RfId) {
        this.rfBasicByBR11RfId = rfBasicByBR11RfId;
    }
}
