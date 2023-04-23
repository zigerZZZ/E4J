package org.cuit.ai212.e4j.PO;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @description: 与t_class表 结构一致
 * @author: ziger
 * @time: 2023/4/23 19:37
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
@TableName("t_class")
public class Class {

    @TableId
    private Integer classId;

    //班级名称
    private String name;
    //创建者id
    private Integer teacherId;

}
