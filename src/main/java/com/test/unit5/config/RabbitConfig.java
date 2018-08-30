package com.test.unit5.config;


import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitConfig {

  public  final static String topicQueue1 = "topic.queue1";
  public  final static String topicQueue2 = "topic.queue2";
  public  final static  String exchange = "exchange";

    @Bean
    public Queue helloQueue() {
        return new Queue("hello");
    }


    @Bean
    public Queue topQueue() {
        return new Queue(topicQueue1);
    }

    @Bean
    public Queue topQueue2() {
        return new Queue(topicQueue2);
    }

    @Bean
    public TopicExchange exchange(){
        return new TopicExchange(exchange);
    }

    @Bean
    Binding bindingExchangeMessage(Queue topQueue, TopicExchange exchange) {
        return  BindingBuilder.bind(topQueue).to(exchange).with("topic.queue1");
    }


   @Bean
    Binding bindingExchangeMessages(Queue topQueue2, TopicExchange exchange) {
        return BindingBuilder.bind(topQueue2).to(exchange).with("topic.#");
    }

}
