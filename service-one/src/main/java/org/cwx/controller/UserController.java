package org.cwx.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by weican on 2018/6/8.
 */
@RestController
public class UserController {
    @Value("${env.name}")
    private String bar;

    @RequestMapping("/app")
    String hello(){
        return "Hello " + bar + "!";
    }
}
