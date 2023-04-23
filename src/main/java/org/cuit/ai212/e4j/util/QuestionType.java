package org.cuit.ai212.e4j.util;

import com.baomidou.mybatisplus.annotation.EnumValue;
import lombok.Getter;

/**
 * 用于描述三类题目，0表示选择，1表示填空，2表示代码
 */
@Getter
public enum QuestionType {
    ChoiceQuestion(0),
    BlanketQuestion(1),
    CodingQuestion(2);

    @EnumValue
    private final Integer id;

    QuestionType(Integer id) {
        this.id = id;
    }
}
