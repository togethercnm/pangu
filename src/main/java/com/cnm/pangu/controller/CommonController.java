package com.cnm.pangu.controller;

import com.cnm.pangu.constant.ErrNoEnum;
import com.cnm.pangu.pojo.ResultVo;
import com.cnm.pangu.pojo.TestResult;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CommonController {

    @RequestMapping("/**")
    public ResultVo test(@RequestBody String body){
        ResultVo resultVo = new ResultVo(ErrNoEnum.SUCCESS.getError(),new TestResult("zhangsan"));
        System.out.println("========hello Spring===========");
        return  resultVo;
    }
}
