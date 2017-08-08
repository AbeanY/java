package com.htdz.model;

import javax.persistence.*;

/**
 * Created by yab on 2017/7/10.
 */
@Entity
@Table(name = "b_status", schema = "bucket_water_db", catalog = "")
public class BStatus {
    private int bucketStatusId;
    private String bucketStatusBBId;
    private String bucketStatus;
    private String bucketStatusUser;
    private Integer bucketStatusNum;
    private Integer bucketStatusTime;
    private String bucketStatusLink;
    private BBasic bBasicByBucketStatusBBId;

    @Id
    @Column(name = "bucket_status_id", nullable = false)
    public int getBucketStatusId() {
        return bucketStatusId;
    }

    public void setBucketStatusId(int bucketStatusId) {
        this.bucketStatusId = bucketStatusId;
    }

  /*  @Basic
    @Column(name = "bucket_status_b_b_id", nullable = true, length = 8)
    public String getBucketStatusBBId() {
        return bucketStatusBBId;
    }
*/
    public void setBucketStatusBBId(String bucketStatusBBId) {
        this.bucketStatusBBId = bucketStatusBBId;
    }

    @Basic
    @Column(name = "bucket_status", nullable = true, length = 20)
    public String getBucketStatus() {
        return bucketStatus;
    }

    public void setBucketStatus(String bucketStatus) {
        this.bucketStatus = bucketStatus;
    }

    @Basic
    @Column(name = "bucket_status_user", nullable = true, length = 20)
    public String getBucketStatusUser() {
        return bucketStatusUser;
    }

    public void setBucketStatusUser(String bucketStatusUser) {
        this.bucketStatusUser = bucketStatusUser;
    }

    @Basic
    @Column(name = "bucket_status_num", nullable = true)
    public Integer getBucketStatusNum() {
        return bucketStatusNum;
    }

    public void setBucketStatusNum(Integer bucketStatusNum) {
        this.bucketStatusNum = bucketStatusNum;
    }

    @Basic
    @Column(name = "bucket_status_time", nullable = true)
    public Integer getBucketStatusTime() {
        return bucketStatusTime;
    }

    public void setBucketStatusTime(Integer bucketStatusTime) {
        this.bucketStatusTime = bucketStatusTime;
    }

    @Basic
    @Column(name = "bucket_status_link", nullable = true, length = 20)
    public String getBucketStatusLink() {
        return bucketStatusLink;
    }

    public void setBucketStatusLink(String bucketStatusLink) {
        this.bucketStatusLink = bucketStatusLink;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BStatus bStatus = (BStatus) o;

        if (bucketStatusId != bStatus.bucketStatusId) return false;
        if (bucketStatusBBId != null ? !bucketStatusBBId.equals(bStatus.bucketStatusBBId) : bStatus.bucketStatusBBId != null)
            return false;
        if (bucketStatus != null ? !bucketStatus.equals(bStatus.bucketStatus) : bStatus.bucketStatus != null)
            return false;
        if (bucketStatusUser != null ? !bucketStatusUser.equals(bStatus.bucketStatusUser) : bStatus.bucketStatusUser != null)
            return false;
        if (bucketStatusNum != null ? !bucketStatusNum.equals(bStatus.bucketStatusNum) : bStatus.bucketStatusNum != null)
            return false;
        if (bucketStatusTime != null ? !bucketStatusTime.equals(bStatus.bucketStatusTime) : bStatus.bucketStatusTime != null)
            return false;
        if (bucketStatusLink != null ? !bucketStatusLink.equals(bStatus.bucketStatusLink) : bStatus.bucketStatusLink != null)
            return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = bucketStatusId;
        result = 31 * result + (bucketStatusBBId != null ? bucketStatusBBId.hashCode() : 0);
        result = 31 * result + (bucketStatus != null ? bucketStatus.hashCode() : 0);
        result = 31 * result + (bucketStatusUser != null ? bucketStatusUser.hashCode() : 0);
        result = 31 * result + (bucketStatusNum != null ? bucketStatusNum.hashCode() : 0);
        result = 31 * result + (bucketStatusTime != null ? bucketStatusTime.hashCode() : 0);
        result = 31 * result + (bucketStatusLink != null ? bucketStatusLink.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "bucket_status_b_b_id", referencedColumnName = "bucket_basic_id")
    public BBasic getbBasicByBucketStatusBBId() {
        return bBasicByBucketStatusBBId;
    }

    public void setbBasicByBucketStatusBBId(BBasic bBasicByBucketStatusBBId) {
        this.bBasicByBucketStatusBBId = bBasicByBucketStatusBBId;
    }
}
