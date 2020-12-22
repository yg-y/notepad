package com.young.notepad.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@EnableDiscoveryClient
@SpringBootApplication
public class NotepadAuthApiApplication {


    public static void main(String[] args) throws InterruptedException {
        SpringApplication.run(NotepadAuthApiApplication.class, args);
    }
}
