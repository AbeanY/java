package com.xxxx.test.controller;

import com.xxxx.test.model.UserEntity;
import com.xxxx.test.service.UserServices;
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
 * Created by yab on 2017/7/24.
 */
@Controller
public class UserController {
    @Autowired
    private UserServices userService;


    @RequestMapping(value="/login",method= RequestMethod.GET)
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
                UserEntity user = (UserEntity) object;
                HttpSession session = request.getSession();
                session.setAttribute("userId", user.getId());
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
