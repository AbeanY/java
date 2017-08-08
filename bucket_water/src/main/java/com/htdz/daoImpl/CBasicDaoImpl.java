package com.htdz.daoImpl;

import com.htdz.dao.ICBasicDao;
import com.htdz.model.CBasic;
import org.springframework.stereotype.Component;

/**
 * Created by yab on 2017/7/6.
 */
@Component
public class CBasicDaoImpl extends BaseDaoImpl<CBasic> implements ICBasicDao {

    public CBasicDaoImpl(){
        super(CBasic.class);
    }

}