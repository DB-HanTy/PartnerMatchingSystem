package com.hty.partnermatching.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hty.partnermatching.mapper.UserTeamMapper;
import com.hty.partnermatching.model.domain.UserTeam;
import com.hty.partnermatching.service.UserTeamService;
import org.springframework.stereotype.Service;

/**
* @author 33038
* @description 针对表【user_team(用户-队伍关系)】的数据库操作Service实现
* @createDate 2026-02-01 13:49:52
*/
@Service
public class UserTeamServiceImpl extends ServiceImpl<UserTeamMapper, UserTeam>
    implements UserTeamService {

}




