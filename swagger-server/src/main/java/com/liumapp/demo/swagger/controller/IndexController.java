package com.liumapp.demo.swagger.controller;

import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author liumapp
 * @file IndexController.java
 * @email liumapp.com@gmail.com
 * @homepage http://www.liumapp.com
 * @date 4/19/18
 */
@RestController
@RequestMapping("/")
public class IndexController {

    @GetMapping("/")
    public String index (ModelMap model) {
        return "hello , this is Index Controller";
    }

}
