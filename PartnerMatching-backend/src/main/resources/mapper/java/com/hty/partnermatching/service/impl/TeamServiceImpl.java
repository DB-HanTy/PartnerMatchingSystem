package com.hty.partnermatching.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import generator.domain.Team;
import generator.mapper.TeamMapper;
import generator.service.TeamService;
import org.springframework.stereotype.Service;

/**
* @author 33038
* @description 针对表【team(队伍)】的数据库操作Service实现
* @createDate 2026-02-01 13:48:34
*/
@Service
public class TeamServiceImpl extends ServiceImpl<TeamMapper, Team>
    implements TeamService{

}




