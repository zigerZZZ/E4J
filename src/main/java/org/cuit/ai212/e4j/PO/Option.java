package org.cuit.ai212.e4j.PO;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @description: t_option表结构一致
 * @author: ziger
 * @time: 2023/4/23 20:08
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
@TableName("t_option")
public class Option {

    @TableId(type = IdType.AUTO)
    private Integer id;

    //选项编号,0表示A,1表示B......
    private Integer optionNumber;
    //所属选择题的id
    private Integer choiceQuestionId;
    //选项内容
    private String context;
    //是否为正确选项
    private Boolean flag;

}
