package com.htdz.daoImpl;

import com.htdz.dao.IBR1Dao;
import com.htdz.model.BR1;
import org.springframework.stereotype.Component;

/**
 * Created by yab on 2017/7/6.
 */
@Component
public class BR1DaoImpl extends BaseDaoImpl<BR1> implements IBR1Dao {

    public BR1DaoImpl(){
        super(BR1.class);
    }

}