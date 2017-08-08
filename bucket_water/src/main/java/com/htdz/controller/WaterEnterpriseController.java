package com.htdz.controller;

import com.htdz.model.BSStatics;
import com.htdz.service.WaterEnterpriseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import javax.servlet.http.HttpServletRequest;

/**
     * Created by yab on 2017/7/10.
     * 水企用户信息服务
     */
    @Controller
    @RequestMapping("/W_Enterprise")
    public class WaterEnterpriseController {

        @Autowired
        private WaterEnterpriseService waterEnterpriseService;

        /**
         * 水企当前时刻桶统计信息
         * @param request
         * @return
         * @throws Exception
         */
        @RequestMapping(value="/getNowInformation",method= RequestMethod.GET)
        @ResponseBody
        public BSStatics getNowInformation(HttpServletRequest request) throws Exception {
            int userid = Integer.parseInt(request.getParameter("userid"));
            BSStatics bStatic = new BSStatics();
            bStatic= waterEnterpriseService.getNowInformation(userid);
            return bStatic;
        }

        /**
         * 按时间段统计桶信息
         * @param request
         * @return
         * @throws Exception
         */
        @RequestMapping(value="/getInformationByTime",method= RequestMethod.POST)
        @ResponseBody
        public BSStatics getInformationByTime(HttpServletRequest request) throws Exception {
            int userid = Integer.parseInt(request.getParameter("userid"));

            BSStatics bStatic = new BSStatics();
           // bStatic= waterEnterpriseService.getNowInformation(userid);
            return bStatic;
        }


    }

