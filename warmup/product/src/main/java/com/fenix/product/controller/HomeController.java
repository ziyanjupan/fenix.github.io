package com.fenix.product.controller;

import base.DataResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @Author: xiaguangyong
 * @ClassName: HomeController
 * @Description:
 * @Date: 2020/7/14 12:27
 * @Version: 1.0
 * @Modify:
 */
@RestController
@RequestMapping("product")
public class HomeController {

    @Autowired
    private RestTemplate restTemplate;

    @PostMapping("/index")
    public DataResult index() {
        DataResult result = restTemplate.getForObject("http://user/user/detail?userId={1}", DataResult.class,10L);
        return result;
    }
}
