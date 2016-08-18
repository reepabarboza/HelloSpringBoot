package com.example;

import com.services.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by pradeep on 31-05-2016.
 */
@RestController
//@ComponentScan({"com.services"})
public class HelloController {

    //@Autowired
    NotificationService notificationService;

    @Value("${helloController.msg}")
    private String helloControllerMessage;

    @Value("${my.number.in.range}")
    private String mySecret;

    @Value("${msg}")
    private String profile;
    /*@Autowired
    public HelloController(NotificationService notificationService) {
        this.notificationService = notificationService;
    }*/

    @Autowired
    public void setNotificationService(NotificationService notificationService) {
        this.notificationService = notificationService;
    }


    @RequestMapping("/")
    public String hello() {
        //return notificationService.toString()   ;
        //return  mySecret;
        return  profile;
    }
}
