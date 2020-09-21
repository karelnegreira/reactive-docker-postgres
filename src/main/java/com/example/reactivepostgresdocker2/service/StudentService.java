package com.example.reactivepostgresdocker2.service;

import com.example.reactivepostgresdocker2.model.Estudiantes;
import com.example.reactivepostgresdocker2.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
public class StudentService {
    private StudentRepository repository;

    @Autowired
    public StudentService(StudentRepository repository1) {
        this.repository = repository1;
    }

    public Flux<Estudiantes> findAll() {
        return repository.findAll();
    }

    public Mono<Estudiantes> findById(Integer id) {
        return repository.findById(id);
    }
}
