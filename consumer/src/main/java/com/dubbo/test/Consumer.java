package com.dubbo.test;

import com.dubbo.api.DemoApi;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Consumer {
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"application.xml"});
        context.start();
        DemoApi demoService = (DemoApi)context.getBean("demoService"); // 获取远程服务代理
        String hello = demoService.hello("world"); // 执行远程方法
        System.out.println( hello ); // 显示调用结果
    }
}
