package com.learn.kafka.stream.messaging;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.messaging.Message;

public interface MessageConsumer<T> {

    void receive(Message<T> message) throws JsonProcessingException;

}
