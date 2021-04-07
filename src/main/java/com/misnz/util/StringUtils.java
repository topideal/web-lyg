package com.misnz.util;

import java.io.UnsupportedEncodingException;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

public class StringUtils {
    public static String getUUID() {
        UUID uuid = UUID.randomUUID();
        return uuid.toString().toUpperCase().replace("-", "");
    }
    /**
     * 判断传进来的字符串，是否
     * 大于指定的字节，如果大于递归调用
     * 直到小于指定字节数 ，一定要指定字符编码，因为各个系统字符编码都不一样，字节数也不一样
     *
     * @param s   原始字符串
     * @param num 传进来指定字节数
     * @return String 截取后的字符串
     * @throws UnsupportedEncodingException
     */
    public static String getContentLen(String s, int num) throws UnsupportedEncodingException {
        if (s == null || "".equals(s)) {
            return "";
        }
        int changdu = s.getBytes("UTF-8").length;
        if (changdu > num) {
            s = s.substring(0, s.length() - 1);
            s = getContentLen(s, num);
        }
        return s;
    }



    public static String genAuthCode(int authLength) {
        /*String[] beforeShuffle = new String[] { "2", "3", "4", "5", "6", "7",
                "8", "9", "A", "B", "C", "D", "E", "F", "G", "H", "I", "J",
                "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V",
                "W", "X", "Y", "Z" };*/
        String[] beforeShuffle = new String[]{"2", "3", "4", "5", "6", "7",
                "8", "9", "1", "0"};
        List list = Arrays.asList(beforeShuffle);
        Collections.shuffle(list);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            sb.append(list.get(i));
        }
        String afterShuffle = sb.toString();
        return afterShuffle.substring(3, authLength+3);
    }

    public static boolean ListIsNotEmpty(List list) {
        if(list!=null && !list.isEmpty() && list.size()>0){
            return true;
        }
        return false;
    }

}
