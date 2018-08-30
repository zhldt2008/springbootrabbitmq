package com.test.unit5;

import com.test.unit5.config.RabbitConfig;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Date;


@Component
public class SendMessage {

    @Autowired
    private AmqpTemplate rabbitTemplate;

   /* public void send() {
        String sendMsg = "hello1 " + new Date();
        System.out.println("Sender1 : " + sendMsg);
        this.rabbitTemplate.convertAndSend("hello", sendMsg);
    }*/


   /* public void send() {
        String sendMsg = "hello, " + new Date();
        System.out.println("Sender : " + sendMsg);
        this.rabbitTemplate.convertAndSend(RabbitConfig.exchange,"topic.queue1", sendMsg);
    }*/

    public void send() {
        String sendMsg = "hello, " + new Date();
        System.out.println("Sender : " + sendMsg);
        this.rabbitTemplate.convertAndSend(RabbitConfig.exchange,"topic.queue1", sendMsg);
    }
}
