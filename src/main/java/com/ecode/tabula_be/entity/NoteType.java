package com.ecode.tabula_be.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Data
@Document("note_type")
@AllArgsConstructor
@NoArgsConstructor
public class NoteType {
    @Id
    private Long id;

    @DBRef
    private Space space;

    @DBRef
    private Type type;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;
}
