package com.mavis.digg.controller;

import com.mavis.digg.logic.AgentLogic;
import com.mavis.digg.utils.RestResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;


/**
 * AgentController
 *  描述：节点接口
 * @author Mavis郭逸轩
 * @since 2025/8/25 19:56
 */
@RestController
@RequestMapping("/agent")
public class AgentController {

    @Resource
    private AgentLogic agentLogic;

    /**
     * 根据文件Id返回文件下载地址
     * @param agentId
     * @return
     */
    @PostMapping("/test")
    public RestResult testAgent(String agentId){
        return agentLogic.testAgent(agentId);
    }
}
