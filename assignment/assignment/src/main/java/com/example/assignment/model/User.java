package com.example.assignment.model;

import lombok.Data;
import lombok.Generated;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data

@Document(collection = "users")
public class User {
    @Id
    private String id;
    private String username;
    private String password;
    private String role="USER";
}
