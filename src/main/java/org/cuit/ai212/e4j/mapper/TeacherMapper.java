package org.cuit.ai212.e4j.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.cuit.ai212.e4j.domain.Teacher;

@Mapper
public interface TeacherMapper extends BaseMapper<Teacher> {
    Teacher selectByTel(int tel);
}