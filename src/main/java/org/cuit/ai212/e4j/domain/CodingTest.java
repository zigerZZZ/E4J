package org.cuit.ai212.e4j.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @description: t_coding_test表结构一致，应当包含如换行符一类的特殊字符
 * @author: ziger
 * @time: 2023/4/23 19:44
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
@TableName("t_coding_test")
public class CodingTest {
    @TableId(type = IdType.AUTO)
    private Integer id;
    //测试用例编号
    private Integer testNumber;
    //对应的代码题id
    private Integer codingQuestionId;
    //测试输入，应当包含如换行符一类的特殊字符
    private String input;
    //测试输出，应当包含如换行符一类的特殊字符
    private String output;
}
