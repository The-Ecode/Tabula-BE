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
@Document("type")
@AllArgsConstructor
@NoArgsConstructor
public class Type {

    @Id
    private String id;

    private String langType;

    private String formType;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;
}
