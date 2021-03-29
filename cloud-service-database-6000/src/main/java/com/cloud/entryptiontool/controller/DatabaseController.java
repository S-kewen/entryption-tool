package com.cloud.entryptiontool.controller;

import cn.hutool.crypto.SecureUtil;
import com.cloud.entryptiontool.entity.EncryptionRecord;
import com.cloud.entryptiontool.result.MyResult;
import com.cloud.entryptiontool.result.StatusCode;
import com.cloud.entryptiontool.result.StatusMsg;
import com.cloud.entryptiontool.service.EncryptRecordService;
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
 * @ClassName: DatabaseController
 * @Description: This is DatabaseController class by Skwen.
 * @Author: Skwen
 * @Date: 2021-03-29 20:12
 */
@RestController
@RefreshScope
@RequestMapping("/v1/api/db")
public class DatabaseController {
    @Value("${server.ip}")
    private String ip;
    @Value("${server.port}")
    private String port;
    @Resource
    private DiscoveryClient discoveryClient;

    @Autowired
    private EncryptRecordService encryptRecordService;

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
        return new MyResult(StatusCode.OK, StatusMsg.OK, encryptRecordService.getCount(new EncryptionRecord()));
    }

    @RequestMapping("/select")
    public MyResult select(String str) {
        EncryptionRecord encryptionRecord = new EncryptionRecord();
        encryptionRecord.setStr(str);
        encryptionRecord = encryptRecordService.selectOne(encryptionRecord);
        if (encryptionRecord != null) {
            return new MyResult(StatusCode.OK, StatusMsg.OK, encryptionRecord);
        }
        return new MyResult(StatusCode.SELECTFAIL, StatusMsg.SELECTFAIL);
    }

    @RequestMapping("/create")
    public MyResult create(String str) {
        if (str.length() > 100) {
            return new MyResult(StatusCode.TOOLONG, StatusMsg.TOOLONG);
        }
        EncryptionRecord encryptionRecord = new EncryptionRecord();
        encryptionRecord.setStr(str);
        encryptionRecord = encryptRecordService.selectOne(encryptionRecord);
        if (encryptionRecord != null) {
            return new MyResult(StatusCode.OK, StatusMsg.OK, encryptionRecord);
        }
        encryptionRecord = new EncryptionRecord();
        encryptionRecord.setType(1);
        encryptionRecord.setState(1);
        encryptionRecord.setStr(str);
        encryptionRecord.setMd5(SecureUtil.md5(str));
        encryptionRecord.setDoubleMd5(SecureUtil.md5(encryptionRecord.getMd5()));
        encryptionRecord.setHash(String.valueOf(str.hashCode()));
        encryptionRecord.setSha1(SecureUtil.sha1(str));
        encryptionRecord.setSha256(SecureUtil.sha256(str));
        int count = encryptRecordService.insertOne(encryptionRecord);
        if (count > 0) {
            return new MyResult(StatusCode.OK, StatusMsg.OK, encryptionRecord);
        }
        return new MyResult(StatusCode.INSERTFAIL, StatusMsg.INSERTFAIL);
    }
}
