package com.htdz.daoImpl;

import com.htdz.dao.IBR4Dao;
import com.htdz.model.BR4;
import org.springframework.stereotype.Component;

/**
 * Created by yab on 2017/7/6.
 */
@Component
public class BR4DaoImpl extends BaseDaoImpl<BR4> implements IBR4Dao {

    public BR4DaoImpl(){
        super(BR4.class);
    }

}