package io.github.zdp072;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
import java.util.HashMap;
import java.util.Map;

/**
 * 测试RestTemplate
 *
 * @ClassName: ConsumerController
 * @Author: zdp072
 * @Date: 2019/6/16 下午3:07
 * @Version: V1.0
 */
@RestController
public class UserController {

    private static final String COMMON_REQUEST_URL = "http://springboot-demo-service/";

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping(value = "/get0", method = RequestMethod.GET)
    public String get0() {
        ResponseEntity<String> responseEntity =
                restTemplate.getForEntity(COMMON_REQUEST_URL + "hello1?name={1}", String.class, "jim");
        String result = responseEntity.getBody();
        return result;
    }

    @RequestMapping(value = "/get1", method = RequestMethod.GET)
    public String get1() {
        Map<String, String> params = new HashMap<>();
        params.put("name", "jim");
        ResponseEntity<String> responseEntity =
                restTemplate.getForEntity(COMMON_REQUEST_URL + "hello1?name={name}", String.class, params);
        String result = responseEntity.getBody();
        return result;
    }

    @RequestMapping(value = "/get2", method = RequestMethod.GET)
    public String get2() {
        UriComponents uriComponents = UriComponentsBuilder.fromUriString(
                COMMON_REQUEST_URL + "hello1?name={name}")
                .build()
                .expand("jim")
                .encode();
        URI uri = uriComponents.toUri();
        String result = restTemplate.getForEntity(uri, String.class).getBody();
        return result;
    }

    @RequestMapping(value = "/get3", method = RequestMethod.GET)
    public String get3() {
        String result = restTemplate.getForObject(COMMON_REQUEST_URL + "hello", String.class);
        return result;
    }

    @RequestMapping(value = "/post1", method = RequestMethod.GET)
    public String post1() {
        User user = new User("jim", 20);
        String result = restTemplate.postForObject(COMMON_REQUEST_URL + "hello3", user, String.class);
        return result;
    }

    @RequestMapping(value = "/post2", method = RequestMethod.GET)
    public String post2() {
        User user = new User("jim", 20);
        ResponseEntity<String> responseEntity =
                restTemplate.postForEntity(COMMON_REQUEST_URL + "hello3", user, String.class);
        String result = responseEntity.getBody();
        return result;
    }

}
