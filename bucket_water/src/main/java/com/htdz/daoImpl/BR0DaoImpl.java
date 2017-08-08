package com.htdz.daoImpl;

import com.htdz.dao.IBR0Dao;
import com.htdz.model.BR0;
import org.springframework.stereotype.Component;

/**
 * Created by yab on 2017/7/6.
 */
@Component
public class BR0DaoImpl extends BaseDaoImpl<BR0> implements IBR0Dao {

    public BR0DaoImpl(){
        super(BR0.class);
    }

}