package com.test.unit5;

import com.test.unit5.config.RabbitConfig;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
@RabbitListener( queues = RabbitConfig.topicQueue2)
public class ReceiverMessage2 {
    @RabbitHandler
    public void process(String hello) {
        System.out.println("topicQueue2 receiver  : " + hello);
    }
}
