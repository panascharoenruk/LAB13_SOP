package com.example.bookstoreservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@SpringBootApplication
public class BookstoreServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(BookstoreServiceApplication.class, args);
    }

    @RequestMapping("/recommended")
    public String toRead() {
        return "H book";
        }
    }
