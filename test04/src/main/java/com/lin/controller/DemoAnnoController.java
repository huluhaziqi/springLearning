package com.lin.controller;

import com.lin.model.DemoObj;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/anno")
public class DemoAnnoController {

    @RequestMapping(produces = "application/xml;charset=UTF-8")
    @ResponseBody
    public DemoObj getUrl(HttpServletRequest request){
        return new DemoObj("a",1L);
    }

    @RequestMapping(value = "/json", produces = "application/json;charset=UTF-8")
    @ResponseBody
    public DemoObj getUrlJason(HttpServletRequest request){
        return new DemoObj("b",1L);
    }
}
