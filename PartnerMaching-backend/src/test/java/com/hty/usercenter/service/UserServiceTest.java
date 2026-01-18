//package com.hty.usercenter.service;
//
//import com.hty.usercenter.model.domain.User;
//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.Test;
//import org.springframework.boot.test.context.SpringBootTest;
//
//import javax.annotation.Resource;
//
//import java.util.Date;
//
//import static org.junit.jupiter.api.Assertions.*;
///**
// * @author hty
// * @create 2022-04-07 16:05
// * 用户服务测试
// */
//@SpringBootTest
//public class UserServiceTest {
//
//    @Resource
//    private UserService userService;
//
//    @Test
//    public void testAddUser(){
//        User user = new User();
//        user.setUsername("hty");
//        user.setUserAccount("1234");
//        user.setAvatarUrl("");
//        user.setGender(0);
//        user.setUserPassword("12345678");
//        user.setPhone("123");
//        user.setEmail("456");
//        boolean result = userService.save(user);
//        System.out.println(user.getId());
//        Assertions.assertTrue(result);
//    }
//
//    @Test
//    void userRegister() {
//        String userAccount = "hanty";
//        String userPassword = "";
//        String checkPassword = "123456";
//        String userCode = "1";
//        long result = userService.userRegister(userAccount, userPassword, checkPassword,userCode);
//        Assertions.assertEquals(-1, result);
//
//        userAccount = "ht";
//        result = userService.userRegister(userAccount, userPassword, checkPassword,userCode);
//        Assertions.assertEquals(-1, result);
//
//        userAccount = "hanty";
//        userPassword = "123456";
//        result = userService.userRegister(userAccount, userPassword, checkPassword,userCode);
//        Assertions.assertEquals(-1, result);
//
//        userAccount = "h t y i";
//        userPassword = "12345678";
//        result = userService.userRegister(userAccount, userPassword, checkPassword,userCode);
//        Assertions.assertEquals(-1, result);
//
//        checkPassword = "123456789";
//        result = userService.userRegister(userAccount, userPassword, checkPassword,userCode);
//        Assertions.assertEquals(-1, result);
//
//        userAccount = "dhanty";
//        checkPassword = "12345678";
//        result = userService.userRegister(userAccount, userPassword, checkPassword,userCode);
//        Assertions.assertEquals(-1, result);
//
//        userAccount = "hanty";
//        result = userService.userRegister(userAccount, userPassword, checkPassword,userCode);
//        Assertions.assertEquals(-1, result);
//
//    }
//}