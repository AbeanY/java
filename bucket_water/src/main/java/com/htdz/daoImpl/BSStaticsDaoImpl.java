package com.htdz.daoImpl;

import com.htdz.dao.IBSStaticsDao;
import com.htdz.model.BSStatics;
import org.springframework.stereotype.Component;

/**
 * Created by yab on 2017/7/6.
 */
@Component
public class BSStaticsDaoImpl extends BaseDaoImpl<BSStatics> implements IBSStaticsDao {

    public BSStaticsDaoImpl(){
        super(BSStatics.class);
    }

}