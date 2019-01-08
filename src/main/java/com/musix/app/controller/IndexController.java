package com.musix.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

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

}