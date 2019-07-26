package io.github.zdp072.swagger;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Hello world!
 */
@EnableAutoConfiguration
@SpringBootApplication(scanBasePackages = "io.github.zdp072.swagger")
public class SwaggerApplication {

    /**
     * http://localhost:8080/swagger-ui.html
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        SpringApplication.run(SwaggerApplication.class, args);
    }
	
}
