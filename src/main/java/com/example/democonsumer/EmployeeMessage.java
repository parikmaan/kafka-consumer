package com.example.democonsumer;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class EmployeeMessage {
    @Id
    private long id;
    private String message;

    public EmployeeMessage(long id, String message) {
        this.id = id;
        this.message = message;
    }
}
