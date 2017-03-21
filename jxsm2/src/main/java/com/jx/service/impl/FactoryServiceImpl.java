package com.jx.service.impl;

import com.jx.dao.FactoryDao;
import com.jx.domain.Factory;
import com.jx.service.FactoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Administrator on 2017/3/20.
 */
@Service
public class FactoryServiceImpl implements FactoryService {
    @Autowired
    FactoryDao factoryDao;
    public List<Factory> find(Factory factory) {
        return factoryDao.find(factory);
    }

    public Factory get(Serializable id) {
        return factoryDao.get(id);
    }

    public void insert(Factory factory) {
        factoryDao.insert(factory);
    }

    public void update(Factory factory) {
        factoryDao.update(factory);
    }

    public void delete(Factory factory) {

    }

    public void delete(Serializable[] ids) {

    }
}
