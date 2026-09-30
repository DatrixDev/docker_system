package datrixdev.hello_docker.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EnvironmentController {

    @Value("${app.message}")
    private String message;

    @GetMapping("/environment")
    public String environment() {
        return message;
    }
}