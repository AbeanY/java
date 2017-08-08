package com.htdz.daoImpl;

import com.htdz.dao.IBBasicDao;
import com.htdz.model.BBasic;
import org.springframework.stereotype.Component;

/**
 * Created by yab on 2017/7/6.
 */
@Component
public class BBasicDaoImpl extends BaseDaoImpl<BBasic> implements IBBasicDao {

    public BBasicDaoImpl(){
        super(BBasic.class);
    }

}