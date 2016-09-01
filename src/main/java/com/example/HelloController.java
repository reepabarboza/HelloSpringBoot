package com.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by pradeep on 31-05-2016.
 */
@RestController
//@ComponentScan({"com.services"})
public class HelloController {

    @Value("${helloController.msg}")
    private String helloControllerMessage;

    @Value("${my.number.in.range}")
    private String mySecret;

    @Value("${msg}")
    private String profile;


    @RequestMapping("/")
    public String hello() {
        //return  mySecret;
        return  profile;
    }
}
