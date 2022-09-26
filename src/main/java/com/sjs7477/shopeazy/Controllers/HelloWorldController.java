package com.sjs7477.shopeazy.Controllers;

import com.sjs7477.shopeazy.Services.HelloWorldService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
    @RequestMapping
    public String helloWorld(String message){
        System.out.println("Entering the Controller");
        //to be changed to be gotten from Service
         HelloWorldService helloWorldService = new HelloWorldService();
        message = helloWorldService.helloWorld(message);
        System.out.println("Leaving the Controller");
        return message;
    }
}
