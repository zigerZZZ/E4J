package org.cuit.ai212.e4j.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.cuit.ai212.e4j.utils.QuestionType;

/**
 * @description: 与t_exercise_record结构一致
 * @author: ziger
 * @time: 2023/4/23 20:01
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
@TableName("t_exercise_record")
public class ExerciseRecord {

    @TableId(type = IdType.AUTO)
    private Integer id;

    //学生id
    private Integer sno;
    //学生练习的题集id
    private Integer problemSetId;
    //该题的类型;0,1,2 分别表示 选择，填空，代码
    private QuestionType QuestionTypeId;
    //该题的相对编号
    private Integer QuestionNumber;
    //该题得分
    private Integer score;
    //学生作答
    private String answer;
}
