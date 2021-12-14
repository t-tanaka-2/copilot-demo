package ecs.copilot.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthApiController {
    @GetMapping("/health")
    public String health() {
        return "OK";
    }
}
