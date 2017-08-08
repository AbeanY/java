package com.htdz.util;

import org.hibernate.FlushMode;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.dao.DataAccessResourceFailureException;
import org.springframework.orm.hibernate3.SessionFactoryUtils;
import org.springframework.orm.hibernate3.support.OpenSessionInViewFilter;

/**
 * Created by yab on 2017/7/10.
 */
public class OpenSessionInViewFilterImpl extends OpenSessionInViewFilter {


    protected void closeSession(Session session, SessionFactory sessionFactory) {
        session.flush();
        SessionFactoryUtils.closeSession(session);
    }

    protected Session getSession(SessionFactory sessionFactory)
            throws DataAccessResourceFailureException {
        Session session = SessionFactoryUtils.getSession(sessionFactory, true);
        setFlushMode(FlushMode.AUTO);
        FlushMode flushMode = getFlushMode();
        if (flushMode != null) {
            session.setFlushMode(flushMode);
        }
        return session;

    }

}