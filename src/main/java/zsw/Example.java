package zsw;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@EnableAutoConfiguration
@RequestMapping("zsw")
public class Example {
    @RequestMapping("/hello")
    String home() {
        return "Hello World!";
    }
    @RequestMapping("/hi/{name}")
    String hi(@PathVariable String name){
        return "hi ".concat(name);
    }

    public static void main(String[] args) throws Exception {
        SpringApplication.run(Example.class, args);
    }
}