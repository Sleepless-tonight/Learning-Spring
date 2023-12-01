package cn.saveload.springboot.controller;

import cn.saveload.springboot.service.impl.TestServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @className: ControllerHello
 * @author: shili
 * @date: 2023/1/8 20:29
 **/
@RestController
public class ControllerHello {

    @Autowired
    TestServiceImpl t;

    @RequestMapping(value = "/hello")
    public String hello() {
        return "hello";
    }

    @RequestMapping(value = "/test")
    public String test() {
        return t.test();
    }
}
