package com.jx.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2017/3/20.
 */
@Controller
public class HomeController {
    @RequestMapping(value = {"/","/home"})
    public String login(){
        return "index.jsp";
    }
    @RequestMapping(value = "/fmain")
    public String fmain(){
        return "/home/fmain.jsp";
    }
    @RequestMapping(value = "/title")
    public String title(){
        return "/home/title.jsp";
    }
    @RequestMapping(value = "/left")
    public String left(){
        return "/home/left.jsp";
    }
    @RequestMapping(value = "/main")
    public String main(){
        return "/home/olmsgList.jsp";
    }
    @RequestMapping(value = "/baseinfoLeft")
    public String baseinfoLeft(){
        return "/baseinfo/left.jsp";
    }
    @RequestMapping("/cargoMain")
    public String cargoMain(){
        return "/cargo/main.jsp";
    }

    @RequestMapping("/cargoLeft")
    public String cargoLeft(){
        return "/cargo/left.jsp";
    }
}
