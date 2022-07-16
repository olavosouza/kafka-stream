package com.learn.kafka.stream.controller;

import com.learn.kafka.stream.sender.BookSender;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/books")
public class BookController {

    private final BookSender bookSender;

    @GetMapping
    public void test() {
        bookSender.sendMessage();
    }

}
