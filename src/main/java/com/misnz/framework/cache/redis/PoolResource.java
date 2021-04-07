package com.misnz.framework.cache.redis;


import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

public class PoolResource {

    private static String ADDRESS = "120.26.123.204";
    private static int PORT = 6379;
    private static String PASSWORD = "redis@2017";
    // 可用连接最大数目
    // -1 表示不限制
    private static int MAX_ACTIVE = 1024;
    // 控制一个pool最多有多少个空闲的jedis实例，默认是8
    private static int MAX_JEDIS = 200;

    // 等待的可用连接的最大时间，单位毫秒，默认值为-1,表示永不超时，如果等待超时时间
    // 则抛出JedisConnectionException
    // redis.clients.jedis.exceptions.JedisConnectionException: Could not get a
    // resource from the pool
    private static int MAX_WAIT = 10000;
    private static int TIMROUT = 10000;

    // 在borrow一个jedis实例时，是否提前进行validate操作：true ，得到的jedis实例是可用的；
    private static boolean TEST_ON_BORROW = true;
    private static JedisPool jedisPool = null;

    /**
     * 初始化连接池
     */
    static {
        JedisPoolConfig config = new JedisPoolConfig();
        //设置最大的连接数目，注意版本不同方法会有不同
        config.setMaxTotal(MAX_ACTIVE);
        config.setMaxIdle(MAX_JEDIS);
        config.setMaxWaitMillis(MAX_WAIT);
        config.setTestOnBorrow(TEST_ON_BORROW);
        jedisPool = new JedisPool(config, ADDRESS, PORT, TIMROUT, PASSWORD);
    }

    /**
     * 获取Jedis实例
     *
     * @return
     */
    // synchronized是Java中的关键字，是一种同步锁。它修饰的对象有以下几种：
    // 1. 修饰一个代码块，被修饰的代码块称为同步语句块，其作用的范围是大括号{}括起来的代码，作用的对象是调用这个代码块的对象；
    // 2. 修饰一个方法，被修饰的方法称为同步方法，其作用的范围是整个方法，作用的对象是调用这个方法的对象；
    // 3. 修改一个静态的方法，其作用的范围是整个静态方法，作用的对象是这个类的所有对象；
    // 4. 修改一个类，其作用的范围是synchronized后面括号括起来的部分，作用主的对象是这个类的所有对象。
    // 当两个并发线程访问同一个对象object中的这个synchronized(this)同步代码块时，一个时间内只能有一个线程得到执行。另一个线程必须等待当前线程执行完这个代码块以后才能执行该代码块。
    public synchronized static Jedis getJedis() {
        try {
            if (jedisPool != null) {
                Jedis resource = jedisPool.getResource();
                return resource;
            } else {
                return null;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    /**
     * 释放jedis资源
     *
     * @param jedis
     */
    public static void returnResource(final Jedis jedis) {
        // if (jedis != null) {
        // jedisPool.returnResource(jedis);
        // }
        if (jedis != null) {
            jedis.close();
        }
    }


}