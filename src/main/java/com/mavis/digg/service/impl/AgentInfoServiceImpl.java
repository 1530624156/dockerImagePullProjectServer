package com.mavis.digg.service.impl;

import cn.hutool.http.HttpUtil;
import cn.hutool.json.JSONUtil;
import com.alibaba.fastjson.JSONObject;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.mavis.digg.entity.po.AgentInfo;
import com.mavis.digg.service.AgentInfoService;
import com.mavis.digg.mapper.AgentInfoMapper;
import com.mavis.digg.utils.MavisUtils;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Objects;

import static com.mavis.digg.constant.ApiConstant.TEST_URL;

/**
* @author Administrator
* @description 针对表【agent_info】的数据库操作Service实现
* @createDate 2025-08-26 20:56:27
*/
@Service
public class AgentInfoServiceImpl extends ServiceImpl<AgentInfoMapper, AgentInfo>
    implements AgentInfoService{
    @Override
    public boolean testAgent(AgentInfo agent) {
        if (agent == null){
            return false;
        }
        String url = agent.getAgentUrl() + TEST_URL;
        HashMap<String, Object> paramMap = new HashMap<>();
        paramMap.put("username", agent.getAgentUsername());
        paramMap.put("password", agent.getAgentPassword());
        String restResultHtml = HttpUtil.post(url, JSONUtil.toJsonStr(paramMap),10000);
        if (MavisUtils.checkRestResultHtml(restResultHtml)){
            return true;
        }
        return false;
    }
}




