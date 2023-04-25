package org.cuit.ai212.e4j.domain;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @description: t_teacher表结构一致，登录采用电话号与密码
 * @author: ziger
 * @time: 2023/4/23 20:45
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
@TableName("t_teacher")
public class Teacher {
    @TableId
    private Integer id;
    // 电话号
    private String tel;
    //教师姓名
    private String name;
    //登录密码
    private String password;

}
