package org.cuit.ai212.e4j.sys.security;

import org.cuit.ai212.e4j.domain.Student;
import org.cuit.ai212.e4j.mapper.AdminMapper;
import org.cuit.ai212.e4j.mapper.StudentMapper;
import org.cuit.ai212.e4j.mapper.TeacherMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

/**
 * @description: 自定义用户登录逻辑
 * @author: Chenear
 * @time: 2023/4/25 19:34
 */
@Service
public class UserDetailServiceImpl implements UserDetailsService {
    @Autowired
    private StudentMapper studentMapper;
    @Autowired
    private TeacherMapper teacherMapper;
    @Autowired
    private AdminMapper adminMapper;

    @Override
    public UserDetails loadUserByUsername(String userType_username) throws UsernameNotFoundException {
        String[] users = userType_username.split("_");

        if ("std".equals(users[0])) {

        }
            return null;
    }
}
