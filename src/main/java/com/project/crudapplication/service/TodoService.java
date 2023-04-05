package com.project.crudapplication.service;

import java.util.List;

import com.project.crudapplication.exception.TodoCollectionException;
import com.project.crudapplication.model.TodoDTO;

import jakarta.validation.ConstraintViolationException;

public interface TodoService {

    public void createTodo(TodoDTO todo) throws ConstraintViolationException, TodoCollectionException;

    public List<TodoDTO> getAllTodos();

    public TodoDTO getSingleTodo(String id) throws TodoCollectionException;

    public void updateTodo(String id, TodoDTO todo) throws TodoCollectionException;

}
