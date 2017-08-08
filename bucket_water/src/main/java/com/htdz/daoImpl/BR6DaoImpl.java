package com.htdz.daoImpl;

import com.htdz.dao.IBR6Dao;
import com.htdz.model.BR6;
import org.springframework.stereotype.Component;

/**
 * Created by yab on 2017/7/6.
 */
@Component
public class BR6DaoImpl extends BaseDaoImpl<BR6> implements IBR6Dao {

    public BR6DaoImpl(){
        super(BR6.class);
    }

}