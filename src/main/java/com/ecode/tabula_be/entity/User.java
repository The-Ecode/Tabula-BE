package com.ecode.tabula_be.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;
import java.util.List;

@Data
@Document("user")
@AllArgsConstructor
@NoArgsConstructor
public class User {
    @Id
    private Long id;

    private String userName;

    private Provider provider;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;
}

enum Provider {
    KAKAO, GOOGLE
}