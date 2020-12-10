package com.young.notepad.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class NotepadGetawayApplication {

    public static void main(String[] args) {
        SpringApplication.run(NotepadGetawayApplication.class, args);
    }

}
