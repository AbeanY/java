package com.htdz.daoImpl;

import com.htdz.dao.IBR3Dao;
import com.htdz.model.BR3;
import org.springframework.stereotype.Component;

/**
 * Created by yab on 2017/7/6.
 */
@Component
public class BR3DaoImpl extends BaseDaoImpl<BR3> implements IBR3Dao {

    public BR3DaoImpl(){
        super(BR3.class);
    }

}