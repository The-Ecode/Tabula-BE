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
@Document("space")
@AllArgsConstructor
@NoArgsConstructor
public class Space {

    @Id
    private Long id;

    @DBRef
    private Folder folder;

    @DBRef
    private List<NoteType> noteType;

    @DBRef
    private List<Result> result;

    @DBRef
    private InputNote inputNote;

    private String spaceName;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;

}
