package com.cloud.entryptiontool.result;

/**
 * @PackageName: com.cloud.entryptiontool.result
 * @ClassName: StatusMsg
 * @Description: This is StatusMsg class by Skwen.
 * @Author: Skwen
 * @Date: 2021-03-29 18:56
 */
public class StatusMsg {
    public static final String OK = "success";//成功
    public static final String NOTFOUND = "the request was not found";//404
    public static final String ERROR = "request error";//失败
    public static final String FALLBACK = "fallback";//服务降级
    public static final String BREAK =  "break";//服务熔断
    public static final String SELECTFAIL = "Sorry, no suitable records were found!";//查找失败
    public static final String TOOLONG = "str too long!";//文本过长
    public static final String INSERTFAIL = "Failed to generate, please try again later!";//生成失败
}
