/**
 * Copyright (C), 2017-2018, 普惠时代
 * FileName: DemoController
 * Author:   user
 * Date:     2018/7/19 16:08
 * Description: producer服务调用
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.dubbo.controller;

import com.dubbo.api.DemoApi;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 〈一句话功能简述〉<br>
 * 〈producer服务调用〉
 *
 * @author user
 * @create 2018/7/19
 * @since 1.0.0
 */
@RestController
public class DemoController {
    @Resource
    private DemoApi demoService;

    @RequestMapping("/getDemo")
    public String getDemo() {
        return demoService.hello("zhangqian");
    }
}