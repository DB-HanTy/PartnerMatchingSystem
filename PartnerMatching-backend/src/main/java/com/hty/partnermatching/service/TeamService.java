package com.hty.partnermatching.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hty.partnermatching.model.domain.Team;
import com.hty.partnermatching.model.domain.User;
import com.hty.partnermatching.model.dto.TeamQuery;
import com.hty.partnermatching.model.request.TeamJoinRequest;
import com.hty.partnermatching.model.request.TeamQuitRequest;
import com.hty.partnermatching.model.request.TeamUpdateRequest;
import com.hty.partnermatching.model.vo.TeamUserVO;

import java.util.List;

/**
* @author 33038
* @description 针对表【team(队伍)】的数据库操作Service
* @createDate 2026-02-01 13:48:34
*/
public interface TeamService extends IService<Team> {
    /**
     * 创建队伍
     * @param team
     * @return
     */
    long addTeam(Team team, User loginUser);

    /**
     * 搜索队伍
     *
     * @param teamQuery
     * @param
     * @return
     */
    List<TeamUserVO> listTeams(TeamQuery teamQuery, boolean isAdmin);

    /**
     * 更新队伍
     * @param teamUpdateRequest
     * @return
     */
    boolean updateTeam(TeamUpdateRequest teamUpdateRequest, User loginUser);

    /**
     * 加入队伍
     * @param teamJoinRequest
     * @return
     */
    boolean joinTeam(TeamJoinRequest teamJoinRequest, User loginUser);

    /**
     * 退出队伍
     * @param teamQuitRequest
     * @return
     */
    boolean quitTeam(TeamQuitRequest teamQuitRequest, User loginUser);

    /**
     * 删除队伍
     * @param id
     * @return
     */
    boolean deleteTeam(long id, User loginUser);
}
