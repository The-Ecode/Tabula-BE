package com.ecode.tabula_be.repository;

import com.ecode.tabula_be.entity.UserToken;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserTokenRepository extends MongoRepository<UserToken, String> {
}
