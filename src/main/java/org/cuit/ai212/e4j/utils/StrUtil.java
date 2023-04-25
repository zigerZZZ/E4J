package org.cuit.ai212.e4j.utils;

/**
 * @description: 字符串处理工具
 * @author: Chenear
 * @time: 2023/4/25 19:46
 */
public class StrUtil {
    /**
     * @param num
     * @return -1 or int(num)
     */
    public static int strToInt(String num) {
        if (num == null) {
            return -1;
        }
        int number = -1;
        try {
            number = Integer.parseInt(num);
        } catch (NumberFormatException e) {
            System.out.println("the str " + num + " to int illegal");
        }
        return number;
    }



}
