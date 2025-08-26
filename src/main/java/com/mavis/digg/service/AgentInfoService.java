package com.mavis.digg.service;

import com.mavis.digg.entity.po.AgentInfo;
import com.baomidou.mybatisplus.extension.service.IService;

/**
* @author Administrator
* @description 针对表【agent_info】的数据库操作Service
* @createDate 2025-08-26 20:56:27
*/
public interface AgentInfoService extends IService<AgentInfo> {

    /**
     * 测试节点
     * @param agent
     * @return
     */
    boolean testAgent(AgentInfo agent);

}
