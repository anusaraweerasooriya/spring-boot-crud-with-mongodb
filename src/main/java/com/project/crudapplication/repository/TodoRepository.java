package com.project.crudapplication.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.project.crudapplication.model.TodoDTO;

@Repository
public interface TodoRepository extends MongoRepository<TodoDTO, String> {

}
