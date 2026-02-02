package com.hty.partnermatching.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hty.partnermatching.common.ErrorCode;
import com.hty.partnermatching.exception.BusinessException;
import com.hty.partnermatching.mapper.TeamMapper;
import com.hty.partnermatching.model.domain.Team;
import com.hty.partnermatching.model.domain.User;
import com.hty.partnermatching.service.TeamService;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * @author 33038
 * @description 针对表【team(队伍)】的数据库操作Service实现
 * @createDate 2026-02-01 13:48:34
 */
@Service
public class TeamServiceImpl extends ServiceImpl<TeamMapper, Team>
        implements TeamService{
    @Override
    public long addTeam(Team team, User loginUser) {
        //1. 请求参数是否为空？
        if (team == null){
            throw new BusinessException(ErrorCode.PARAMS_ERROR);
        }
        //2. 是否登录，未登录不允许创建
        if (loginUser == null){
            throw new BusinessException(ErrorCode.NO_LOGIN);
        }
        //3. 校验信息
        //        1、队伍人数 > 1 且 ≤ 20
        int maxNum = Optional.ofNullable(team.getMaxNum()).orElse(0);
        if (maxNum < 1 || maxNum > 20){
            throw new BusinessException(ErrorCode.PARAMS_ERROR, "队伍人数不满足要求");
        }
        //        2、队伍标题 ≤ 20
        String name = team.getName();
        if (name.length() > 20){
            throw new BusinessException(ErrorCode.PARAMS_ERROR, "队伍标题过长");
        }
        //        3、描述 ≤ 512
        String description = team.getDescription();
        if (description.length() > 512){
            throw new BusinessException(ErrorCode.PARAMS_ERROR, "队伍描述过长");
        }
        //        4、status 是否公开（int）不传默认为0（公开）
        int status = Optional.ofNullable(team.getStatus()).orElse(0);
        if (status < 0){
            throw new BusinessException(ErrorCode.PARAMS_ERROR, "队伍状态不满足要求");
        }
        //        5、如果status是加密状态，一定要有密码，且密码 ≤ 32

        //        6、超时时间 > 当前时间
        //        7、校验用户最多创建5个队伍
        //4. 插入队伍信息到队伍表
        //5. 插入用户 ⇒ 队伍关系到关系表
        return 0;
    }
}
