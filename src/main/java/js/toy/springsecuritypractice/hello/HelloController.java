package js.toy.springsecuritypractice.hello;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/api/v1/hello-world")
    public ResponseEntity<String> retrieveHelloWorld(String name) {
        return ResponseEntity.ok("HELLO " + name + " WORLD!");
    }
}
