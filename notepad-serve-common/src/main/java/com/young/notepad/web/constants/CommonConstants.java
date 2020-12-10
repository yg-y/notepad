package com.young.notepad.web.constants;

/**
 * @Author:Young
 * @Description
 * @Date: 2019/7/11 0011 17:58
 */
public interface CommonConstants {
    /**
     * 成功标记
     */
    Integer SUCCESS = 1;
    /**
     * 失败标记
     */
    Integer FAIL = 0;
    /**
     * 未登录
     */
    Integer UNLOGIN = 2;
    String UNLOGIN_STR = "unlogin";

    /**
     * 渠道AM
     */
    String AMP = "AMP";

    /**
     * 渠道BD
     */
    String AMPA = "AMPA";

    /**
     * 数据源切換标识
     */
    String MYSQL = "MYSQL";
    String HIVE = "HIVE";

    String BUSINESS = "BUSINESS";
    String PUBLISHER = "PUBLISHER";

    String DEV = "dev";
}
