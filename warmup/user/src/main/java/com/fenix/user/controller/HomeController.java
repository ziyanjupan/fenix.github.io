package com.fenix.user.controller;

import base.DataResult;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: xiaguangyong
 * @ClassName: HomeController
 * @Description:
 * @Date: 2020/7/13 20:33
 * @Version: 1.0
 * @Modify:
 */
@RestController
@RequestMapping("/user")
public class HomeController {

    @Value("${server.port}")
    private String port;

    @GetMapping("/detail")
    public DataResult index(@RequestParam("userId") Long userId) {
        return DataResult.SUCCESS("端口号：" + port + "查询id为 " + userId + " 的信息");
    }
}
