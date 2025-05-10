package com.ecode.tabula_be.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document("user_token")
@AllArgsConstructor
@NoArgsConstructor
public class UserToken {

    @Id
    private String id;

    private String userId;

    private boolean isGuest=false;

    private String refreshToken;
}
