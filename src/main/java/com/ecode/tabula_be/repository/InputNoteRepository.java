package com.ecode.tabula_be.repository;
import com.ecode.tabula_be.entity.Folder;
import com.ecode.tabula_be.entity.InputNote;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface InputNoteRepository extends MongoRepository<InputNote, String> {
}

