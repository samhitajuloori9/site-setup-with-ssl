package org.example.vpnassignment;

import org.example.vpnassignment.model.UserRequest;
import org.example.vpnassignment.model.UserResponse;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class VpnAssignmentApplication {

    public static void main(String[] args) {

        SpringApplication.run(VpnAssignmentApplication.class, args);
    }
    @GetMapping("/")
    public String Welcome() {
        return "Welcome to Spring Boot application";
    }
    //@GetMapping("/api/hello")
    @PostMapping("/api/hello")
    public UserResponse hello(@RequestBody UserRequest name) {
        return new UserResponse(name.getUser());
    }
}
