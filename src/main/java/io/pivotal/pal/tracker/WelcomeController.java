package io.pivotal.pal.tracker;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WelcomeController {

    public String myhello;

    public WelcomeController(@Value("${welcome.message}") String welcome) {
        myhello = welcome;
    }

    @GetMapping("/")
    public String sayHello() {
        return myhello;
    }
}
