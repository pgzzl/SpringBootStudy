package com.example.demopracticeproject;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.demopracticeproject.mapper")
public class DemoPracticeProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoPracticeProjectApplication.class, args);
    }

}
