package com.hty.partnermatching.service;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.hty.partnermatching.model.domain.User;
import com.baomidou.mybatisplus.extension.service.IService;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

import static com.hty.partnermatching.constant.UserConstant.ADMIN_ROLE;
import static com.hty.partnermatching.constant.UserConstant.USER_LOGIN_STATE;

/**
 * @author hty
 * @description 针对表【user(用户)】的数据库操作Service
 * @createDate 2025-11-19 11:00:34
 */
public interface UserService extends IService<User> {

    /**
     * 用户注册
     *
     * @param userAccount   用户账户
     * @param userPassword  用户密码
     * @param checkPassword 校验密码
     * @param userCode  用户编号
     * @return 新用户id
     */
    long userRegister(String userAccount, String userPassword, String checkPassword, String userCode);

    /**
     * 登录
     *
     * @param userAccount  用户账户
     * @param userPassword 用户密码
     * @param request
     * @return 脱敏后的用户信息
     */
    User userLogin(String userAccount, String userPassword, HttpServletRequest request);

    /**
     * 用户脱敏
     * @param originUser
     * @return
     */
    User getSafetyUser(User originUser);

    /**
     * 用户注销
     * @param request
     * @return
     */
    int userLogout(HttpServletRequest request);

    /**
     * 更新用户信息
     * @param user
     * @param
     * @return
     */
    int updateUser(User user, User loginUser);

    /**
     * 根据标签搜索用户
     *
     * @param tagNameList
     * @return
     */
    List<User> searchUsersByTags(List<String> tagNameList);

    /**
     * 获取当前登录用户
     * @return
     */
    User getLoginUser(HttpServletRequest request);



    /**
     * 是否为管理员
     * @param request
     * @return
     */
    boolean isAdmin(HttpServletRequest request);

    boolean isAdmin(User loginUser);

    /**
     * 推荐用户
     * @param pageSize
     * @param pageNum
     * @param request
     * @return
     */
    Page<User> getRecommendUsers(long pageSize, long pageNum, HttpServletRequest request);
}
