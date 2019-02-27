package com.zhaozhy.redis.test;/*
 * @author zzy
 *
 */

import com.zhaozhy.redis.RedisApp;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = RedisApp.class)
public class StringRedisTest {

    @Autowired
    private StringRedisTemplate stringRedisTemplate;

    @Test
    public void testRedis() {
        this.stringRedisTemplate.opsForValue().set("bbb","111");

    }
}
