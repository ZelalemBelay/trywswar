package com.ftc.cont;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Zelalem Belay on 1/21/2017.
 */
@Controller
public class HomeC
{


    @RequestMapping("/")
    public String home1()
    {
        return "redirect:/home";
    }


    @RequestMapping("/home")
    public String home()
    {
        return "home";
    }
}
