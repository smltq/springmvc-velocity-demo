package com.tqlin.web.controller;

import com.tqlin.web.model.User;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * SpringMVC和REST服务API的基本用法示例
 *
 * @author tqlin
 */
@Controller
public class UserServiceController {

    @RequestMapping(value = "/user/{name}/{surname}.json", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
    public @ResponseBody
    User getUserJson(@PathVariable String name, @PathVariable String surname) {
        User user = new User(name, surname);
        return user;
    }

    @RequestMapping(value = "/user/{name}/{surname}.xml", method = RequestMethod.GET, produces = MediaType.APPLICATION_XML_VALUE)
    public @ResponseBody
    User getUserXml(@PathVariable String name, @PathVariable String surname) {
        User user = new User(name, surname);
        return user;
    }
}