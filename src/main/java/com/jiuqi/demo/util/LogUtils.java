package com.jiuqi.demo.util;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 本地日志参考类
 *
 *   用法
 *      Logger log = LogUtils.getExceptionLogger();
 *     	Logger log1 = LogUtils.getBussinessLogger();
 *     	Logger log2 = LogUtils.getDBLogger();
 *
 * @author wangyuhang
 *
 */
public class LogUtils {


    /**
     * 获取业务日志logger
     *
     * @return
     */
    public static Logger getBussinessLogger() {
        return LoggerFactory.getLogger(LogEnum.BUSSINESS.getCategory());
    }

    /**
     * 获取平台日志logger
     *
     * @return
     */
    public static Logger getPlatformLogger() {
        return LoggerFactory.getLogger(LogEnum.PLATFORM.getCategory());
    }

    /**
     * 获取数据库日志logger
     *
     * @return
     */
    public static Logger getDBLogger() {
        return LoggerFactory.getLogger(LogEnum.DB.getCategory());
    }


    /**
     * 获取异常日志logger
     *
     * @return
     */
    public static Logger getExceptionLogger() {
        return LoggerFactory.getLogger(LogEnum.EXCEPTION.getCategory());
    }


}
