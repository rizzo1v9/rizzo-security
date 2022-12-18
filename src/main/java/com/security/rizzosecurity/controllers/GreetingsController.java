package com.security.rizzosecurity.controllers;

import org.apache.coyote.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // Annotation to allow this class to be a controller and handle REST API requests
@RequestMapping("/api/v1/greetings")
public class GreetingsController {

    // This method is of type ResponseEntity which represents the whole HTTP repsonse including
    // status code, headers and body.
    // @GetMapping is used to allow the method to be used as an HTTP GET request.
    @GetMapping
    public ResponseEntity<String> sayHello() {
        return ResponseEntity.ok("Api worked!");
    }

    @GetMapping("/bye")
    public ResponseEntity<String> sayGoodbye() {
        return ResponseEntity.ok("Bye!");
    }
}
