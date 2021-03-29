package com.cloud.entryptiontool.result;

/**
 * @PackageName: com.cloud.entryptiontool.result
 * @ClassName: StatusCode
 * @Description: This is StatusCode class by Skwen.
 * @Author: Skwen
 * @Date: 2021-03-29 18:56
 */
public class StatusCode {
    public static final int OK = 200;//成功
    public static final int NOTFOUND = 404;//404
    public static final int ERROR = 500;//失败
    public static final int FALLBACK = 502;//服务降级
    public static final int BREAK = 503;//服务熔断
    public static final int SELECTFAIL = -1000;//查找失败
    public static final int TOOLONG = -1001;//文本过长
    public static final int INSERTFAIL = -1002;//生成失败
}
