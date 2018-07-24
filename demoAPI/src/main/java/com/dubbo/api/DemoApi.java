/**
 * Copyright (C), 2017-2018, 普惠时代
 * FileName: DemoApi
 * Author:   user
 * Date:     2018/7/19 15:39
 * Description: DemoAPI供producer、consumer实现，继承使用
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package com.dubbo.api;

/**
 * 〈一句话功能简述〉<br> 
 * 〈DemoAPI供producer、consumer实现，继承使用〉
 *
 * @author user
 * @create 2018/7/19
 * @since 1.0.0
 */
public interface DemoApi {
    public String hello(String name);
}