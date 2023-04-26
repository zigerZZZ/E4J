package org.cuit.ai212.e4j.utils;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

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

    public static Integer[] strArrayToIntArray(String[] array){
        if (array==null){
            return null;
        }
        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            if (strToInt(array[i])!=-1){
                result.add(strToInt(array[i]));
            }
        }
        Integer[] a = {};
        return result.toArray(a);
    }


}
