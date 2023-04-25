package org.cuit.ai212.e4j.controller.question;

import org.apache.ibatis.annotations.Param;
import org.cuit.ai212.e4j.domain.parma.CodingCheckParma;
import org.cuit.ai212.e4j.service.question.QuestionCheckService;
import org.cuit.ai212.e4j.utils.result.CommonResult;
import org.cuit.ai212.e4j.utils.result.ResultUtil;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @description: 验证题目控制器
 * @author: ziger
 * @time: 2023/4/25 20:06
 */
@RestController
public class QuestionCheckController {

    @Resource
    QuestionCheckService checkService;

    @GetMapping("/exam/check-coding")
    public CommonResult examCodingCheck(@RequestBody CodingCheckParma parma){
        //todo 完成代码题答案核对的接口
        return ResultUtil.success(parma);
    }



}
