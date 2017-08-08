package com.htdz.service;


import com.htdz.model.UserInfo;

import java.util.Map;

/**
 * Created by yab on 2017/7/7.
 * 用户管理
 */
public interface UserService {


    /**
     * 用户登录
     * @param username  用户名
     * @param password  密码
     * @return
     * @throws Exception
     */
    public Map<String, Object> login(String username , String password) throws Exception;

    /**
     * 用户注册
     * @param userInfo   用户注册信息
     * @return
     * @throws Exception
     */
    public Map<String, Object> register(UserInfo userInfo) throws Exception;
}
