package org.cuit.ai212.e4j.service.impl;

import org.cuit.ai212.e4j.domain.Student;
import org.cuit.ai212.e4j.domain.Teacher;
import org.cuit.ai212.e4j.mapper.AdminMapper;
import org.cuit.ai212.e4j.mapper.StudentMapper;
import org.cuit.ai212.e4j.mapper.TeacherMapper;
import org.cuit.ai212.e4j.service.UserService;
import org.cuit.ai212.e4j.utils.StrUtil;
import org.cuit.ai212.e4j.utils.result.CommonResult;
import org.cuit.ai212.e4j.utils.result.ResultCode;
import org.cuit.ai212.e4j.utils.result.ResultUtil;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @description: 用户CRUD服务
 * @author: Chenear
 * @time: 2023/4/26 13:10
 */
@Service
public class UserServiceImpl implements UserService {
    @Resource
    private StudentMapper studentMapper;
    @Resource
    private TeacherMapper teacherMapper;

    /**通过用户类型并制定页号和大小获取所有用户
     * @param userType 用户类型
     * @param page 页号
     * @param size 用户个数
     * @return {@link CommonResult}
     */
    @Override
    public CommonResult getAllUserByUserType(String userType, String page, String size) {
        int pageNum = StrUtil.strToInt(page) == -1 ? 1 : StrUtil.strToInt(page);
        int sizeNum = StrUtil.strToInt(size) == -1 ? 10 : StrUtil.strToInt(size);
        pageNum = (pageNum - 1) * sizeNum;

        if ("".equals(userType) || userType == null) {
            return ResultUtil.fail(ResultCode.PARAM_NOT_VALID);
        }
        List result = null;

        if ("stu".equals(userType)) {
            result = studentMapper.selectAll(pageNum, sizeNum);
        } else if ("tea".equals(userType)) {
            result = teacherMapper.selectAll(pageNum, sizeNum);
        }

        if (result == null) {
            return ResultUtil.fail(ResultCode.PARAM_NOT_VALID);
        }
        return ResultUtil.success(result);
    }
    /**
     * 通过用户类型和用户名获取用户列表
     * @param userType 用户类型
     * @param username 用户名
     * @return {@link CommonResult}
     */
    @Override
    public CommonResult getUserByUserTypeAndUsername(String userType, String username) {
        if (userType == null || "".equals(userType) || username == null || "".equals(username))
            return ResultUtil.fail(ResultCode.PARAM_NOT_COMPLETE);
        List data = null;
        if (userType.equals("stu")) {
            data = studentMapper.selectByName(username);
        } else if (userType.equals("tea")) {
            data = teacherMapper.selectByName(username);
        }

        return ResultUtil.success(data);
    }
    /**
     * 更新用户通过用户类型和用户实体类
     * @param userType 用户类型
     * @param user 用户实体类
     * @return {@link CommonResult}
     */
    @Override
    public CommonResult updateUserByUserTypeAndUserId(String userType, Object user) {
        if (userType == null || "".equals(userType) || user == null)
            return ResultUtil.fail(ResultCode.PARAM_NOT_COMPLETE);

        if (userType.equals("stu")) {
            Student student = studentMapper.selectBySno(((Student) user).getSno());
            if (student == null) {
                return ResultUtil.fail(ResultCode.USER_IS_EMPTY);
            }
            if (1 != studentMapper.update((Student) user)) {
                return ResultUtil.fail(ResultCode.COMMON_FAIL);
            }

            return ResultUtil.success();
        } else if (userType.equals("tea")) {
            Teacher teacher = teacherMapper.selectById(((Teacher) user).getId());
            if (teacher == null) {
                return ResultUtil.fail(ResultCode.USER_IS_EMPTY);
            }
            if (1 != teacherMapper.update((Teacher) user)) {
                return ResultUtil.fail(ResultCode.COMMON_FAIL);
            }
            return ResultUtil.success();

        }
        return ResultUtil.fail(ResultCode.PARAM_NOT_VALID);
    }
    /**
     * 批量删除用户通过用户类别和id数组
     * @param userType 用户类型
     * @param ids 用户id数组
     * @return {@link CommonResult}
     */
    @Override
    public CommonResult deleteUserByUserIds(String userType, String[] ids) {
        if (userType == null || "".equals(userType)) return ResultUtil.fail(ResultCode.PARAM_NOT_VALID);
        Integer[] integers = StrUtil.strArrayToIntArray(ids);
        if (integers==null){
            return ResultUtil.fail(ResultCode.PARAM_IS_BLANK);
        }
        if (userType.equals("stu")) {
            for (int sno : integers) {
                studentMapper.deleteBySno(sno);

            }
            return ResultUtil.success();
        } else if (userType.equals("tea")) {
            for (int id : integers) {
                teacherMapper.deleteById(id);
            }
            return ResultUtil.success();
        }

        return ResultUtil.fail(ResultCode.PARAM_NOT_VALID);
    }
    /**
     * 通过用户类别添加用户
     * @param userType 用户类型
     * @param user 用户实体类
     * @return {@link CommonResult}
     */
    @Override
    public CommonResult insertUserByUserTypeAndUser(String userType, Object user) {
        if (userType==null||"".equals(userType)||user==null) return ResultUtil.fail(ResultCode.PARAM_NOT_VALID);

        if (userType.equals("stu")){
            int i = studentMapper.insertOne((Student) user);
            if (i!=1){
                return ResultUtil.fail(ResultCode.COMMON_FAIL);
            }
            return ResultUtil.success();
        }else if (userType.equals("tea")){
            int i = teacherMapper.insertOne((Teacher) user);
            if (i!=1){
                return ResultUtil.fail(ResultCode.COMMON_FAIL);
            }
            return ResultUtil.success();
        }
        return ResultUtil.fail(ResultCode.PARAM_NOT_VALID);
    }
    /**
     * 通过 用户类型 和 csv 文件批量添加用户
     * @param userType 用户类型
     * @param file 用户信息文件
     * @return {@link CommonResult}
     */
    @Override
    public CommonResult insertUserByCsvFile(String userType,MultipartFile file) {
        try {
            InputStream inputStream = file.getInputStream();

        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }


}
