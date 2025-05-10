package com.ecode.tabula_be.repository;

import com.ecode.tabula_be.entity.Type;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface TypeRepository extends MongoRepository<Type, String> {
}
