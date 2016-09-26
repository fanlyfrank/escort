package com.dazzle.escort.web;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author trgoofi
 */

@Controller
public class HomeController {


    @RequestMapping(value = "/", method = RequestMethod.GET)
    public @ResponseBody String home() {
        return "You are home.";
    }

}
