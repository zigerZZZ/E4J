package org.cuit.ai212.e4j.domain;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @description: 此类用于描述数据库表t_blanket_question，与其结构完全一致
 * @author: ziger
 * @time: 2023/4/23 19:27
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
@TableName("t_blanket_question")
public class BlanketQuestion {

    @TableId
    private Integer id;

    //题干描述
    private String description;
    //填空总数
    private Integer gapCount;
    //发布者（教师）Id
    private Integer teacherId;
}
