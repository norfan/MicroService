
package com.norfan.websocket;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;

@Controller
public class WSController
{

    @Autowired
    private SimpMessagingTemplate messageTemplate;

    @MessageMapping("/welcome")
    @SendTo("/topic/response")
    public String sendMessage(String name, String message)
    {
        return "Welcome " + name + "!";
    }

    @MessageMapping("/send")
    public void handlerChat(Principal p, String reciver, String msg)
    {
        String curName = p.getName();
        messageTemplate.convertAndSendToUser(reciver, "/queue/notify", curName + " Say:" + msg);
    }

    
}
