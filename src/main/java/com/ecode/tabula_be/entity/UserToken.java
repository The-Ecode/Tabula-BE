package com.ecode.tabula_be.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Data
@Document("user_token")
@AllArgsConstructor
@NoArgsConstructor
public class UserToken {

    @Id
    private Long id;

    @DBRef
    private List<User> user;

    private String refreshToken;
}
