package com.java.provider.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.java.commons.service.DemoService;

/**
 * author:Jay
 * time:15:02
 * date:2020/4/12
 */
@Service(version = "1.0.0") // dubbo容器的实例化
public class DemoServiceImpl implements DemoService {

    //实现测试接口的方法
    @Override
    public String test01(String userName) throws Exception {
        System.out.println("provider1");
        return userName+"1";
    }
}
