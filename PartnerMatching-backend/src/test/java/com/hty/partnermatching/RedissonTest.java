package com.hty.partnermatching;

import org.junit.jupiter.api.Test;
import org.redisson.api.RList;
import org.redisson.api.RedissonClient;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
public class RedissonTest {

    @Resource
    private RedissonClient redissonClient;

    @Test
    void test() {
        //list
        //数据存在redis内存中
        RList<String> mylist = redissonClient.getList("mylist");
        mylist.add("hty");
        System.out.println("mylist：" + mylist.get(0));

    }
}
