package com.example.reactivepostgresdocker2.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Table("estudiantes")
public class Estudiantes {
    @Id
    private Integer id;
    private String firstname;
    private String lastname;
}
