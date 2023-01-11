package cn.saveload.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @className: ControllerHello
 * @author: shili
 * @date: 2023/1/8 20:29
 **/
@RestController
public class ControllerHello {

    @RequestMapping(value = "/hello")
    public String hello() {
        return "hello";
    }
}
