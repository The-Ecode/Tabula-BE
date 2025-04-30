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
@Document("folder")
@AllArgsConstructor
@NoArgsConstructor
public class Folder {
    @Id
    private String id;

    private User user;

    private String folderName;

    private LocalDateTime createdAt;

    private LocalDateTime updatedAt;

}
