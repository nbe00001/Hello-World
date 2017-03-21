package com.jx.service;

import com.jx.domain.Factory;

import java.io.Serializable;
import java.util.List;

/**
 * Created by Administrator on 2017/3/20.
 */
public interface FactoryService {
    public List<Factory> find(Factory factory);
    public Factory get(Serializable id);
    public void insert(Factory factory);
    public void update(Factory factory);
    public void delete(Factory factory);
    public void delete(Serializable[] ids);
}
