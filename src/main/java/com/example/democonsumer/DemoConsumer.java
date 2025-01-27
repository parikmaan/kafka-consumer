package com.example.democonsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.EnableKafka;

@EnableKafka
@SpringBootApplication
public class DemoConsumer {
    public static void main(String[] args) {
        SpringApplication.run(DemoConsumer.class, args);
    }
}
