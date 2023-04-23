package org.cuit.ai212.e4j.PO;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @description: t_coding_question表结构一致
 * @author: ziger
 * @time: 2023/4/23 19:40
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
@TableName("t_coding_question")
public class CodingQuestion {

    @TableId
    private Integer id;

    //题干描述
    private String description;
    //输入样例
    private String inputExample;
    //输出样例
    private String outputExample;
    //发布者id
    private Integer teacherId;

}

