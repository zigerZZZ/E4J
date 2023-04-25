package org.cuit.ai212.e4j.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.cuit.ai212.e4j.utils.result.CommonResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description: 登录控制器
 * @author: Chenear
 * @time: 2023/4/24 21:24
 */
@RestController
@Api(value = "用户登录接口")
public class LoginController {



    @ApiOperation(value = "登录",httpMethod = "POST")
    @PostMapping(value = "/login")
    public CommonResult<String> commonResult(String username,String password,String userType){

        return null;
    }
}
