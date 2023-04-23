package org.cuit.ai212.e4j.PO;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.cuit.ai212.e4j.util.QuestionType;

/**
 * @description: t_exam_record结构一致
 * @author: ziger
 * @time: 2023/4/23 19:56
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
@TableName("t_exam_record")
public class ExamRecord {

    @TableId(type = IdType.AUTO)
    private Integer id;

    //学生id
    private Integer sno;
    //学生参加的考试id
    private Integer examId;
    //该题的类型;0,1,2 分别表示 选择，填空，代码
    private QuestionType QuestionTypeId;
    //该题的相对编号，注意，此字段在数据库中也是主键
    private Integer QuestionNumber;
    //该题得分
    private Integer score;
    //学生作答
    private String answer;
}
