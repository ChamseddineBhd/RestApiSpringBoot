package hello;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    private final AtomicLong counter = new AtomicLong();

    public static final String API_VERSION = "v1";

    @RequestMapping("/greetingEN")
    public Greeting greetingEN(@RequestParam(value="name", defaultValue="World") String name) {
        return new Greeting(counter.incrementAndGet(),
                String.format("Hello, %s!", name));
    }

    @RequestMapping("/greetingFR")
    public Greeting greetingFR(@RequestParam(value="name", defaultValue="World") String name) {
        return new Greeting(counter.incrementAndGet(),
                String.format("Bonjour, %s!", name));
    }
}