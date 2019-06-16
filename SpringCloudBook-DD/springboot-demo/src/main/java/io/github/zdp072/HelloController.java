package io.github.zdp072;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * say hello
 */
@RestController
public class HelloController {

    private final Logger logger = Logger.getLogger(getClass());

    @Value("${my.env}")
    private String envName;

    @Autowired
    private DiscoveryClient client;

    @RequestMapping("/sayHello")
    public String sayHello() {
        ServiceInstance instance = client.getLocalServiceInstance();
        logger.info("host: " + instance.getHost()
                + ", service_id: " + instance.getServiceId());
        return "hello " + envName;
    }
}
