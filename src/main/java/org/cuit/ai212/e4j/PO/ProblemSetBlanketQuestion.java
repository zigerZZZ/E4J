package org.cuit.ai212.e4j.PO;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @description: t_problem_set_blanket_question建立题集与选择题两张表之间的联系
 * @author: ziger
 * @time: 2023/4/23 20:24
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
@TableName("t_problem_set_blanket_question")
public class ProblemSetBlanketQuestion {

    @TableId(type = IdType.AUTO)
    private Integer id;

    //题集id
    private Integer problemSetId;

    //填空题Id
    private Integer blanketQuestionId;

    //相对编号
    private Integer number;

    //本题对应的分值
    private  Integer score;

}
