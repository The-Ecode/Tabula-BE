package com.ecode.tabula_be.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Data
@Document("result")
@AllArgsConstructor
@NoArgsConstructor
public class Result {
    @Id
    private Long id;

    @DBRef
    private Space space;

    private String file;

    private String feedback;

    private LocalDateTime createdAt;
}
