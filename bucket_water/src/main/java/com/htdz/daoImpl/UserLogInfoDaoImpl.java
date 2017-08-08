package com.htdz.daoImpl;

import com.htdz.dao.IUserLogInfoDao;
import com.htdz.model.UserLogInfo;
import org.springframework.stereotype.Component;

/**
 * Created by yab on 2017/7/6.
 */
@Component
public class UserLogInfoDaoImpl extends BaseDaoImpl<UserLogInfo> implements IUserLogInfoDao {

    public UserLogInfoDaoImpl(){
        super(UserLogInfo.class);
    }

}