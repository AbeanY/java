package com.htdz.service;


import com.htdz.model.BSStatics;

import java.sql.Timestamp;
import java.util.Map;

/**
 * Created by yab on 2017/7/10.
 * 水企信息服务
 */
public interface WaterEnterpriseService {

    /**
     * 得到水企当前时刻桶统计信息
     * @param userid 用户id
     * @return
     * @throws Exception
     */
    public BSStatics getNowInformation(int userid) throws Exception;

    /**
     * 得到水企按时间段统计桶信息
     * @param userid
     * @param starttime
     * @param endtime
     * @return
     * @throws Exception
     */
    public BSStatics getInformationByTime(int userid , Timestamp starttime , Timestamp endtime) throws Exception;
}
