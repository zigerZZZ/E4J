package org.cuit.ai212.e4j.util.result;

/**
 * @author Pymjl
 * @date 2022/1/21 22:00
 */

public class ResultUtil {
    public static CommonResult success() {
        return new CommonResult(true);
    }

    public static <T> CommonResult<T> success(T data) {
        return new CommonResult(true, data);
    }

    public static CommonResult fail() {
        return new CommonResult(false);
    }

    public static CommonResult fail(ResultCode resultEnum) {
        return new CommonResult(false, resultEnum);
    }
}
