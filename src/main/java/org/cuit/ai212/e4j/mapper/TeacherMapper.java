package org.cuit.ai212.e4j.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.cuit.ai212.e4j.domain.Teacher;

import java.util.List;

@Mapper
public interface TeacherMapper extends BaseMapper<Teacher> {
    Teacher selectByTel(int tel);
    List<Teacher> selectAll(int page,int size);
    List<Teacher> selectByName(String name);
    int insertOne(Teacher teacher);

    int selectById(int id);

    int deleteById(int id);

    int update(Teacher teacher);
}