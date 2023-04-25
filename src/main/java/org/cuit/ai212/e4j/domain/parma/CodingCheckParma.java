package org.cuit.ai212.e4j.domain.parma;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @description:
 * @author: ziger
 * @time: 2023/4/25 20:53
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CodingCheckParma {
    //学号
    Integer stuNo;
    //考试号/题集号；如果验证题目为考试题目则此项表示考试号，否则表示题集号
    Integer setId;
    //本代码题的相对序号
    Integer questionNo;
    //学生的答案
    String answer;

}
