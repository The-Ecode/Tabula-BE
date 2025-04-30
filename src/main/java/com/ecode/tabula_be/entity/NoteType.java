package com.ecode.tabula_be.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Data
@Document("note_type")
@AllArgsConstructor
@NoArgsConstructor
public class NoteType {
    @Id
    private String id;

    private String spaceId;

    private String typeId;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;
}
