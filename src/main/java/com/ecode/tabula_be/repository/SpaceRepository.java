package com.ecode.tabula_be.repository;

import com.ecode.tabula_be.entity.Space;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface SpaceRepository extends MongoRepository<Space, String> {
}
