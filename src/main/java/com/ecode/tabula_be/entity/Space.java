package com.ecode.tabula_be.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.time.LocalDateTime;

@Data
@Document("space")
@AllArgsConstructor
@NoArgsConstructor
public class Space {

    @Id
    private String id;

    private String folderId;

    private String inputNoteId;

    private String spaceName;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;

}
