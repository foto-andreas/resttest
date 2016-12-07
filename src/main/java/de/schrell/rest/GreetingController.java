package de.schrell.rest;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/greeting/{name}")
    public Greeting greeting(@PathVariable final String name) throws InterruptedException {
        Thread.sleep(10000);
        return new Greeting(this.counter.incrementAndGet(),
            String.format(template, name));
    }
}
