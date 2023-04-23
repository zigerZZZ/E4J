package org.cuit.ai212.e4j.PO;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Date;
import java.sql.Time;

/**
 * @description: 与t_exam表结构一致
 * @author: ziger
 * @time: 2023/4/23 19:49
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
@TableName("t_exam")
public class Exam {

    @TableId
    private Integer id;

    //本次考试对应的题集id
    private Integer problemSetId;
    //考试名称
    private String name;
    //开始时间
    private Date beginTime;
    //结束时间
    private Date endTime;
    //发布者id
    private Integer teacherId;
}
