package com.htdz.daoImpl;

import com.htdz.dao.ICElectronicDao;
import com.htdz.model.CElectronic;
import org.springframework.stereotype.Component;

/**
 * Created by yab on 2017/7/6.
 */
@Component
public class CElectronicDaoImpl extends BaseDaoImpl<CElectronic> implements ICElectronicDao {

    public CElectronicDaoImpl(){
        super(CElectronic.class);
    }

}