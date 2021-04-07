package com.misnz.util;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * Created by Administrator on 2016/3/31.
 */
public class DateUtils {
    static SimpleDateFormat sdfLong = new SimpleDateFormat("yyyy-MM-dd");

    public static long getCurrentDataByShort() {
        return System.currentTimeMillis() / 1000;
    }

    public static Date transferLongToDate(Long millSec) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        return sdf.parse(sdf.format(new Date(millSec)));
    }
    public static String transferLongDateToStr(Long millSec) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        return sdf.format(new Date(millSec));
    }

    public static long getMillisBySecond(Integer sec) {
        return sec*60*1000;
    }


    /**
     * 获取当前日期为日期型
     *
     * @return 当前日期，java.util.Date类型
     */
    public static Date getCurrentDate() {
        Calendar cal = Calendar.getInstance();

        //String currentDate = null;
        Date d = cal.getTime();

        return d;
    }

    public static String getDateStr(Date date)
    {

        String datestr = sdfLong.format(date);
        return datestr;
    }

    public static Date getDateFromString(String strDate) {

        try {
            return sdfLong.parse(strDate);
        } catch (Exception ex) {
            return new Date(System.currentTimeMillis());
        }
    }
}
