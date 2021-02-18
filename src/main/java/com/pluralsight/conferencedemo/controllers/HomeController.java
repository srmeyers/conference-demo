package com.pluralsight.conferencedemo.controllers;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    @Value("${app.version}")
    private String appVersion;

    @GetMapping("/")
    public String getHome(Model model) {
        model.addAttribute("appVersion", appVersion);
        System.out.println(model.toString());

        return "index";
    }
//    public Map getStatus() {
//        Map map = new HashMap<String, String>();
//        map.put("app-version", appVersion);
//        return map;
//    }
}
