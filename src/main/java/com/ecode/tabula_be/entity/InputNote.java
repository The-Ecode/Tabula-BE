package com.ecode.tabula_be.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document("input_note")
@AllArgsConstructor
@NoArgsConstructor
public class InputNote {

    @Id
    private Long id;

    @DBRef
    private Space space;

    private String file; //pdf url
}
