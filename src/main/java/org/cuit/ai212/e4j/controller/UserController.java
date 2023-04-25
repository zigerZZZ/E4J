package org.cuit.ai212.e4j.controller;



import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description: 用户管理控制器
 * @author: Chenear
 * @time: 2023/4/24 21:24
 */
@RestController
@Secured(value = {"ROLE_adm"})
public class UserController {

    @GetMapping(value = "/admin")
    public String getAllAdmin(){
        return "sdasdsa";
    }
}
