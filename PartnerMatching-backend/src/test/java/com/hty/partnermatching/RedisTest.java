package com.hty.partnermatching;
import java.util.Date;

import com.hty.partnermatching.model.domain.User;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;

import javax.annotation.Resource;

@SpringBootTest
public class RedisTest {

    @Resource
    private RedisTemplate redisTemplate;


    @Test
    void test() {
        ValueOperations valueOperations = redisTemplate.opsForValue();
        //增
        valueOperations.set("hty1","cat");
        valueOperations.set("hty2",1);
        valueOperations.set("hty3",2.0);
        User user = new User();
        user.setId(1L);
        user.setUsername("hty");
        valueOperations.set("hty4",user);
        //查
        Object hty1 = valueOperations.get("hty1");
        Assert.assertTrue("cat".equals((String)hty1));
        //删
        redisTemplate.delete("hty1");
        redisTemplate.delete("hty2");
        redisTemplate.delete("hty3");
        redisTemplate.delete("hty4");
    }
}
