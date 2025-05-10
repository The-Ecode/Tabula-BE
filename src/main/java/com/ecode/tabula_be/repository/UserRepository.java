package com.ecode.tabula_be.repository;

import com.ecode.tabula_be.entity.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User,String> {
}
