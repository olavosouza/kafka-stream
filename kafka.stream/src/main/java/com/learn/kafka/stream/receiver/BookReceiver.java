package com.learn.kafka.stream.receiver;

import com.learn.kafka.stream.dto.Book;
import com.learn.kafka.stream.messaging.MessageConsumer;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.messaging.Message;
import org.springframework.stereotype.Component;

import java.util.function.Consumer;

@RequiredArgsConstructor
@Component
public class BookReceiver implements MessageConsumer<Book> {

    @Override
    public void receive(final Message<Book> message) {
        System.out.println(message.getPayload());
    }

    @Bean
    public Consumer<Message<Book>> bookOrder() {
        return this::receive;
    }

}
