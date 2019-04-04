package com.tqlin.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * SpringMVC结合Velocity基本用法示例.
 *
 * @author tqlin
 */
@Controller
public class HelloWorldController {

    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String hello() {
        return "hello";
    }

    @RequestMapping(value = "/hello-world", method = RequestMethod.GET)
    public String helloWorld() {
        return "hello-world";
    }

    @RequestMapping(value = "/hello-redirect", method = RequestMethod.GET)
    public String helloRedirect() {
        return "redirect:/hello-world";
    }

}
