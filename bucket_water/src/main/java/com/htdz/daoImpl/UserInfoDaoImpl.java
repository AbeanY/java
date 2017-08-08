package com.htdz.daoImpl;

import com.htdz.dao.IUserInfoDao;
import com.htdz.model.UserInfo;
import org.springframework.stereotype.Component;

/**
 * Created by yab on 2017/7/6.
 */
@Component
public class UserInfoDaoImpl extends BaseDaoImpl<UserInfo> implements IUserInfoDao {

    public UserInfoDaoImpl(){
        super(UserInfo.class);
    }

}