package com.example.reactivepostgresdocker2.repository;

import com.example.reactivepostgresdocker2.model.Estudiantes;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends ReactiveCrudRepository<Estudiantes, Integer> {
}
