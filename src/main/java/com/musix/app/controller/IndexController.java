package com.musix.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.util.Map;

@Controller
public class IndexController {

    @RequestMapping("/")
    public String home(Map<String, Object> model) {
        model.put("message", "root");
        return "index";
    }

    @RequestMapping("/play")
    public String next(Map<String, Object> model) {
        model.put("message", "PLAY PAGE");
        return "play";
    }

    @RequestMapping(value = "/audio",
            method = RequestMethod.GET)
    public void getAudio(@RequestParam("id") String id,
                         HttpServletResponse response){
        String classPath = System.getProperty("user.dir");
        File file  = new File(classPath + "\\src\\main\\resources\\mp3\\" + id + ".mp3");
        FileInputStream fis;
        byte[] buffer=null;
        try {
            fis = new FileInputStream(file);
            buffer= new byte[fis.available()];
            fis.read(buffer);
            fis.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        try{
            response.getOutputStream().write(buffer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}