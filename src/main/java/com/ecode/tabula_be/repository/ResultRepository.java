package com.ecode.tabula_be.repository;

import com.ecode.tabula_be.entity.Result;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ResultRepository extends MongoRepository<Result, String> {
}
