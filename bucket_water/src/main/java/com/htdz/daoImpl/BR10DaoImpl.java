package com.htdz.daoImpl;

import com.htdz.dao.IBR10Dao;
import com.htdz.model.BR10;
import org.springframework.stereotype.Component;

/**
 * Created by yab on 2017/7/6.
 */
@Component
public class BR10DaoImpl extends BaseDaoImpl<BR10> implements IBR10Dao {

    public BR10DaoImpl(){
        super(BR10.class);
    }

}