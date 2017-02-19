
package com.norfan.websocket;

import org.springframework.context.annotation.Configuration;
import org.springframework.messaging.simp.config.MessageBrokerRegistry;
import org.springframework.web.socket.config.annotation.AbstractWebSocketMessageBrokerConfigurer;
import org.springframework.web.socket.config.annotation.EnableWebSocketMessageBroker;
import org.springframework.web.socket.config.annotation.StompEndpointRegistry;

@Configuration
@EnableWebSocketMessageBroker  //开启STOMP协议来传输基于代理的消息
public class WebSocketConfig extends AbstractWebSocketMessageBrokerConfigurer
{

    @Override
    public void registerStompEndpoints(StompEndpointRegistry register)
    {
        register.addEndpoint("/norfantalk").withSockJS();  //注册一个节点
        register.addEndpoint("/norfanchat").withSockJS();
    }

    @Override
    public void configureMessageBroker(MessageBrokerRegistry register)
    {
        register.enableSimpleBroker("/topic", "/queue");  //topic代理
    }

}
