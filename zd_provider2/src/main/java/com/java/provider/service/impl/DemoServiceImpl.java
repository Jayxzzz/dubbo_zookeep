package com.java.provider.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.java.commons.service.DemoService;


/**
 * author:Jay
 * time:16:38
 * date:2020/4/12
 */
@Service(version = "1.0.0")
public class DemoServiceImpl implements DemoService{

    @Override
    public String test01(String userName) throws Exception {
        System.out.println("provider22222");
        return userName+"2";
    }
}
