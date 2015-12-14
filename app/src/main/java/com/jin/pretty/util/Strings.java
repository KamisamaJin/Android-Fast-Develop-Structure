package com.jin.pretty.util;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class Strings {
    public static boolean isNullOrEmpty(String str) {
        return str == null || str.trim().length() == 0 || "null".equals(str);
    }


    public static String toString(List<String> stringList, boolean oneChar) {
        StringBuilder stringBuilder = new StringBuilder();
        if (stringList == null || stringList.size() == 0) {
            return stringBuilder.toString();
        }
        for (String stringItem : stringList) {
            if (Strings.isNullOrEmpty(stringItem)) {
                continue;
            }
            if (oneChar) {
                stringBuilder.append(stringItem.charAt(0));
            } else {
                stringBuilder.append(stringItem);
            }
        }
        return stringBuilder.toString();
    }

    public static boolean string2Boolean(String s) {
        return "1".equals(s);
    }

    public static String boolean2String(boolean bool) {
        return bool ? "1" : "0";
    }

    public static String subZeroAndDot(String s) {
        if (s.indexOf(".") > 0) {
            s = s.replaceAll("0+?$", "");//去掉多余的0
            s = s.replaceAll("[.]$", "");//如最后一位是.则去掉
        }
        return s;
    }

    public static String replaceBlank(String str) {
        String dest = "";
        if (str != null) {
            Pattern p = Pattern.compile("\\s*|\t|\r|\n");
            Matcher m = p.matcher(str);
            dest = m.replaceAll("");
        }
        return dest;
    }
}
