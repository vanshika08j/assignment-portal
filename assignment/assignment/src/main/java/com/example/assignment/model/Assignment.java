package com.example.assignment.model;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Data
@Document(collection = "assignments")
public class Assignment {
    @Id
    private String id;
    private String userId;
    private String task;
    private String admin;
    private String status = "PENDING"; // Can be PENDING, ACCEPTED, REJECTED
    private LocalDateTime timestamp = LocalDateTime.now();

}
