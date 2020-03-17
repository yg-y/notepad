package com.young.notepad.web.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * DefaultHystrixController
 *
 * @author young
 * @date 2020/3/17
 * @desc
 **/
@Slf4j
@RestController
public class DefaultHystrixController {

    @GetMapping("/defaultfallback")
    public Map<String, String> defaultfallback() {
        log.info("降级操作...");
        Map<String, String> map = new HashMap<>();
        map.put("code", "500");
        map.put("message", "服务异常");
        map.put("data", "null");
        return map;
    }
}
