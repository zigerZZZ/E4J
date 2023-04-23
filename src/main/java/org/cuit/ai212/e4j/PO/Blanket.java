package org.cuit.ai212.e4j.PO;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @description: 对应数据库中的blanket表
 * @author: ziger
 * @time: 2023/4/23 18:43
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
@TableName("t_blanket")
public class Blanket {

    @TableId
    //填空编号，指的是该空在填空题中的位置
    private Integer optionNumber;

    //该空对应的填空题id
    private Integer blanketQuestionId;
    //正确答案
    private String answer;

}
