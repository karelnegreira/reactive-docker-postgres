package com.example.reactivepostgresdocker2.controller;

import com.example.reactivepostgresdocker2.model.Estudiantes;
import com.example.reactivepostgresdocker2.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
public class StudentController {

    private StudentService service;

    @Autowired
    public StudentController(StudentService service1) {
        this.service = service1;
    }

    @GetMapping("/estudiantes/all")
    public Flux<Estudiantes> findAll() {
        return service.findAll();
    }

    @GetMapping("/estudiantes/{id}")
    public Mono<Estudiantes> findOneById(@PathVariable("id") Integer id) {
        return service.findById(id);
    }
   /*
    @PostMapping("/estudiantes/save")
    public Mono<Estudiantes> save(@RequestBody Estudiantes student) {
        return service.save(student);
    }

    @DeleteMapping("/estudiantes/delete/{id}")
    public Mono<Void> delete(@PathVariable("id") Integer id) {
        return service.deleteById(id);
    }*/
}
