package com.yonglone.springhello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringHelloApplication {

    /**
     * main interface.
     *
     * @param args args
     */
    public static void main(String[] args) {
        SpringApplication.run(SpringHelloApplication.class, args);
    }

    /**
     * hello world.
     *
     * @return hello
     */
    @GetMapping("/hello")
    public ResponseEntity<String> hello() {
        return new ResponseEntity<>("hello world", HttpStatus.OK);
    }

}
