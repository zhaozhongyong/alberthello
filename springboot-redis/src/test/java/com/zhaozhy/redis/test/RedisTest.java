package com.zhaozhy.redis.test;/*
 * @author zzy
 *
 */

import com.zhaozhy.redis.RedisApp;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = RedisApp.class)
public class RedisTest {

    @Autowired
    private RedisTemplate<String, Object> redisTemplate;


    @Test
    public void testSet() {
        this.redisTemplate.opsForValue().set("idea", "idea测试");
    }

    @Test
    public void testGet() {
        String value = (String) this.redisTemplate.opsForValue().get("idea");
        System.out.println(value);
    }

}
