package com.itheima.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {
//    把日期转换成字符串
    public static String Data2String(Date data,String patt) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(patt);
        String format = simpleDateFormat.format(data);
        return format;
    }

//把字符串转换成日期
    public static Date String2Date(String str, String patt) throws ParseException {
        SimpleDateFormat sf = new SimpleDateFormat(patt);
        Date parse = sf.parse(str);
        return parse;
    }


}
