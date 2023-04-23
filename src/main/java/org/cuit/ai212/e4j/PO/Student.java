package org.cuit.ai212.e4j.PO;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @description: t_student表结构一致，登录采用学号密码
 * @author: ziger
 * @time: 2023/4/23 20:25
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
@TableName("t_student")
public class Student {

    @TableId
    private Integer sno;

    //学生姓名
    private String name;
    //密码
    private String password;
}
