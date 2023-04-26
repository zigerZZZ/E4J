package org.cuit.ai212.e4j.service;

import org.cuit.ai212.e4j.utils.result.CommonResult;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;


public interface UserService {
    public CommonResult getAllUserByUserType(String userType, String page, String size);

    public CommonResult getUserByUserTypeAndUsername(String userType,String username);

    public CommonResult updateUserByUserTypeAndUserId(String userType,Object user);

    public CommonResult deleteUserByUserIds(String userType,String[] ids);

    public CommonResult insertUserByUserTypeAndUser(String userType,Object user);

    public CommonResult insertUserByCsvFile(String userType,MultipartFile file);
}
