package com.htdz.model;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by yab on 2017/7/10.
 */
@Entity
@Table(name = "b_s_statics", schema = "bucket_water_db", catalog = "")
public class BSStatics {
    private int bSId;
    private Integer bSUserId;
    private Timestamp bST;
    private Integer bSScrapN;
    private Integer bSRefluxN;
    private Integer bSEmptyN;
    private Integer bSRegN;
    private Integer bSWaterON;
    private UserInfo userInfoByBSUserId;

    @Id
    @Column(name = "b_s_id", nullable = false)
    public int getbSId() {
        return bSId;
    }

    public void setbSId(int bSId) {
        this.bSId = bSId;
    }

   /* @Basic
    @Column(name = "b_s_user_id", nullable = true)
    public Integer getbSUserId() {
        return bSUserId;
    }

    public void setbSUserId(Integer bSUserId) {
        this.bSUserId = bSUserId;
    }*/

    @Basic
    @Column(name = "b_s_t", nullable = true)
    public Timestamp getbST() {
        return bST;
    }

    public void setbST(Timestamp bST) {
        this.bST = bST;
    }

    @Basic
    @Column(name = "b_s_scrap_n", nullable = true)
    public Integer getbSScrapN() {
        return bSScrapN;
    }

    public void setbSScrapN(Integer bSScrapN) {
        this.bSScrapN = bSScrapN;
    }

    @Basic
    @Column(name = "b_s_reflux_n", nullable = true)
    public Integer getbSRefluxN() {
        return bSRefluxN;
    }

    public void setbSRefluxN(Integer bSRefluxN) {
        this.bSRefluxN = bSRefluxN;
    }

    @Basic
    @Column(name = "b_s_empty_n", nullable = true)
    public Integer getbSEmptyN() {
        return bSEmptyN;
    }

    public void setbSEmptyN(Integer bSEmptyN) {
        this.bSEmptyN = bSEmptyN;
    }

    @Basic
    @Column(name = "b_s_reg_n", nullable = true)
    public Integer getbSRegN() {
        return bSRegN;
    }

    public void setbSRegN(Integer bSRegN) {
        this.bSRegN = bSRegN;
    }

    @Basic
    @Column(name = "b_s_water_o_n", nullable = true)
    public Integer getbSWaterON() {
        return bSWaterON;
    }

    public void setbSWaterON(Integer bSWaterON) {
        this.bSWaterON = bSWaterON;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BSStatics bsStatics = (BSStatics) o;

        if (bSId != bsStatics.bSId) return false;
        if (bSUserId != null ? !bSUserId.equals(bsStatics.bSUserId) : bsStatics.bSUserId != null) return false;
        if (bST != null ? !bST.equals(bsStatics.bST) : bsStatics.bST != null) return false;
        if (bSScrapN != null ? !bSScrapN.equals(bsStatics.bSScrapN) : bsStatics.bSScrapN != null) return false;
        if (bSRefluxN != null ? !bSRefluxN.equals(bsStatics.bSRefluxN) : bsStatics.bSRefluxN != null) return false;
        if (bSEmptyN != null ? !bSEmptyN.equals(bsStatics.bSEmptyN) : bsStatics.bSEmptyN != null) return false;
        if (bSRegN != null ? !bSRegN.equals(bsStatics.bSRegN) : bsStatics.bSRegN != null) return false;
        if (bSWaterON != null ? !bSWaterON.equals(bsStatics.bSWaterON) : bsStatics.bSWaterON != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = bSId;
        result = 31 * result + (bSUserId != null ? bSUserId.hashCode() : 0);
        result = 31 * result + (bST != null ? bST.hashCode() : 0);
        result = 31 * result + (bSScrapN != null ? bSScrapN.hashCode() : 0);
        result = 31 * result + (bSRefluxN != null ? bSRefluxN.hashCode() : 0);
        result = 31 * result + (bSEmptyN != null ? bSEmptyN.hashCode() : 0);
        result = 31 * result + (bSRegN != null ? bSRegN.hashCode() : 0);
        result = 31 * result + (bSWaterON != null ? bSWaterON.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "b_s_user_id", referencedColumnName = "user_info_id")
    public UserInfo getUserInfoByBSUserId() {
        return userInfoByBSUserId;
    }

    public void setUserInfoByBSUserId(UserInfo userInfoByBSUserId) {
        this.userInfoByBSUserId = userInfoByBSUserId;
    }
}
