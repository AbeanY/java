package com.htdz.controller;

import com.htdz.dao.IBBasicDao;
import com.htdz.model.UserInfo;
import com.htdz.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by yab on 2017/7/6.
 */
    @Controller
    @RequestMapping("/user")
    public class UserController {

    @Autowired
    private UserService userService;
    @Autowired
    private IBBasicDao bbasicDao;

        @RequestMapping(value="/login",method= RequestMethod.POST)
        @ResponseBody
        public Map<String,Object> login(HttpServletRequest request){
           String username = request.getParameter("username");
           String password = request.getParameter("password");

            Map<String,Object> returnMap = new HashMap<String,Object>();

            try {
                Map<String,Object> map = userService.login(username, password);
                //获取user实体
                Object object = map.get("value");
                if(object != null){
                    UserInfo user = (UserInfo) object;
                    HttpSession session = request.getSession();
                    session.setAttribute("userId", user.getUserInfoId());
                }
                returnMap.put("value", object);
                returnMap.put("message", map.get("message"));
                returnMap.put("success", map.get("success"));
            } catch (Exception e) {
                returnMap.put("message", "异常：登录失败!");
                returnMap.put("success", false);
                e.printStackTrace();
            }
            return returnMap;
        }


    }
