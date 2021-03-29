package com.cloud.entryptiontool.controller;

import com.cloud.entryptiontool.feign.DatabaseFeign;
import com.cloud.entryptiontool.result.MyResult;
import com.cloud.entryptiontool.result.StatusCode;
import com.cloud.entryptiontool.result.StatusMsg;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

/**
 * @PackageName: com.cloud.entryptiontool.controller
 * @ClassName: DecryptController
 * @Description: This is DecryptController class by Skwen.
 * @Author: Skwen
 * @Date: 2021-03-29 19:12
 */
@RestController
@RefreshScope
@RequestMapping("/v1/api/decrypt")
public class DecryptController {
    @Value("${server.ip}")
    private String ip;
    @Value("${server.port}")
    private String port;
    @Resource
    private DiscoveryClient discoveryClient;
    @Autowired
    private DatabaseFeign databaseFeign;

    @RequestMapping("/port")
    public MyResult port() {
        Map<String, Object> map = new HashMap<>();
        map.put("ip", ip);
        map.put("port", port);
        return new MyResult(StatusCode.OK, StatusMsg.OK, map);
    }

    @RequestMapping("/discovery")
    public MyResult discovery() {
        //服务发现
        return new MyResult(StatusCode.OK, StatusMsg.OK, discoveryClient);
    }

    @RequestMapping("/getCount")
    public MyResult getCount() {
        return databaseFeign.getCount();
    }

    @RequestMapping("/select")
    public MyResult select(String str) {
        return databaseFeign.select(str);
    }
}
