package org.cuit.ai212.e4j.sys.security;

import lombok.extern.slf4j.Slf4j;
import org.cuit.ai212.e4j.domain.Admin;
import org.cuit.ai212.e4j.domain.Student;
import org.cuit.ai212.e4j.domain.Teacher;
import org.cuit.ai212.e4j.mapper.AdminMapper;
import org.cuit.ai212.e4j.mapper.StudentMapper;
import org.cuit.ai212.e4j.mapper.TeacherMapper;
import org.cuit.ai212.e4j.utils.StrUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
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
@Slf4j
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
        System.out.println(userType_username);
        UserDetails userDetails = null;
        if ("std".equals(users[0])) {
            int sno = StrUtil.strToInt(users[1]);
            if (sno!=-1){
                Student student = studentMapper.selectBySno(sno);
                if (student != null) {
                    userDetails = User
                            .withUsername(userType_username)
                            .password(student.getPassword())
                            .authorities("ROLE_std")
                            .build();
                }else {
                    throw new UsernameNotFoundException("username not found");
                }
            }
        }else if ("tea".equals(users[0])){
            int tel = StrUtil.strToInt(users[1]);

            if (tel!=-1){
                Teacher teacher = teacherMapper.selectByTel(tel);
                if (teacher!=null){
                    userDetails = User
                            .withUsername(userType_username)
                            .password(teacher.getPassword())
                            .authorities("ROLE_tea")
                            .build();
                }else {
                    throw new UsernameNotFoundException("username not found");
                }
            }
        }else if ("adm".equals(users[0])){
            Admin admin = adminMapper.selectByUsername(users[1]);
            if (admin!=null){
                userDetails = User
                        .withUsername(userType_username)
                        .password(admin.getPassword())
                        .authorities("ROLE_adm")
                        .build();
            }else {
                throw new UsernameNotFoundException("username not found");
            }
        }else {
            throw new UsernameNotFoundException("username illegal");
        }
        return userDetails;
    }
}
