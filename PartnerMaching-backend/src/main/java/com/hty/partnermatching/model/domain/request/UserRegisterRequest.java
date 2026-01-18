package com.hty.partnermatching.model.domain.request;

import lombok.Data;

import java.io.Serializable;

/**
 * 用户注册请求体
 * @author hty
 */
@Data
public class UserRegisterRequest implements Serializable {//继承Serializable防止序列化过程发生冲突

    private static final long serialVersionUID = -211426989275213082L;

    private String userAccount;
    private String userPassword;
    private String checkPassword;
    private String userCode;
}
