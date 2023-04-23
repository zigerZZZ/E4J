package org.cuit.ai212.e4j.PO;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @description: 与表t_choice_question结构一致
 * @author: ziger
 * @time: 2023/4/23 19:32
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
@TableName("t_choice_question")
public class ChoiceQuestion {

    @TableId
    private Integer id;

    //题干描述
    private String description;
    //是否为多选
    private Boolean multiple;
    //发布者id
    private Integer teacherId;
}
