package com.learn.kafka.stream.sender;

import com.learn.kafka.stream.dto.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.function.StreamBridge;
import org.springframework.stereotype.Component;

@Component
public class BookSender {

    @Autowired
    private StreamBridge streamBridge;

    public void sendMessage() {
        streamBridge.send("bookOrder-out-0", createBook());
    }

    private Book createBook() {
        return new Book("Dom casmurro", "Machado de Assis", 80);
    }

}
