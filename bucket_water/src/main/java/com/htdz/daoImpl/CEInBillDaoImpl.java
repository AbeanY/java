package com.htdz.daoImpl;

import com.htdz.dao.ICEInBillDao;
import com.htdz.model.CEInBill;
import org.springframework.stereotype.Component;

/**
 * Created by yab on 2017/7/6.
 */
@Component
public class CEInBillDaoImpl extends BaseDaoImpl<CEInBill> implements ICEInBillDao {

    public CEInBillDaoImpl(){
        super(CEInBill.class);
    }

}