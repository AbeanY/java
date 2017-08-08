package com.htdz.daoImpl;

import com.htdz.dao.IBR11Dao;
import com.htdz.model.BR11;
import org.springframework.stereotype.Component;

/**
 * Created by yab on 2017/7/6.
 */
@Component
public class BR11DaoImpl extends BaseDaoImpl<BR11> implements IBR11Dao {

    public BR11DaoImpl(){
        super(BR11.class);
    }

}