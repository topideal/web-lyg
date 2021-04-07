package com.misnz.framework.cache;

/**
 * Created by david on 2017/8/3.
 */
import java.util.Date;

public class Cache {

    private static java.util.Hashtable<String,Object> __cacheList = new java.util.Hashtable<String,Object>();

    public Cache() {

    }
    //添加cache,不过期
    public synchronized static void add(String key, Object value) {
        Cache.add(key, value, -1);
    }
    //添加cache有过期时间
    public synchronized static void add(String key, Object value, long timeOut) {
        Cache.add(key, value, timeOut, null);
    }
    //添加cache有过期时间并且具有回调方法
    public synchronized static void add(String key, Object value, long timeOut,ICacheMethod callback) {
        if (timeOut > 0) {
            timeOut += new Date().getTime();
        }
        CacheItem item = new CacheItem(key, value, timeOut,callback);
        Cache.__cacheList.put(key, item);
    }
    //获取cache
    public synchronized static Object get(String key) {
        Object obj = Cache.__cacheList.get(key);
        if (obj == null) {
            return null;
        }
        CacheItem item = (CacheItem) obj;
        boolean expired = Cache.cacheExpired(key);
        if (expired == true) // 已过期
        {
            if(item.getCallback()==null)
            {
                Cache.remove(key);
                return null;
            }
            else
            {
                ICacheMethod callback=item.getCallback();
                callback.execute(key);
                expired = Cache.cacheExpired(key);
                if(expired==true)
                {
                    Cache.remove(key);
                    return null;
                }
            }
        }
        return item.getValue();
    }
    //移除cache
    public synchronized static void remove(String key) {
        Object obj = Cache.__cacheList.get(key);
        if (obj != null) {
            obj = null;
        }
        Cache.__cacheList.remove(key);
    }
    //清理所有cache对象
    public synchronized static void clear() {

        for(String s: Cache.__cacheList.keySet())
        {
            Cache.__cacheList.put(s, null);
        }
        Cache.__cacheList.clear();
    }

    //判断是否过期
    private static boolean cacheExpired(String key) {
        CacheItem item = (CacheItem) Cache.__cacheList.get(key);
        if (item == null) {
            return false;
        }
        long milisNow = new Date().getTime();
        long milisExpire = item.getTimeOut();
        if (milisExpire <= 0) { // 不过期
            return false;
        } else if (milisNow >= milisExpire) {
            return true;
        } else {
            return false;
        }
    }
}
