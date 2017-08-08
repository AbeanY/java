package com.htdz.model;

import javax.persistence.*;

/**
 * Created by yab on 2017/7/10.
 */
@Entity
@Table(name = "c_e_in_bill", schema = "bucket_water_db", catalog = "")
public class CEInBill {
    private int cEInBillId;
    private Integer cEInCEId;
    private String cEInBId;
    private CElectronic cElectronicByCEInCEId;

    @Id
    @Column(name = "c_e_in_bill_id", nullable = false)
    public int getcEInBillId() {
        return cEInBillId;
    }

    public void setcEInBillId(int cEInBillId) {
        this.cEInBillId = cEInBillId;
    }

/*    @Basic
    @Column(name = "c_e_in_c_e_id", nullable = true)
    public Integer getcEInCEId() {
        return cEInCEId;
    }

    public void setcEInCEId(Integer cEInCEId) {
        this.cEInCEId = cEInCEId;
    }*/

    @Basic
    @Column(name = "c_e_in_b_id", nullable = true, length = 8)
    public String getcEInBId() {
        return cEInBId;
    }

    public void setcEInBId(String cEInBId) {
        this.cEInBId = cEInBId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CEInBill ceInBill = (CEInBill) o;

        if (cEInBillId != ceInBill.cEInBillId) return false;
        if (cEInCEId != null ? !cEInCEId.equals(ceInBill.cEInCEId) : ceInBill.cEInCEId != null) return false;
        if (cEInBId != null ? !cEInBId.equals(ceInBill.cEInBId) : ceInBill.cEInBId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = cEInBillId;
        result = 31 * result + (cEInCEId != null ? cEInCEId.hashCode() : 0);
        result = 31 * result + (cEInBId != null ? cEInBId.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "c_e_in_c_e_id", referencedColumnName = "c_e_id")
    public CElectronic getcElectronicByCEInCEId() {
        return cElectronicByCEInCEId;
    }

    public void setcElectronicByCEInCEId(CElectronic cElectronicByCEInCEId) {
        this.cElectronicByCEInCEId = cElectronicByCEInCEId;
    }
}
