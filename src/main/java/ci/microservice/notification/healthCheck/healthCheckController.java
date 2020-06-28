package ci.microservice.notification.healthCheck;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class healthCheckController {
    @GetMapping("/")
    public String getMessage() {
        return "The notification service is up and running";
    }

    @GetMapping("/health")
    public ResponseEntity<String> healthCheck() {
        String message = "told consul that we are healthy";
        System.out.println(message);
        return new ResponseEntity<>(message, HttpStatus.OK);
    }
}
