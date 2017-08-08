package com.htdz.service.Impl;

import com.htdz.dao.IBSStaticsDao;
import com.htdz.dao.ICBasicDao;
import com.htdz.dao.IUserInfoDao;
import com.htdz.model.BSStatics;
import com.htdz.model.UserInfo;
import com.htdz.service.WaterEnterpriseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.sql.Timestamp;
import java.util.List;
import java.util.Map;

/**
 * Created by yab on 2017/7/10.
 */
@Component
public class WaterEnterpriseServiceImpl implements WaterEnterpriseService {

    @Autowired
    IBSStaticsDao bStaticDao;
    @Autowired
    IUserInfoDao userInfoDao;
    @Autowired
    ICBasicDao cBasicDao;

    @Override
    public BSStatics getNowInformation(int userid) throws Exception {
        /*处理流程：
        1.根据用户id从统计信息表中读取统计信息
         */
        String bstatic_hql = "from BSStatics b where b.userInfoByBSUserId=" + userid + " order by bST desc";
        BSStatics bStatic = new BSStatics();
        List<BSStatics> list = bStaticDao.findList(bstatic_hql);//.findOne(bstatic_hql);
        return list.get(0);
    }

    @Override
    public BSStatics getInformationByTime(int userid, Timestamp starttime, Timestamp endtime) throws Exception {
        /*处理流程
        1.根据用户id和时间段，从统计信息表中读取统计信息
         */
        String bstatic_hql = "from BSStatics b where b.userInfoByBSUserId=" + userid + " and bST>" + starttime + " and bST<" + endtime;
        BSStatics bStatic = new BSStatics();
        List<BSStatics> list = bStaticDao.findList(bstatic_hql);//.findOne(bstatic_hql);
        return list.get(0);

    }
}
