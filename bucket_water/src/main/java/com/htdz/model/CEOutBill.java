package com.htdz.model;

import javax.persistence.*;

/**
 * Created by yab on 2017/7/10.
 */
@Entity
@Table(name = "c_e_out_bill", schema = "bucket_water_db", catalog = "")
public class CEOutBill {
    private int cEOBillId;
    private Integer cEOCEId;
    private String cEOBId;
    private CElectronic cElectronicByCEOCEId;

    @Id
    @Column(name = "c_e_o_bill_id", nullable = false)
    public int getcEOBillId() {
        return cEOBillId;
    }

    public void setcEOBillId(int cEOBillId) {
        this.cEOBillId = cEOBillId;
    }

/*
    @Basic
    @Column(name = "c_e_o_c_e_id", nullable = true)
    public Integer getcEOCEId() {
        return cEOCEId;
    }

    public void setcEOCEId(Integer cEOCEId) {
        this.cEOCEId = cEOCEId;
    }
*/

    @Basic
    @Column(name = "c_e_o_b_id", nullable = true, length = 8)
    public String getcEOBId() {
        return cEOBId;
    }

    public void setcEOBId(String cEOBId) {
        this.cEOBId = cEOBId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        CEOutBill ceOutBill = (CEOutBill) o;

        if (cEOBillId != ceOutBill.cEOBillId) return false;
        if (cEOCEId != null ? !cEOCEId.equals(ceOutBill.cEOCEId) : ceOutBill.cEOCEId != null) return false;
        if (cEOBId != null ? !cEOBId.equals(ceOutBill.cEOBId) : ceOutBill.cEOBId != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = cEOBillId;
        result = 31 * result + (cEOCEId != null ? cEOCEId.hashCode() : 0);
        result = 31 * result + (cEOBId != null ? cEOBId.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "c_e_o_c_e_id", referencedColumnName = "c_e_id")
    public CElectronic getcElectronicByCEOCEId() {
        return cElectronicByCEOCEId;
    }

    public void setcElectronicByCEOCEId(CElectronic cElectronicByCEOCEId) {
        this.cElectronicByCEOCEId = cElectronicByCEOCEId;
    }
}
