package com.mavis.digg.entity.po;

import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * 
 * @TableName agent_info
 */
@TableName(value ="agent_info")
@Data
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class AgentInfo implements Serializable {
    /**
     * 
     */
    @TableId
    private String id;

    /**
     * 
     */
    private String agentName;

    /**
     * 
     */
    private String agentUrl;

    /**
     * 
     */
    private String agentUsername;

    /**
     * 
     */
    private String agentPassword;

    /**
     * 
     */
    private String backup;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        AgentInfo other = (AgentInfo) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getAgentName() == null ? other.getAgentName() == null : this.getAgentName().equals(other.getAgentName()))
            && (this.getAgentUrl() == null ? other.getAgentUrl() == null : this.getAgentUrl().equals(other.getAgentUrl()))
            && (this.getAgentUsername() == null ? other.getAgentUsername() == null : this.getAgentUsername().equals(other.getAgentUsername()))
            && (this.getAgentPassword() == null ? other.getAgentPassword() == null : this.getAgentPassword().equals(other.getAgentPassword()))
            && (this.getBackup() == null ? other.getBackup() == null : this.getBackup().equals(other.getBackup()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getAgentName() == null) ? 0 : getAgentName().hashCode());
        result = prime * result + ((getAgentUrl() == null) ? 0 : getAgentUrl().hashCode());
        result = prime * result + ((getAgentUsername() == null) ? 0 : getAgentUsername().hashCode());
        result = prime * result + ((getAgentPassword() == null) ? 0 : getAgentPassword().hashCode());
        result = prime * result + ((getBackup() == null) ? 0 : getBackup().hashCode());
        return result;
    }

}