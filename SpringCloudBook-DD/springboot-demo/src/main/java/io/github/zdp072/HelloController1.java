package io.github.zdp072;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

/**
 * say hello
 */
@RestController
public class HelloController1 {

    private final Logger logger = Logger.getLogger(getClass());

    @Autowired
    private DiscoveryClient client;

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello() throws Exception {
        ServiceInstance instance = client.getLocalServiceInstance();
        logger.info("/hello, host:" + instance.getHost() + ", service_id:" + instance.getServiceId());
        return "Hello World";
    }

    @RequestMapping(value = "/hello1", method = RequestMethod.GET)
    public String hello1(@RequestParam String name) {
        ServiceInstance instance = client.getLocalServiceInstance();
        logger.info("/hello1, host:" + instance.getHost() + ", service_id:" + instance.getServiceId());
        return "Hello " + name;
    }

    @RequestMapping(value = "/hello2", method = RequestMethod.GET)
    public User hello2(@RequestHeader String name, @RequestHeader Integer age) {
        ServiceInstance instance = client.getLocalServiceInstance();
        logger.info("/hello2, host:" + instance.getHost() + ", service_id:" + instance.getServiceId());
        return new User(name, age);
    }

    @RequestMapping(value = "/hello3", method = RequestMethod.POST)
    public String hello3(@RequestBody User user) {
        ServiceInstance instance = client.getLocalServiceInstance();
        logger.info("/hello3, host:" + instance.getHost() + ", service_id:" + instance.getServiceId());
        return "Hello " + user.getName() + ", " + user.getAge();
    }
}
