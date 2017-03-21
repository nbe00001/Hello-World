package com.jx.dao.impl;

import com.jx.dao.FactoryDao;
import com.jx.domain.Factory;
import org.springframework.stereotype.Repository;

@Repository
public class FactoryDaoImpl extends BaseDaoImpl<Factory> implements FactoryDao{
    public FactoryDaoImpl(){
        this.setNs("com.jx.mapper.FactoryMapper.");
    }

}
