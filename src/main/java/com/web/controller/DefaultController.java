package com.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DefaultController {

    @RequestMapping("/home")
    public String index() throws Exception {

        return "index.html";
    }

    @RequestMapping("/greeting")
    public String greeting() throws Exception {

        return "pages/greeting.html";
    }

}
