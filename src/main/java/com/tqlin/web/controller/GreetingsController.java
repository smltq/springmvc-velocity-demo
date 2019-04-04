package com.tqlin.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 通过URL将一些值传递给controller示例
 *
 * @author tqlin
 */
@Controller
public class GreetingsController {
    @RequestMapping(value = "/greet/{name}", method = RequestMethod.GET)
    public String greetPath(@PathVariable String name, ModelMap model) {
        model.addAttribute("page_title", "我的标题");
        model.addAttribute("name", name);
        return "greetings";
    }

    @RequestMapping(value = "/greet", method = RequestMethod.GET)
    public String greetRequest(
            @RequestParam(required = false, defaultValue = "tqlin") String name,
            ModelMap model) {
        model.addAttribute("name", name);
        return "greetings";
    }
}
