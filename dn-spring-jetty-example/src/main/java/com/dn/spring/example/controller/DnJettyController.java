package com.dn.spring.example.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/home")
public class DnJettyController {

    @RequestMapping(path = "/username={name}", method = {RequestMethod.GET, RequestMethod.POST})
    @ResponseBody
    public String callParameterMethod(@PathVariable("name") String name){
        return "Hi "+name;
    }

    @RequestMapping(path = "/success", method = {RequestMethod.GET})
    @ResponseBody
    public String callEmptyMethod(){
        return "Hello this is success method...";
    }

}
