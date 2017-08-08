package com.htdz.daoImpl;

import com.htdz.dao.IBR2Dao;
import com.htdz.model.BR2;
import org.springframework.stereotype.Component;

/**
 * Created by yab on 2017/7/6.
 */
@Component
public class BR2DaoImpl extends BaseDaoImpl<BR2> implements IBR2Dao {

    public BR2DaoImpl(){
        super(BR2.class);
    }

}