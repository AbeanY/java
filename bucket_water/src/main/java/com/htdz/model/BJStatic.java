package com.htdz.model;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * Created by yab on 2017/7/10.
 */
@Entity
@Table(name = "b_j_static", schema = "bucket_water_db", catalog = "")
public class BJStatic {
    private int bJId;
    private Integer bJUserId;
    private Integer bJWaterId;
    private Integer bJInN;
    private Integer bJOutN;
    private Timestamp bJTime;
    private UserInfo userInfoByBJUserId;

    @Id
    @Column(name = "b_j_id", nullable = false)
    public int getbJId() {
        return bJId;
    }

    public void setbJId(int bJId) {
        this.bJId = bJId;
    }

/*
    @Basic
    @Column(name = "b_j_user_id", nullable = true)
    public Integer getbJUserId() {
        return bJUserId;
    }

    public void setbJUserId(Integer bJUserId) {
        this.bJUserId = bJUserId;
    }
*/

    @Basic
    @Column(name = "b_j_water_id", nullable = true)
    public Integer getbJWaterId() {
        return bJWaterId;
    }

    public void setbJWaterId(Integer bJWaterId) {
        this.bJWaterId = bJWaterId;
    }

    @Basic
    @Column(name = "b_j_in_n", nullable = true)
    public Integer getbJInN() {
        return bJInN;
    }

    public void setbJInN(Integer bJInN) {
        this.bJInN = bJInN;
    }

    @Basic
    @Column(name = "b_j_out_n", nullable = true)
    public Integer getbJOutN() {
        return bJOutN;
    }

    public void setbJOutN(Integer bJOutN) {
        this.bJOutN = bJOutN;
    }

    @Basic
    @Column(name = "b_j_time", nullable = true)
    public Timestamp getbJTime() {
        return bJTime;
    }

    public void setbJTime(Timestamp bJTime) {
        this.bJTime = bJTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        BJStatic bjStatic = (BJStatic) o;

        if (bJId != bjStatic.bJId) return false;
        if (bJUserId != null ? !bJUserId.equals(bjStatic.bJUserId) : bjStatic.bJUserId != null) return false;
        if (bJWaterId != null ? !bJWaterId.equals(bjStatic.bJWaterId) : bjStatic.bJWaterId != null) return false;
        if (bJInN != null ? !bJInN.equals(bjStatic.bJInN) : bjStatic.bJInN != null) return false;
        if (bJOutN != null ? !bJOutN.equals(bjStatic.bJOutN) : bjStatic.bJOutN != null) return false;
        if (bJTime != null ? !bJTime.equals(bjStatic.bJTime) : bjStatic.bJTime != null) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = bJId;
        result = 31 * result + (bJUserId != null ? bJUserId.hashCode() : 0);
        result = 31 * result + (bJWaterId != null ? bJWaterId.hashCode() : 0);
        result = 31 * result + (bJInN != null ? bJInN.hashCode() : 0);
        result = 31 * result + (bJOutN != null ? bJOutN.hashCode() : 0);
        result = 31 * result + (bJTime != null ? bJTime.hashCode() : 0);
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "b_j_user_id", referencedColumnName = "user_info_id")
    public UserInfo getUserInfoByBJUserId() {
        return userInfoByBJUserId;
    }

    public void setUserInfoByBJUserId(UserInfo userInfoByBJUserId) {
        this.userInfoByBJUserId = userInfoByBJUserId;
    }
}
