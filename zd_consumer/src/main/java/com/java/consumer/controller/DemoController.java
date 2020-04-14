package com.java.consumer.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.java.commons.service.DemoService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * author:Jay
 * time:16:57
 * date:2020/4/12
 */
@Controller
@RequestMapping("/demo")
public class DemoController {

    //依赖公共的业务层接口
    @Reference(version = "1.0.0")
    private DemoService demoService;

    @RequestMapping("/loadDemo1/{userName}")
    public @ResponseBody String Demo1(@PathVariable("userName") String userName){
        try {
            return demoService.test01(userName);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
