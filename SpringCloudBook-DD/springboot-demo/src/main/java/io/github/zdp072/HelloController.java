package io.github.zdp072;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * say hello
 *
 * @ClassName: HelloController
 * @Author: jim
 * @Date: 2019/6/15 下午11:00
 * @Version: V1.0
 */
@RestController
public class HelloController {

    @Value("${my.env}")
    private String envName;

    @RequestMapping("/sayHello")
    public String sayHello() {
        return "hello " + envName;
    }
}
