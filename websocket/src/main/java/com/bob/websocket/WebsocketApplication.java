package com.bob.websocket;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * 推送消息
 *
 * @author FLY
 * @date 2020-04-30 11:21
 */
@EnableEurekaClient
@SpringBootApplication(scanBasePackages = {"com.bob.websocket"})
public class WebsocketApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebsocketApplication.class, args);
    }
}
