package org.cuit.ai212.e4j.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @description: t_admin 表结构一致，管理员采用username和password登录
 * @author: Chenear
 * @time: 2023/4/24 21:17
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
@TableName(value = "t_admin")
public class Admin {
    @TableId(type = IdType.AUTO)
    private Integer id;

    private String username;

    private String password;

    public Admin(String username,String password){
        this.password = password;
        this.username = username;
    }
}
