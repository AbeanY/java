package com.xxxx.test.service;

import com.xxxx.test.dao.UserEntityDAO;
import com.xxxx.test.model.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by yab on 2017/7/24.
 */
@Service
public class UserServices {

    @Autowired
    UserEntityDAO userEntityDAO;
    /**
     *
     * @param username  用户名
     * @param password  密码
     * @return
     * @throws Exception
     */
    public Map<String, Object> login(String username , String password) throws Exception {
        Map<String,Object> returnMap = new HashMap<String,Object>();
        String hql = "from UserEntity u where u.username='"+username+"'";
        UserEntity userInf = new UserEntity();
        try {
            userInf = userEntityDAO.findOne(hql);
        } catch (Exception e) {
            e.printStackTrace();
        }
        if(userInf!=null)
        {
            if (password.equals(userInf.getPassword()))
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
}
