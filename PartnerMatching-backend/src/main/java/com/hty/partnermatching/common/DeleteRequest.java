package com.hty.partnermatching.common;

import lombok.Data;

import java.io.Serializable;

/**
 * 通用删除请求参数
 */
@Data
public class DeleteRequest implements Serializable {

    private static final  long serialVersionUID = -2374598235L;

    private Long id;
}
