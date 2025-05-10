package com.ecode.tabula_be.repository;

import com.ecode.tabula_be.entity.Folder;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface NoteType extends MongoRepository<NoteType, String> {
}