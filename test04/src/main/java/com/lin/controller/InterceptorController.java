package com.lin.controller;


import com.lin.annoimation.DemoAnno;
import com.lin.annoimation.LoginAnno;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
public class InterceptorController {

    @RequestMapping("/interceptor")
    @ResponseBody
    @DemoAnno
    public String getUrl(HttpServletRequest request){
        return request.getRequestURI();
    }

    @RequestMapping("/login/cookie")
    @ResponseBody
    @LoginAnno
    public String getUrl(HttpServletRequest request,String abc){
        return request.getRequestURI();
    }
}
