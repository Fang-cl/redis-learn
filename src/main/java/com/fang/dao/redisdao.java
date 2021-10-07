package com.fang.dao;

import org.springframework.boot.autoconfigure.data.redis.RedisProperties;

/**
 * @Author Fang
 * @create 2021/10/6 16:07
 */
public class redisdao {

    public static void main(String[] args) {
        RedisProperties.Jedis jedis = new RedisProperties.Jedis();
        RedisProperties.Lettuce lettuce = new RedisProperties.Lettuce();

    }
}
