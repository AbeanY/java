package com.htdz.daoImpl;

import com.htdz.dao.IBStatusDao;
import com.htdz.model.BStatus;
import org.springframework.stereotype.Component;

/**
 * Created by yab on 2017/7/6.
 */
@Component
public class BStatusDaoImpl extends BaseDaoImpl<BStatus> implements IBStatusDao {

    public BStatusDaoImpl(){
        super(BStatus.class);
    }

}