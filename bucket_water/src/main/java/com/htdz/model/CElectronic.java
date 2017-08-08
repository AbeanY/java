package com.htdz.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Collection;

/**
 * Created by yab on 2017/7/10.
 */
@Entity
@Table(name = "c_electronic", schema = "bucket_water_db", catalog = "")
public class CElectronic {
    private int cEId;
    private Integer cECBId;
    private Timestamp cECommitT;
    private String cEInSid;
    private String cEOutSide;
    private Integer cEBN;
    private Integer cEIoStatus;
    private Collection<CEInBill> cEInBillsByCEId;
    private Collection<CEOutBill> cEOutBillsByCEId;
    private CBasic cBasicByCECBId;

    @Id
    @Column(name = "c_e_id", nullable = false)
    public int getcEId() {
        return cEId;
    }

    public void setcEId(int cEId) {
        this.cEId = cEId;
    }

/*    @Basic
    @Column(name = "c_e_c_b_id", nullable = true)
    public Integer getcECBId() {
        return cECBId;
    }

    public void setcECBId(Integer cECBId) {
        this.cECBId = cECBId;
    }*/

    @Basic
    @Column(name = "c_e_commit_t", nullable = true)
    public Timestamp getcECommitT() {
        return cECommitT;
    }

    public void setcECommitT(Timestamp cECommitT) {
        this.cECommitT = cECommitT;
    }

    @Basic
    @Column(name = "c_e_in_sid", nullable = true, length = 20)
    public String getcEInSid() {
        return cEInSid;
    }

    public void setcEInSid(String cEInSid) {
        this.cEInSid = cEInSid;
    }

    @Basic
    @Column(name = "c_e_out_side", nullable = true, length = 20)
    public String getcEOutSide() {
        return cEOutSide;
    }

    public void setcEOutSide(String cEOutSide) {
        this.cEOutSide = cEOutSide;
    }

    @Basic
    @Column(name = "c_e_b_n", nullable = true)
    public Integer getcEBN() {
        return cEBN;
    }

    public void setcEBN(Integer cEBN) {
        this.cEBN = cEBN;
    }

    @Basic
    @Column(name = "c_e_io_status", nullable = true)
    public Integer getcEIoStatus() {
        return cEIoStatus;
    }

    public void setcEIoStatus(Integer cEIoStatus) {
        this.cEIoStatus = cEIoStatus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CElectronic that = (CElectronic) o;

        if (cEId != that.cEId) return false;
        if (cECBId != null ? !cECBId.equals(that.cECBId) : that.cECBId != null) return false;
        if (cECommitT != null ? !cECommitT.equals(that.cECommitT) : that.cECommitT != null) return false;
        if (cEInSid != null ? !cEInSid.equals(that.cEInSid) : that.cEInSid != null) return false;
        if (cEOutSide != null ? !cEOutSide.equals(that.cEOutSide) : that.cEOutSide != null) return false;
        if (cEBN != null ? !cEBN.equals(that.cEBN) : that.cEBN != null) return false;
        if (cEIoStatus != null ? !cEIoStatus.equals(that.cEIoStatus) : that.cEIoStatus != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = cEId;
        result = 31 * result + (cECBId != null ? cECBId.hashCode() : 0);
        result = 31 * result + (cECommitT != null ? cECommitT.hashCode() : 0);
        result = 31 * result + (cEInSid != null ? cEInSid.hashCode() : 0);
        result = 31 * result + (cEOutSide != null ? cEOutSide.hashCode() : 0);
        result = 31 * result + (cEBN != null ? cEBN.hashCode() : 0);
        result = 31 * result + (cEIoStatus != null ? cEIoStatus.hashCode() : 0);
        return result;
    }

    @JsonIgnore
    @OneToMany(mappedBy = "cElectronicByCEInCEId")
    public Collection<CEInBill> getcEInBillsByCEId() {
        return cEInBillsByCEId;
    }

    public void setcEInBillsByCEId(Collection<CEInBill> cEInBillsByCEId) {
        this.cEInBillsByCEId = cEInBillsByCEId;
    }

    @JsonIgnore
    @OneToMany(mappedBy = "cElectronicByCEOCEId")
    public Collection<CEOutBill> getcEOutBillsByCEId() {
        return cEOutBillsByCEId;
    }

    public void setcEOutBillsByCEId(Collection<CEOutBill> cEOutBillsByCEId) {
        this.cEOutBillsByCEId = cEOutBillsByCEId;
    }

    @ManyToOne
    @JoinColumn(name = "c_e_c_b_id", referencedColumnName = "c_basic_id")
    public CBasic getcBasicByCECBId() {
        return cBasicByCECBId;
    }

    public void setcBasicByCECBId(CBasic cBasicByCECBId) {
        this.cBasicByCECBId = cBasicByCECBId;
    }
}
