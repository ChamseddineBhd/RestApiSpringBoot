package hello;

import java.util.concurrent.atomic.AtomicLong;

import io.swagger.annotations.Api;
import models.Greeting;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Chamseddine Benhamed <chamseddine.benhamed at ensi-uma.tn>
 */

@RestController()
@RequestMapping(value = "/template/rest/api/" + GreetingController.API_VERSION)
@Api(value = "/template/rest/api", tags = "spring boot template rest api")
@ComponentScan(basePackageClasses = {Application.class})
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
