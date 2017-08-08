package com.htdz.service.Impl;

import com.htdz.dao.IBBasicDao;
import com.htdz.model.BBasic;
import com.htdz.service.testService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by yab on 2017/7/7.
 */
@Component
public class testServiceImpl implements testService {

    @Autowired
    IBBasicDao bbasicDao;
    @Override
    public BBasic test() throws Exception {
        Map<String,Object> returnMap = new HashMap<String,Object>();
        String hql = "from BBasic";
        BBasic bBasic = new BBasic();
        try {
            bBasic = bbasicDao.findOne(hql);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return bBasic;
    }

}
