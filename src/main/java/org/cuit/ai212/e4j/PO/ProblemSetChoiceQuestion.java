package org.cuit.ai212.e4j.PO;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @description: t_problem_set_choice_question建立题集与选择题两张表之间的联系
 * @author: ziger
 * @time: 2023/4/23 20:24
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
@TableName("t_problem_set_choice_question")
public class ProblemSetChoiceQuestion {

    @TableId(type = IdType.AUTO)
    private Integer id;

    //题集id
    private Integer problemSetId;

    //选择题Id
    private Integer choiceQuestionId;

    //相对编号
    private Integer number;

    //本题对应的分值
    private  Integer score;
}
