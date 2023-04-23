package org.cuit.ai212.e4j.PO;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @description: t_problem_set表结构一致
 * @author: ziger
 * @time: 2023/4/23 20:15
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
@TableName("t_problem_set")
public class ProblemSet {

    @TableId
    private Integer id;

    //题集名称
    private String name;
    //是否启用严格的多选评分模式；默认为false；如果启用，则多选题少选或多选均不得分；若关闭，则多选题少选会得40%的分
    private Boolean strict;
    //题集的公开性
    private Boolean publicity;
    //发布者id
    private Integer teacherId;

}
