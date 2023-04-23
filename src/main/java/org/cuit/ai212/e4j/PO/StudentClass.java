package org.cuit.ai212.e4j.PO;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @description: 与t_student_class结构一致
 * @author: ziger
 * @time: 2023/4/23 20:43
 */
@AllArgsConstructor
@NoArgsConstructor
@Data
@TableName("t_student_class")
public class StudentClass {

    @TableId(type = IdType.AUTO)
    private Integer id;

    //学号
    private Integer sno;

    //班级号
    private Integer classId;

}
