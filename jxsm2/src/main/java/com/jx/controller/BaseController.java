package com.jx.controller;

import org.springframework.jdbc.datasource.SimpleDriverDataSource;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;

import java.text.SimpleDateFormat;
import java.text.DateFormat;


/**
 * Created by Administrator on 2017/3/20.
 */
public abstract class BaseController {
    @InitBinder
    public void initBinder(WebDataBinder webDataBinder){
        DateFormat dataFormat = new SimpleDateFormat("yyyy-MM-dd");
    }
}
