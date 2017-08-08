package com.htdz.daoImpl;

import com.htdz.dao.IGatewayInfoDao;
import com.htdz.model.GatewayInfo;
import org.springframework.stereotype.Component;

/**
 * Created by yab on 2017/7/6.
 */
@Component
public class GatewayInfoDaoImpl extends BaseDaoImpl<GatewayInfo> implements IGatewayInfoDao {

    public GatewayInfoDaoImpl(){
        super(GatewayInfo.class);
    }

}