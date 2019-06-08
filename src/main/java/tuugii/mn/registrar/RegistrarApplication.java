package tuugii.mn.registrar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan("tuugii.mn.registrar")
public class RegistrarApplication {

    public static void main(String[] args) {
        SpringApplication.run(RegistrarApplication.class, args);
    }

}
