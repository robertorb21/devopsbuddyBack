package com.devopsbuddy.web.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Robert Rodriguez on 6/26/2017.
 */
@Controller
public class IndexController {

    @RequestMapping("/")
    public String home() {
        return "index"; // "index" is a String view name. Since we're using Thymeleaf , Spring "appends" .html to the view name and looks for a file index.html under src/main/resources/templates
    }
}
