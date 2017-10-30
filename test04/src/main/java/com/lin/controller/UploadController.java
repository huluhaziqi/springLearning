package com.lin.controller;

import org.apache.commons.io.FileUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

import static org.springframework.web.bind.annotation.RequestMethod.POST;

@Controller
public class UploadController {

    @RequestMapping(value = "/upload",method = POST)
    public @ResponseBody String upload(MultipartFile file) {//1

        try {
            FileUtils.writeByteArrayToFile(new File("/Users/linxiaobin/IdeaProjects/"+file.getOriginalFilename()),
                    file.getBytes()); //2
            return "ok";
        } catch (IOException e) {
            e.printStackTrace();
            return "wrong";
        }


    }

}
