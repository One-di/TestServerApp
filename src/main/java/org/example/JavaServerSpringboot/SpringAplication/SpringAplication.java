package org.example.JavaServerSpringboot.SpringAplication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan("org.example")
@SpringBootApplication
public class SpringAplication {
    public static void main(String[] args) {
        SpringApplication.run(SpringAplication.class, args);
    }
}
