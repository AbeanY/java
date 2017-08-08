package com.htdz.service.Impl;

import com.htdz.dao.IUserInfoDao;
import com.htdz.model.UserInfo;
import com.htdz.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by yab on 2017/7/7.
 */
@Component
public class UserServiceImpl implements UserService {

    @Autowired
    IUserInfoDao userInfDao;

    /**
     *
     * @param username  用户名
     * @param password  密码
     * @return
     * @throws Exception
     */
    @Override
    public Map<String, Object> login(String username , String password) throws Exception {
        Map<String,Object> returnMap = new HashMap<String,Object>();
        String hql = "from UserInf u where u.userInfName='"+username;
        UserInfo userInf = new UserInfo();
        try {
            userInf = userInfDao.findOne(hql);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if(userInf!=null)
        {
            if (password.equals(userInf.getUserInfoPwd()))
            {
                returnMap.put("value", userInf);
                returnMap.put("message", "登录成功");
                returnMap.put("success", true);
            }else{
                returnMap.put("value", userInf);
                returnMap.put("message", "密码错误");
                returnMap.put("success", false);
            }
        }else{
            returnMap.put("message", "用户不存在");
            returnMap.put("success", false);
        }
        return returnMap;
    }

    @Override
    public Map<String, Object> register(UserInfo userInf) throws Exception {
        return null;
    }

}
