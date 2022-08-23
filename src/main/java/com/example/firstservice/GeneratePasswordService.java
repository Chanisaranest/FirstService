package com.example.firstservice;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GeneratePasswordService {
    @RequestMapping(value = "/{name}.generate" , method = RequestMethod.GET)
    public String generate(@PathVariable("name") String name)
    {
        int random_num = (int)Math.floor(Math.random()*(999999999 - 99999999 +1)+ 99999999);
        return "Hi! " + name +"\n Your new Password is " + random_num ;
    }
}
