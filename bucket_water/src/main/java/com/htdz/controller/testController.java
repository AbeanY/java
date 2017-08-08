package com.htdz.controller;

import com.htdz.dao.IBBasicDao;
import com.htdz.model.BBasic;
import com.htdz.service.testService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.sql.Timestamp;
import java.util.Date;

/**
 * Created by yab on 2017/7/6.
 */
    @Controller
    @RequestMapping("/test")
    public class testController {

    @Autowired
    private testService testservice;
    @Autowired
    private IBBasicDao bbasicDao;

    @RequestMapping(value="/test",method= RequestMethod.GET)
    @ResponseBody
    public BBasic test(HttpServletRequest request){
        BBasic bbasic=null;
        try {
             bbasic = testservice.test();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return bbasic;
    }


        @RequestMapping(value="/login",method= RequestMethod.GET)
        @ResponseBody
        public String login(HttpServletRequest request){
            BBasic bbasci = new BBasic();
            Date date=new Date();
            Timestamp timestamp=new Timestamp(date.getTime());
            bbasci.setBucketBasicId("12345678");
            bbasci.setBucketRegisterTime(timestamp);
            bbasci.setBucketOwner("ssss");
            bbasci.setBucketManufacture("sss");
            bbasci.setBucketLegalUser("sss");
            try {
                bbasicDao.save(bbasci);
            } catch (Exception e) {
                e.printStackTrace();
            }
            return "sssss";
        }

    }
