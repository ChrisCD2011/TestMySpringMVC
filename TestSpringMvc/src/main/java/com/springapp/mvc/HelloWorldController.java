package com.springapp.mvc;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by Chris on 2016/2/21.
 */
@Controller
@RequestMapping("HelloWorld")
public class HelloWorldController {
    @RequestMapping(value = "getHello",method = RequestMethod.GET)
    public String getHello(ModelMap model){
        model.addAttribute("display","Hello World");
        return "helloWorld";
    }
}
