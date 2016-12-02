package edu.hillel.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.request.WebRequest;
import org.springframework.webflow.engine.model.Model;

/**
 * Created by HillelNew8 on 02.12.2016.
 */
@Controller
@RequestMapping(value = "/login")
public class LoginController {

    @RequestMapping(method = RequestMethod.POST)
    public String doLogin(WebRequest request,ModelMap model){

        String user_login = request.getParameter("name");

        model.addAttribute("user", user_login);
        return "login";
    }
}
