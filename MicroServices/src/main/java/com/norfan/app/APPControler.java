
package com.norfan.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@ComponentScan("com.norfan")
@Controller
public class APPControler
{

    @RequestMapping("/")
    public String index()
    {
        return "index";
    }

    /**
     * @description TODO
     * @author tanmj
     * @date 2016-12-25
     * @param args
     */
    public static void main(String[] args)
    {
        SpringApplication.run(APPControler.class, args);
    }

    @RequestMapping("/ws")
    public String topic()
    {
        return "topic";
    }

    @RequestMapping("/chat")
    public String talk(String username, String password)
    {
        System.out.println(username);
        return "chat";
    }

    @RequestMapping("/login")
    public String login()
    {
        return "login";
    }
}
