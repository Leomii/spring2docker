package com.leomii.s2d;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;


@SpringBootApplication
@EnableSwagger2
/**
 *
 * http://172.17.89.36:8081/spring2doker/
 *
 * http://172.17.89.36:8081/spring2doker/swagger-ui.html
 *
 * */
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class);
    }
}