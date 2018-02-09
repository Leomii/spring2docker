package com.leomii.s2d.controller;

import io.swagger.annotations.ApiOperation;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@EnableAutoConfiguration
public class WelcomeController {

    @ResponseBody
    @RequestMapping(value = "/", method = RequestMethod.GET)
    @ApiOperation(value = "welcome page", notes = "system health check")
    public String home() {
        return "Hello Docker World";
    }
}
