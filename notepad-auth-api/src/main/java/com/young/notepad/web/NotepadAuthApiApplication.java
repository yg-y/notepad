package com.young.notepad.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@EnableDiscoveryClient
@SpringBootApplication
public class NotepadAuthApiApplication {

    @Autowired
    Controller controller;

    public static void main(String[] args) throws InterruptedException {
        SpringApplication.run(NotepadAuthApiApplication.class, args);
    }

    @GetMapping("/get")
    public String get(){
        return controller.getValue();
    }

}

@Component
@RefreshScope
class Controller {

    @Value("${auth.value}")
    String value;

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
