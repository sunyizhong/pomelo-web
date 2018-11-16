package com.pomelo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

/**
 * Description: 学习
 *
 * @author sunyizhong
 * @date 2018/11/15
 */
@Slf4j
@RestController
public class PomeloController {

    @GetMapping(value = "/test")
    public String pomelo(){
        log.debug("debug-测试");
        log.info("info-测试");
        log.warn("warn-测试");
        log.error("error-测试");
        return "测试";
    }
}
