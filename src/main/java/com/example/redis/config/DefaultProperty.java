package com.example.redis.config;

/**
 * @author Elijah
 * @create 2020-05-29 15:13
 */
public class DefaultProperty {
    /**
     * 时间格式
     */
    public static final String dateTimeFormatRegx = "yyyy-MM-dd HH:mm:ss.SSS";
    /**
     * 时区
     */
    public static final String timeZoneString = "GMT";
    /**
     * 分页查询最大分页
     */
    public static final int paginationLimit = 1000;
    /**
     * redis缓存过期时间，单位分钟
     */
    public static final int redisDuration = 5;
}
