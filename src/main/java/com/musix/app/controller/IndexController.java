package com.musix.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
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

    @RequestMapping(value = "/audio", method = RequestMethod.GET)
    public void getAudio(HttpServletResponse response){
        System.out.println("--playFile");
        File file = new File("C:\\Users\\Andrii_Vlasiuk\\Documents\\Andrii Vlasiuk\\musix\\src\\main\\resources\\mp3\\viber_message.mp3");
        FileInputStream fis;
        byte[] buffer=null;
        try {
            fis = new FileInputStream(file);
            buffer= new byte[fis.available()];
            fis.read(buffer);
            fis.close();
        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        try{
            response.getOutputStream().write(buffer);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}