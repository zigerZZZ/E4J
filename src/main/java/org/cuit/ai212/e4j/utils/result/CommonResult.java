package org.cuit.ai212.e4j.utils.result;


import java.io.Serializable;

/**
 * @author Pymjl
 * @date 2022/1/21 22:00
 */
public class CommonResult<T> implements Serializable {
    private Boolean succeed;
    private Integer code;
    private String message;
    private T data;

    public CommonResult() {
    }

    public CommonResult(boolean succeed) {
        this.succeed = succeed;
        this.code = succeed ? ResultCode.SUCCESS.getCode() : ResultCode.COMMON_FAIL.getCode();
        this.message = succeed ? ResultCode.SUCCESS.getMessage() : ResultCode.COMMON_FAIL.getMessage();
    }

    public CommonResult(boolean succeed, ResultCode resultEnum) {
        this.succeed = succeed;
        this.code = succeed ? ResultCode.SUCCESS.getCode() : (resultEnum == null ? ResultCode.COMMON_FAIL.getCode() : resultEnum.getCode());
        this.message = succeed ? ResultCode.SUCCESS.getMessage() : (resultEnum == null ? ResultCode.COMMON_FAIL.getMessage() : resultEnum.getMessage());
    }

    public CommonResult(boolean succeed, T data) {
        this.succeed = succeed;
        this.code = succeed ? ResultCode.SUCCESS.getCode() : ResultCode.COMMON_FAIL.getCode();
        this.message = succeed ? ResultCode.SUCCESS.getMessage() : ResultCode.COMMON_FAIL.getMessage();
        this.data = data;
    }

    public CommonResult(boolean succeed, ResultCode resultEnum, T data) {
        this.succeed = succeed;
        this.code = succeed ? ResultCode.SUCCESS.getCode() : (resultEnum == null ? ResultCode.COMMON_FAIL.getCode() : resultEnum.getCode());
        this.message = succeed ? ResultCode.SUCCESS.getMessage() : (resultEnum == null ? ResultCode.COMMON_FAIL.getMessage() : resultEnum.getMessage());
        this.data = data;
    }

    public Boolean getSucceed() {
        return succeed;
    }

    public void setSucceed(Boolean succeed) {
        this.succeed = succeed;
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "CommonResult{" +
                "succeed=" + succeed +
                ", code=" + code +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}';
    }
}

