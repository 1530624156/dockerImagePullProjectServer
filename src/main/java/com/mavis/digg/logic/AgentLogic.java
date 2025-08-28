package com.mavis.digg.logic;

import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import com.mavis.digg.entity.po.AgentInfo;
import com.mavis.digg.service.AgentInfoService;
import com.mavis.digg.utils.RestResult;
import org.springframework.stereotype.Component;

import javax.annotation.Resource;

/**
 * AgentLogic
 *
 * @author Mavis郭逸轩
 * @since 2025/8/25 20:01
 */
@Component
public class AgentLogic {
    @Resource
    private AgentInfoService agentInfoService;

    /**
     * 测试节点
     * @param agentId
     * @return
     */
    public RestResult testAgent(String agentId){
        if (StringUtils.isBlank(agentId)){
            return RestResult.fail("节点Id不能为空!");
        }
        AgentInfo agent = agentInfoService.getById(agentId);
        if (agent == null){
            return RestResult.fail("节点不存在!");
        }
        boolean result = agentInfoService.testAgent(agent);
        if (result){
            return RestResult.success("测试节点成功!");
        }
        return RestResult.fail("测试节点失败!");
    }

    public RestResult pullDockerImage(String agentId, String imageName, String imageTag) {
        if (StringUtils.isBlank(agentId)){
            return RestResult.fail("节点Id不能为空!");
        }
        if (StringUtils.isBlank(imageName)){
            return RestResult.fail("镜像名称不能为空!");
        }
        if (StringUtils.isBlank(imageTag)){
            return RestResult.fail("镜像标签不能为空!");
        }
        AgentInfo agent = agentInfoService.getById(agentId);
        if (agent == null){
            return RestResult.fail("节点不存在!");
        }
        boolean result = agentInfoService.pullDockerImage(agent, imageName, imageTag);
        if (result){
            return RestResult.success("拉取镜像成功!");
        }
    }
}
