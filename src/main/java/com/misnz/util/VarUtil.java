package com.misnz.util;

/**
 * Created by Administrator on 2016/1/29.
 */
public class VarUtil {
    public static String[] PIC_TYPE = new String[]{"JPG", "GIF", "PNG", "JPEG", "BMP", "MP4"};

    //启用
    public static Integer EXIST = 0;
    //禁用
    public static Integer INVALID = 1;

    public final static String SUCCESS = "success";

    public final static String MSG = "msg";


    public final static String DATA = "data";

    public final static String LOGOUT_FLAG = "logoutFlag";

    public static Integer IS_RECOMMEND = 0;//推荐
    public static Integer IS_NOT_RECOMMEND = 1;//非推荐

    public static Integer INFO_TYPE_0 = 0;//0短视频
    public static Integer INFO_TYPE_1 = 1;//1挑战
    public static Integer INFO_TYPE_2 = 2;//2直播回顾
    public static Integer INFO_TYPE_3 = 3;

    public static Integer INFO_MAIN_YES = 0;//主记录
    public static Integer INFO_MAIN_NO = 1;//非主记录
    public static Integer INFO_END_NO = 0;//非结束
    public static Integer INFO_END_YES = 1;//结束


    public static Integer LIVE_STATUS_0 = 0;//预告
    public static Integer LIVE_STATUS_1 = 1;//1:直播中
    public static Integer LIVE_STATUS_3 = 3;//3:转码保存中
    public static Integer LIVE_STATUS_4 = 4;//4:结束

    //是否结束 0:未结束;1:已结束
    public static Integer INFO_IS_NO_END = 0;
    public static Integer INFO_IS_END = 1;
    //反馈类型 0:反馈;1:回复
    public static Integer FEEDBAC_TYPE = 0;
    public static Integer FEEDBAC_TYPE_REPLY = 1;
    public static Integer MAIN_ACTIVITY = -1;
    public static String ENCRYPT_URL_KEY = "%$#@FRtrwe54329gkfd&#%%^(djfrusjw8r44k";//URL加密key


}
