package com.htdz.test;

import com.htdz.dao.IBBasicDao;
import com.htdz.daoImpl.BBasicDaoImpl;
import com.htdz.model.BBasic;

import java.sql.Timestamp;
import java.util.Date;

/**
 * Created by yab on 2017/7/6.
 */

public class test {


    public static void main(String[] args) throws Exception {
        IBBasicDao bbasciDao = new BBasicDaoImpl();

        BBasic bbasci = new BBasic();
        Date date=new Date();
        Timestamp timestamp=new Timestamp(date.getTime());
        bbasci.setBucketRegisterTime(timestamp);
        bbasci.setBucketOwner("ssss");
        bbasci.setBucketManufacture("sss");
        bbasci.setBucketLegalUser("sss");
        bbasciDao.save(bbasci);

    }
}
