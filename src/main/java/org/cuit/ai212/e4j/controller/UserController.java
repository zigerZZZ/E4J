package org.cuit.ai212.e4j.controller;



import org.cuit.ai212.e4j.domain.Student;
import org.cuit.ai212.e4j.domain.Teacher;
import org.cuit.ai212.e4j.service.UserService;
import org.cuit.ai212.e4j.utils.result.CommonResult;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;

/**
 * @description: 用户管理控制器
 * @author: Chenear
 * @time: 2023/4/24 21:24
 */
@RestController
@Secured(value = {"ROLE_adm"})   //该控制器必须有adm角色才可以访问
@RequestMapping(value = "/user")
public class UserController {

    @Resource
    private UserService userService;
    /**
     * 获取所有教师用户
     * @param page 页号
     * @param size 页面用户个数
     * @return {@link CommonResult}
     */
    @GetMapping(value = "/tea")
    public CommonResult getAllTea(@RequestParam(value = "page",required = false)String page, @RequestParam(value = "size",required = false) String size){
        return userService.getAllUserByUserType("tea",page,size);
    }
    /**
     * 获取所有学生用户并制定页号和大小
     * @param page 页号
     * @param size 页面用户个数
     * @return {@link CommonResult}
     */
    @GetMapping(value = "/stu")
    public CommonResult getAllStu(@RequestParam(value = "page",required = false)String page,@RequestParam(value = "size",required = false)String  size){
        return userService.getAllUserByUserType("stu",page,size);
    }
    /**
     * 获取教师用户通过姓名
     * @param name 姓名
     * @return {@link CommonResult}
     */
    @GetMapping(value = "/tea/{name}")
    public CommonResult getTeaByName(@PathVariable String name){
        return userService.getUserByUserTypeAndUsername("tea",name);
    }
    /**
     * 获取学生姓名通过姓名
     * @param name 学生姓名
     * @return {@link CommonResult}
     */
    @GetMapping(value = "/stu/{name}")
    public CommonResult getStuByName(@PathVariable String name){
        return userService.getUserByUserTypeAndUsername("stu",name);
    }
    /**
     * 添加老师通过老师实体类（单个添加）和老师信息文件（批量添加）
     * @param teacher 老师实体类
     * @param file 老师信息文件
     * @return {@link CommonResult}
     */
    @PutMapping(value = "/tea")
    public CommonResult insertTeachers(@RequestBody(required = false) Teacher teacher,@RequestParam(required = false) MultipartFile file){
        if (file==null){
            return userService.insertUserByUserTypeAndUser("tea",teacher);
        }else {
            return userService.insertUserByCsvFile("tea",file);
        }
    }
    /**
     * 添加学生通过学生实体类（单个添加）和学生信息文件（批量添加）
     * @param student 学生实体类
     * @param file 学生信息文件
     * @return {@link CommonResult}
     */
    @PutMapping(value = "/stu")
    public CommonResult insertStudents(@RequestBody(required = false) Student student,@RequestParam(required = false) MultipartFile file){
        if (file==null){
            return userService.insertUserByUserTypeAndUser("stu",student);
        }else {
            return userService.insertUserByCsvFile("stu",file);
        }
    }
    /**
     * 更新老师信息通过老师实体类
     * @param teacher 老师实体类
     * @return {@link CommonResult}
     */
    @PostMapping(value = "/tea")
    public CommonResult updateTeacher(@RequestBody Teacher teacher){
        return userService.updateUserByUserTypeAndUserId("tea",teacher);
    }
    /**
     * 更新学生信息通过学生实体类
     * @param student 学生实体类
     * @return {@link CommonResult}
     */
    @PostMapping(value = "/stu")
    public CommonResult updateStudent(@RequestBody Student student){
        return userService.updateUserByUserTypeAndUserId("stu",student);
    }
    /**
     * 删除老师通过老师id数组
     * @param ids 老师id数组
     * @return {@link CommonResult}
     */
    @DeleteMapping(value = "/tea")
    public CommonResult deleteTeacherByIds(@RequestParam String[] ids){
        return userService.deleteUserByUserIds("tea",ids);
    }
    /**
     * 删除学生通过学生id数组
     * @param ids 学生id数组
     * @return {@link CommonResult}
     */
    @DeleteMapping(value = "/stu")
    public CommonResult deleteStudentByIds(@RequestParam String[] ids){
        return userService.deleteUserByUserIds("stu",ids);
    }


}
