package com.htdz.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Collection;

/**
 * Created by yab on 2017/7/10.
 */
@Entity
@Table(name = "b_basic", schema = "bucket_water_db", catalog = "")
public class BBasic {
    private String bucketBasicId;
    private String bucketManufacture;
    private String bucketOwner;
    private String bucketLegalUser;
    private Timestamp bucketRegisterTime;
    private Collection<BR0> bR0sByBucketBasicId;
    private Collection<BR1> bR1sByBucketBasicId;
    private Collection<BR10> bR10sByBucketBasicId;
    private Collection<BR11> bR11sByBucketBasicId;
    private Collection<BR2> bR2sByBucketBasicId;
    private Collection<BR3> bR3sByBucketBasicId;
    private Collection<BR4> bR4sByBucketBasicId;
    private Collection<BR6> bR6sByBucketBasicId;
    private Collection<BStatus> bStatusesByBucketBasicId;

    @Id
    @Column(name = "bucket_basic_id", nullable = false, length = 8)
    public String getBucketBasicId() {
        return bucketBasicId;
    }

    public void setBucketBasicId(String bucketBasicId) {
        this.bucketBasicId = bucketBasicId;
    }

    @Basic
    @Column(name = "bucket_manufacture", nullable = true, length = 20)
    public String getBucketManufacture() {
        return bucketManufacture;
    }

    public void setBucketManufacture(String bucketManufacture) {
        this.bucketManufacture = bucketManufacture;
    }

    @Basic
    @Column(name = "bucket_owner", nullable = true, length = 20)
    public String getBucketOwner() {
        return bucketOwner;
    }

    public void setBucketOwner(String bucketOwner) {
        this.bucketOwner = bucketOwner;
    }

    @Basic
    @Column(name = "bucket_legal_user", nullable = true, length = 20)
    public String getBucketLegalUser() {
        return bucketLegalUser;
    }

    public void setBucketLegalUser(String bucketLegalUser) {
        this.bucketLegalUser = bucketLegalUser;
    }

    @Basic
    @Column(name = "bucket_register_time", nullable = true)
    public Timestamp getBucketRegisterTime() {
        return bucketRegisterTime;
    }

    public void setBucketRegisterTime(Timestamp bucketRegisterTime) {
        this.bucketRegisterTime = bucketRegisterTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BBasic bBasic = (BBasic) o;

        if (bucketBasicId != null ? !bucketBasicId.equals(bBasic.bucketBasicId) : bBasic.bucketBasicId != null)
            return false;
        if (bucketManufacture != null ? !bucketManufacture.equals(bBasic.bucketManufacture) : bBasic.bucketManufacture != null)
            return false;
        if (bucketOwner != null ? !bucketOwner.equals(bBasic.bucketOwner) : bBasic.bucketOwner != null) return false;
        if (bucketLegalUser != null ? !bucketLegalUser.equals(bBasic.bucketLegalUser) : bBasic.bucketLegalUser != null)
            return false;
        if (bucketRegisterTime != null ? !bucketRegisterTime.equals(bBasic.bucketRegisterTime) : bBasic.bucketRegisterTime != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = bucketBasicId != null ? bucketBasicId.hashCode() : 0;
        result = 31 * result + (bucketManufacture != null ? bucketManufacture.hashCode() : 0);
        result = 31 * result + (bucketOwner != null ? bucketOwner.hashCode() : 0);
        result = 31 * result + (bucketLegalUser != null ? bucketLegalUser.hashCode() : 0);
        result = 31 * result + (bucketRegisterTime != null ? bucketRegisterTime.hashCode() : 0);
        return result;
    }
    @JsonIgnore
    @OneToMany(mappedBy = "bBasicByBR0BBId")
    public Collection<BR0> getbR0sByBucketBasicId() {
        return bR0sByBucketBasicId;
    }

    public void setbR0sByBucketBasicId(Collection<BR0> bR0sByBucketBasicId) {
        this.bR0sByBucketBasicId = bR0sByBucketBasicId;
    }
    @JsonIgnore
    @OneToMany(mappedBy = "bBasicByBR1BBId")
    public Collection<BR1> getbR1sByBucketBasicId() {
        return bR1sByBucketBasicId;
    }

    public void setbR1sByBucketBasicId(Collection<BR1> bR1sByBucketBasicId) {
        this.bR1sByBucketBasicId = bR1sByBucketBasicId;
    }
    @JsonIgnore
    @OneToMany(mappedBy = "bBasicByBR10BBId")
    public Collection<BR10> getbR10sByBucketBasicId() {
        return bR10sByBucketBasicId;
    }

    public void setbR10sByBucketBasicId(Collection<BR10> bR10sByBucketBasicId) {
        this.bR10sByBucketBasicId = bR10sByBucketBasicId;
    }
    @JsonIgnore
    @OneToMany(mappedBy = "bBasicByBR11BBId")
    public Collection<BR11> getbR11sByBucketBasicId() {
        return bR11sByBucketBasicId;
    }

    public void setbR11sByBucketBasicId(Collection<BR11> bR11sByBucketBasicId) {
        this.bR11sByBucketBasicId = bR11sByBucketBasicId;
    }
    @JsonIgnore
    @OneToMany(mappedBy = "bBasicByBR2BBId")
    public Collection<BR2> getbR2sByBucketBasicId() {
        return bR2sByBucketBasicId;
    }

    public void setbR2sByBucketBasicId(Collection<BR2> bR2sByBucketBasicId) {
        this.bR2sByBucketBasicId = bR2sByBucketBasicId;
    }
    @JsonIgnore
    @OneToMany(mappedBy = "bBasicByBR3BBId")
    public Collection<BR3> getbR3sByBucketBasicId() {
        return bR3sByBucketBasicId;
    }

    public void setbR3sByBucketBasicId(Collection<BR3> bR3sByBucketBasicId) {
        this.bR3sByBucketBasicId = bR3sByBucketBasicId;
    }
    @JsonIgnore
    @OneToMany(mappedBy = "bBasicByBR4BBId")
    public Collection<BR4> getbR4sByBucketBasicId() {
        return bR4sByBucketBasicId;
    }

    public void setbR4sByBucketBasicId(Collection<BR4> bR4sByBucketBasicId) {
        this.bR4sByBucketBasicId = bR4sByBucketBasicId;
    }
    @JsonIgnore
    @OneToMany(mappedBy = "bBasicByBR6BBId")
    public Collection<BR6> getbR6sByBucketBasicId() {
        return bR6sByBucketBasicId;
    }

    public void setbR6sByBucketBasicId(Collection<BR6> bR6sByBucketBasicId) {
        this.bR6sByBucketBasicId = bR6sByBucketBasicId;
    }
    @JsonIgnore
    @OneToMany(mappedBy = "bBasicByBucketStatusBBId")
    public Collection<BStatus> getbStatusesByBucketBasicId() {
        return bStatusesByBucketBasicId;
    }

    public void setbStatusesByBucketBasicId(Collection<BStatus> bStatusesByBucketBasicId) {
        this.bStatusesByBucketBasicId = bStatusesByBucketBasicId;
    }
}
