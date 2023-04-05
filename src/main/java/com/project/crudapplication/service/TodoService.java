package com.project.crudapplication.service;

import java.util.List;

import com.project.crudapplication.exception.TodoCollectionException;
import com.project.crudapplication.model.TodoDTO;

import jakarta.validation.ConstraintViolationException;

public interface TodoService {

    public void createTodo(TodoDTO todo) throws ConstraintViolationException, TodoCollectionException;

    public List<TodoDTO> getAllTodos();
}
