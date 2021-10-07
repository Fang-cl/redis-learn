package com.fang;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.data.redis.core.ZSetOperations;

@SpringBootTest
class Redis02ApplicationTests {

    @Autowired
    RedisTemplate redisTemplate;

    @Test
    void contextLoads() {
        ZSetOperations zSetOperations = redisTemplate.opsForZSet();
        System.out.println(redisTemplate.keys("*"));
        ValueOperations valueOperations = redisTemplate.opsForValue();
        valueOperations.set("name", "fang");
        System.out.println(valueOperations.get("name"));
        System.out.println(redisTemplate.type(zSetOperations));
        redisTemplate.multi();
    }

}
