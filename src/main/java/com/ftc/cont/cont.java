package com.ftc.cont;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Zelalem Belay on 1/21/2017.
 */
@Controller
public class cont
{
    @RequestMapping("/getdata")
    public String gett()
    {
        return "This is a test Data from Rest Method.";
    }


    @RequestMapping(value = "/getperson", produces = "application/json")
    public @ResponseBody Person getp()
    {
        return new Person(4, "Zelalem", new Address(32904, "2265 Crippen",
                "Melbourne", "Florida"));
    }

    @RequestMapping("/getpersone")
    public @ResponseBody Person getp3()
    {
        return new Person(4, "Eyuel", new Address(32904, "2265 Crippen",
                "Melbourne", "Florida"));
    }

    @RequestMapping("/geta")
    public @ResponseBody Address geta()
    {
        return new Address(4564,"","","");
    }

    @RequestMapping("/getpersons")
    public @ResponseBody List<Person> getp2()
    {
        List<Person> ps = new ArrayList<>();
        ps.add(new Person(4, "Zelalem", new Address(32904, "2265 Crippen",
            "Melbourne", "Florida")));
        ps.add(new Person(88, "Eyuel", new Address(32904, "2265 Crippen",
            "Melbourne", "Florida")));

        return ps;
    }


}
