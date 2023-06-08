package com.example.springbootwithreact;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@SpringBootApplication
@EnableWebMvc
public class SpringBootWithReactApplication {

    public static void main(String[] args) {
        new SpringApplicationBuilder(SpringBootApplication.class)
            .properties("spring.config.location=classpath:application.yml")
            .run(args);
    }
}
