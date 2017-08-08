package com.htdz.model;

import javax.persistence.*;

/**
 * Created by yab on 2017/7/10.
 */
@Entity
@Table(name = "b_life", schema = "bucket_water_db", catalog = "")
public class BLife {
    private int bLifeId;
    private Integer bIUseN;
    private Integer bLRegId;
    private Integer bLScrapId;
    private Integer bLRefluxId;
    private Integer bLFiltrId;
    private Integer bLEndRegId;
    private Integer bLWaterOId;
    private Integer bLFinishIId;
    private Integer bLEmptyId;
    private BR0 bR0ByBLRegId;
    private BR1 bR1ByBLScrapId;
    private BR2 bR2ByBLRefluxId;
    private BR3 bR3ByBLFiltrId;
    private BR4 bR4ByBLEndRegId;
    private BR6 bR6ByBLWaterOId;
    private BR10 bR10ByBLFinishIId;
    private BR11 bR11ByBLEmptyId;

    @Id
    @Column(name = "b_life_id", nullable = false)
    public int getbLifeId() {
        return bLifeId;
    }

    public void setbLifeId(int bLifeId) {
        this.bLifeId = bLifeId;
    }

    @Basic
    @Column(name = "b_i_use_n", nullable = true)
    public Integer getbIUseN() {
        return bIUseN;
    }

    public void setbIUseN(Integer bIUseN) {
        this.bIUseN = bIUseN;
    }

    /*@Basic
    @Column(name = "b_l_reg_id", nullable = true)
    public Integer getbLRegId() {
        return bLRegId;
    }

    public void setbLRegId(Integer bLRegId) {
        this.bLRegId = bLRegId;
    }

    @Basic
    @Column(name = "b_l_scrap_id", nullable = true)
    public Integer getbLScrapId() {
        return bLScrapId;
    }

    public void setbLScrapId(Integer bLScrapId) {
        this.bLScrapId = bLScrapId;
    }

    @Basic
    @Column(name = "b_l_reflux_id", nullable = true)
    public Integer getbLRefluxId() {
        return bLRefluxId;
    }

    public void setbLRefluxId(Integer bLRefluxId) {
        this.bLRefluxId = bLRefluxId;
    }

    @Basic
    @Column(name = "b_l_filtr_id", nullable = true)
    public Integer getbLFiltrId() {
        return bLFiltrId;
    }

    public void setbLFiltrId(Integer bLFiltrId) {
        this.bLFiltrId = bLFiltrId;
    }

    @Basic
    @Column(name = "b_l_end_reg_id", nullable = true)
    public Integer getbLEndRegId() {
        return bLEndRegId;
    }

    public void setbLEndRegId(Integer bLEndRegId) {
        this.bLEndRegId = bLEndRegId;
    }

    @Basic
    @Column(name = "b_l_water_o_id", nullable = true)
    public Integer getbLWaterOId() {
        return bLWaterOId;
    }

    public void setbLWaterOId(Integer bLWaterOId) {
        this.bLWaterOId = bLWaterOId;
    }

    @Basic
    @Column(name = "b_l_finish_i_id", nullable = true)
    public Integer getbLFinishIId() {
        return bLFinishIId;
    }

    public void setbLFinishIId(Integer bLFinishIId) {
        this.bLFinishIId = bLFinishIId;
    }

    @Basic
    @Column(name = "b_l_empty_id", nullable = true)
    public Integer getbLEmptyId() {
        return bLEmptyId;
    }

    public void setbLEmptyId(Integer bLEmptyId) {
        this.bLEmptyId = bLEmptyId;
    }*/

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BLife bLife = (BLife) o;

        if (bLifeId != bLife.bLifeId) return false;
        if (bIUseN != null ? !bIUseN.equals(bLife.bIUseN) : bLife.bIUseN != null) return false;
        if (bLRegId != null ? !bLRegId.equals(bLife.bLRegId) : bLife.bLRegId != null) return false;
        if (bLScrapId != null ? !bLScrapId.equals(bLife.bLScrapId) : bLife.bLScrapId != null) return false;
        if (bLRefluxId != null ? !bLRefluxId.equals(bLife.bLRefluxId) : bLife.bLRefluxId != null) return false;
        if (bLFiltrId != null ? !bLFiltrId.equals(bLife.bLFiltrId) : bLife.bLFiltrId != null) return false;
        if (bLEndRegId != null ? !bLEndRegId.equals(bLife.bLEndRegId) : bLife.bLEndRegId != null) return false;
        if (bLWaterOId != null ? !bLWaterOId.equals(bLife.bLWaterOId) : bLife.bLWaterOId != null) return false;
        if (bLFinishIId != null ? !bLFinishIId.equals(bLife.bLFinishIId) : bLife.bLFinishIId != null) return false;
        if (bLEmptyId != null ? !bLEmptyId.equals(bLife.bLEmptyId) : bLife.bLEmptyId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = bLifeId;
        result = 31 * result + (bIUseN != null ? bIUseN.hashCode() : 0);
        result = 31 * result + (bLRegId != null ? bLRegId.hashCode() : 0);
        result = 31 * result + (bLScrapId != null ? bLScrapId.hashCode() : 0);
        result = 31 * result + (bLRefluxId != null ? bLRefluxId.hashCode() : 0);
        result = 31 * result + (bLFiltrId != null ? bLFiltrId.hashCode() : 0);
        result = 31 * result + (bLEndRegId != null ? bLEndRegId.hashCode() : 0);
        result = 31 * result + (bLWaterOId != null ? bLWaterOId.hashCode() : 0);
        result = 31 * result + (bLFinishIId != null ? bLFinishIId.hashCode() : 0);
        result = 31 * result + (bLEmptyId != null ? bLEmptyId.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "b_l_reg_id", referencedColumnName = "b_r0_id")
    public BR0 getbR0ByBLRegId() {
        return bR0ByBLRegId;
    }

    public void setbR0ByBLRegId(BR0 bR0ByBLRegId) {
        this.bR0ByBLRegId = bR0ByBLRegId;
    }

    @ManyToOne
    @JoinColumn(name = "b_l_scrap_id", referencedColumnName = "b_r1_id")
    public BR1 getbR1ByBLScrapId() {
        return bR1ByBLScrapId;
    }

    public void setbR1ByBLScrapId(BR1 bR1ByBLScrapId) {
        this.bR1ByBLScrapId = bR1ByBLScrapId;
    }

    @ManyToOne
    @JoinColumn(name = "b_l_reflux_id", referencedColumnName = "b_r2_id")
    public BR2 getbR2ByBLRefluxId() {
        return bR2ByBLRefluxId;
    }

    public void setbR2ByBLRefluxId(BR2 bR2ByBLRefluxId) {
        this.bR2ByBLRefluxId = bR2ByBLRefluxId;
    }

    @ManyToOne
    @JoinColumn(name = "b_l_filtr_id", referencedColumnName = "b_r3_id")
    public BR3 getbR3ByBLFiltrId() {
        return bR3ByBLFiltrId;
    }

    public void setbR3ByBLFiltrId(BR3 bR3ByBLFiltrId) {
        this.bR3ByBLFiltrId = bR3ByBLFiltrId;
    }

    @ManyToOne
    @JoinColumn(name = "b_l_end_reg_id", referencedColumnName = "b_r4_id")
    public BR4 getbR4ByBLEndRegId() {
        return bR4ByBLEndRegId;
    }

    public void setbR4ByBLEndRegId(BR4 bR4ByBLEndRegId) {
        this.bR4ByBLEndRegId = bR4ByBLEndRegId;
    }

    @ManyToOne
    @JoinColumn(name = "b_l_water_o_id", referencedColumnName = "b_r6_id")
    public BR6 getbR6ByBLWaterOId() {
        return bR6ByBLWaterOId;
    }

    public void setbR6ByBLWaterOId(BR6 bR6ByBLWaterOId) {
        this.bR6ByBLWaterOId = bR6ByBLWaterOId;
    }

    @ManyToOne
    @JoinColumn(name = "b_l_finish_i_id", referencedColumnName = "b_r10_id")
    public BR10 getbR10ByBLFinishIId() {
        return bR10ByBLFinishIId;
    }

    public void setbR10ByBLFinishIId(BR10 bR10ByBLFinishIId) {
        this.bR10ByBLFinishIId = bR10ByBLFinishIId;
    }

    @ManyToOne
    @JoinColumn(name = "b_l_empty_id", referencedColumnName = "b_r11_id")
    public BR11 getbR11ByBLEmptyId() {
        return bR11ByBLEmptyId;
    }

    public void setbR11ByBLEmptyId(BR11 bR11ByBLEmptyId) {
        this.bR11ByBLEmptyId = bR11ByBLEmptyId;
    }
}
