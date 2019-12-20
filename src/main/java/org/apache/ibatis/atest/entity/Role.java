package org.apache.ibatis.atest.entity;

import lombok.Data;

/*
 * @author gethin
 * 角色的实体类
 */
@Data
public class Role {
    private long id;
    private String roleName;
    private String note;
}
