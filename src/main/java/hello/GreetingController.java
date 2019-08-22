package hello;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Chamseddine Benhamed <chamseddine.benhamed at ensi-uma.tn>
 */

@RestController(value = "/template/rest/api/" + GreetingController.API_VERSION)
public class GreetingController {

    private final AtomicLong counter = new AtomicLong();

    public static final String API_VERSION = "v1";

    @GetMapping("/greetingEN")
    public Greeting greetingEN(@RequestParam(value = "name", defaultValue = "World") String name) {
        return new Greeting(counter.incrementAndGet(),
                String.format("Hello, %s!", name));
    }

    @GetMapping("/greetingFR")
    public Greeting greetingFR(@RequestParam(value = "name", defaultValue = "tout le monde") String name) {
        return new Greeting(counter.incrementAndGet(),
                String.format("Bonjour, %s!", name));
    }
}
