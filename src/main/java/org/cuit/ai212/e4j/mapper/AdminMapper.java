package org.cuit.ai212.e4j.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.cuit.ai212.e4j.domain.Admin;

import java.util.List;

@Mapper
public interface AdminMapper extends BaseMapper<Admin> {
    Admin selectByUsername(String username);

    List<Admin> selectAll(int page,int size);
}
