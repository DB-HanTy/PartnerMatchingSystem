package com.hty.partnermatching.model.request;

import lombok.Data;

import java.io.Serializable;

/**
 * 退出队伍请求
 */
@Data
public class TeamQuitRequest implements Serializable {

    private static final long serialVersionUID = -8570590165397077490L;

    /**
     *  id
     */
    private Long teamId;

    /**
     * 密码
     */
    private String password;
}
