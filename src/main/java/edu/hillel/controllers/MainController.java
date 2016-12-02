package edu.hillel.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by HillelNew8 on 02.12.2016.
 */
@Controller
@RequestMapping(value = "/")
public class MainController{

    @RequestMapping(method = RequestMethod.GET)
    public String process(Model model){
        return "index";
    }
}
