package com.zhaozhy.multi.controller;/*
 * @author zzy
 *
 */

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MultiController {
    @RequestMapping("/multi")
    public String multi() {
        return "multi env";
    }
}
