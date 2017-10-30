package com.lin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Random;

@Controller
public class SeeController {

    @RequestMapping(value = "/push",produces = "text/event-stream")
    @ResponseBody
    public String push(){
        Random random = new Random();

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return  "data:testing " + random.nextInt() + "\n\n";
    }
}
