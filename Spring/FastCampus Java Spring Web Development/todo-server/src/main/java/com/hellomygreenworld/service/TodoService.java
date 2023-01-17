package com.hellomygreenworld.service;

import com.hellomygreenworld.model.TodoEntity;
import com.hellomygreenworld.model.TodoRequest;
import com.hellomygreenworld.repository.TodoRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class TodoService {
    
    private final TodoRepository todoRepository;

    public TodoEntity add(TodoRequest request) {
        TodoEntity todoEntity = new TodoEntity();
        todoEntity.setTitle(request.getTitle());
        todoEntity.setOrder(request.getOrder());
        todoEntity.setCompleted(request.getCompleted());

        return this.todoRepository.save(todoEntity);
    }

    public TodoEntity searchById(Long id) {
        this.todoRepository.findById(id);
        return null;
    }

    public List<TodoEntity> searchAll() {
        return null;
    }

    public TodoEntity updateById(Long id) {
        return null;
    }

    public void deleteById(Long id) {

    }

    public void deleteAll() {

    }
    
}
