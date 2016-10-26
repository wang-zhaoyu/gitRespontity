package com.wangzhaoyu.dubbo.service;

/**
 * @Author:wanghzoayu
 * @Description:
 * @Date:Create in 2016/10/18 16:32
 * @Modified By:
 */
public interface DubboRedisService {

    public static final long SESSION_USER_EXPIRE_TIME = 30 * 60;

    public void setObj(final String key , final Object obj);

    public <T> T getObj(final String key);
}