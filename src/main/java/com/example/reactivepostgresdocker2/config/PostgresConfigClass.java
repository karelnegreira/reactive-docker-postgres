package com.example.reactivepostgresdocker2.config;

import com.example.reactivepostgresdocker2.service.StudentService;
import io.r2dbc.postgresql.PostgresqlConnectionConfiguration;
import io.r2dbc.postgresql.PostgresqlConnectionFactory;
import io.r2dbc.spi.ConnectionFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.data.r2dbc.config.AbstractR2dbcConfiguration;
import org.springframework.data.r2dbc.repository.config.EnableR2dbcRepositories;


@Configuration
@EnableR2dbcRepositories("com.example.reactivepostgresdocker2.repository")
public class PostgresConfigClass extends AbstractR2dbcConfiguration {

    /*
    @Bean
    @Primary
    public StudentService beanStudentService() {
        StudentService studentService = new StudentService();
        return studentService;
    }*/


    @Bean
    public ConnectionFactory connectionFactory() {
        PostgresqlConnectionConfiguration config = PostgresqlConnectionConfiguration.builder()
                .host("dbpostgresql")
                .port(5432)
                .database("mydb3")
                .username("postgres")
                .password("admin")
                .build();
        return new PostgresqlConnectionFactory(config);
    }
}
