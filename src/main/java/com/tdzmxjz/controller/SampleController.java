package com.tdzmxjz.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Tdz on 2017-7-2.
 */
@Controller
@EnableAutoConfiguration
public class SampleController {
    @RequestMapping("/hello")
    @ResponseBody
    String home() {
        return "Hello World!";
    }
}
