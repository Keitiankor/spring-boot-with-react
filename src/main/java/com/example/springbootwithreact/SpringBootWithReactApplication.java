package com.example.springbootwithreact;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class SpringBootWithReactApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(SpringBootWithReactApplication.class)
            .properties("spring.config.location=classpath:application.yml")
            .run(args);
    }
}
