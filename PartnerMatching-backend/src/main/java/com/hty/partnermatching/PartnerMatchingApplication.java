package com.hty.partnermatching;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.hty.partnermatching.mapper")

@SpringBootApplication
public class PartnerMatchingApplication {

    public static void main(String[] args) {
        SpringApplication.run(PartnerMatchingApplication.class, args);
    }

}
