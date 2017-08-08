package com.htdz.daoImpl;

import com.htdz.dao.IBLifeDao;
import com.htdz.model.BLife;
import org.springframework.stereotype.Component;

/**
 * Created by yab on 2017/7/6.
 */
@Component
public class BLifeDaoImpl extends BaseDaoImpl<BLife> implements IBLifeDao {

    public BLifeDaoImpl(){
        super(BLife.class);
    }

}