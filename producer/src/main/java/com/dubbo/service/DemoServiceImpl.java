/**
 * Copyright (C), 2017-2018, 普惠时代
 * FileName: DemoServiceImpl
 * Author:   user
 * Date:     2018/7/19 15:52
 * Description: API实现，供consumer调用
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.dubbo.service;

import com.dubbo.api.DemoApi;

/**
 * 〈一句话功能简述〉<br> 
 * 〈API实现，供consumer调用〉
 *
 * @author user
 * @create 2018/7/19
 * @since 1.0.0
 */
public class DemoServiceImpl implements DemoApi {
    @Override
    public String hello(String name) {
        return "hello "+name;
    }
}