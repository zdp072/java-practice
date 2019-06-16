package io.github.zdp072;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * 消费控制器
 *
 * @ClassName: ConsumerController
 * @Author: zdp072
 * @Date: 2019/6/16 下午3:07
 * @Version: V1.0
 */
@RestController
public class ConsumerController {
    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping(value = "/ribbon-consumer", method = RequestMethod.GET)
    public String helloConsumer() {
        return restTemplate.getForEntity("http://springboot-demo-service/sayHello", String.class).getBody();
    }
}
