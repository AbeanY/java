package com.htdz.daoImpl;

import com.htdz.dao.IRfBasicDao;
import com.htdz.model.RfBasic;
import org.springframework.stereotype.Component;

/**
 * Created by yab on 2017/7/6.
 */
@Component
public class RfBasicDaoImpl extends BaseDaoImpl<RfBasic> implements IRfBasicDao {

    public RfBasicDaoImpl(){
        super(RfBasic.class);
    }

}