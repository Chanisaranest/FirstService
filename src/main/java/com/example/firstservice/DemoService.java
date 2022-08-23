package com.example.firstservice;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoService {
    @RequestMapping(value =  "/helloworld", method = RequestMethod.GET)
    public String helloworld(){
        return "Hello world1";
    }
    @RequestMapping(value =  "/hello/{name}", method = RequestMethod.GET)
    public String helloworld(@PathVariable("name") String n){
        return "Hello world1" + n ;
    }
}
