package com.kloan.tool;

import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import java.util.List;

/**
 * Author:  AsyncGo
 * Date:    2018/7/18 20:05
 * Description: 字符串工具类
 **/
public class StringTool {

    private static char UNDERLINE = '_';

    public static String formatStr(String format, Object... args) {
        return String.format(format.replaceAll("\\{\\}", "%s"), args);
    }

    public static boolean isEmpty(String test) {
        return test == null || test.isEmpty();
    }

    public static String camelToUnderline(String orig) {
        if (isEmpty(orig)) return orig;

        int len = orig.length();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < len; i++) {
            char c = orig.charAt(i);
            if (i == 0) {
                sb.append(Character.toLowerCase(c));
                continue;
            }

            if (Character.isUpperCase(c)) {
                sb.append(UNDERLINE);
                sb.append(Character.toLowerCase(c));
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    public static String underlineToCamel(String orig) {
        if (isEmpty(orig)) return orig;

        int len = orig.length();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < len; i++) {
            char c = orig.charAt(i);
            if (i == 0) {
                sb.append(Character.toLowerCase(c));
                continue;
            }

            if (c == UNDERLINE) {
                if (++i >= len)
                    break;
                sb.append(Character.toUpperCase(orig.charAt(i)));
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    public static String arrayJoinDelimiter(List arr, String delimiter) {
        if (arr == null || arr.isEmpty()) return "";

        if (arr.size() == 1) return ObjectUtils.nullSafeToString(arr.get(0));

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.size(); ++i) {
            if (i > 0)
                sb.append(delimiter);
            sb.append(arr.get(i));
        }
        return sb.toString();
    }


    /**
     * 通过字段名获取方法名
     * @param prefix
     * @param variableName
     * @return
     */
    public static String getMethodName(String prefix, String variableName) {

        String methodName = variableName.substring(0, 1).toUpperCase() + variableName.substring(1);
        return prefix + methodName;
    }

    public static String exportCsvStr(String str){
        if(StringUtils.isEmpty(str)){
            return "";
        }
        String handleStr=str;
        //先判断字符里是否含有逗号
        if(str.contains(",")){
            //如果还有双引号，先将双引号转义，避免两边加了双引号后转义错误
            if(str.contains("\"")){
                handleStr=str.replace("\"", "\"\"");
            }
            //将逗号转义
            handleStr="\""+handleStr+"\"";
        }
        return handleStr;
    }

}