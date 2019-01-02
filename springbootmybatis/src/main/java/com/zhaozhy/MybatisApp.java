package com.zhaozhy;/*
 * @author zzy
 *
 */

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.zhaozhy.mapper")
public class MybatisApp {
    public static void main(String[] args) {
        SpringApplication.run(MybatisApp.class, args);
    }
}
