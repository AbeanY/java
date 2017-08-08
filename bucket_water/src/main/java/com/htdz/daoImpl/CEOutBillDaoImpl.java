package com.htdz.daoImpl;

import com.htdz.dao.ICEOutBillDao;
import com.htdz.model.CEOutBill;
import org.springframework.stereotype.Component;

/**
 * Created by yab on 2017/7/6.
 */
@Component
public class CEOutBillDaoImpl extends BaseDaoImpl<CEOutBill> implements ICEOutBillDao {

    public CEOutBillDaoImpl(){
        super(CEOutBill.class);
    }

}