package org.cuit.ai212.e4j.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.cuit.ai212.e4j.domain.Student;

import java.util.List;

@Mapper
public interface StudentMapper extends BaseMapper<Student> {
    Student selectBySno(int Sno);
    List<Student> selectAll(int page,int size);

    List<Student> selectByName(String name);

    int insertOne(Student student);

    int deleteBySno(int sno);

    int update(Student student);
}