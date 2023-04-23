package org.cuit.ai212.e4j.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description:
 * @author: ziger
 * @time: 2023/4/23 18:07
 */
@RestController
public class TestController {
    @GetMapping("/test")
    public String test(){
        return "Hello World!";
    }
}
