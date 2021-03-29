package com.cloud.entryptiontool.entity;

import lombok.Data;

import java.util.Date;

/**
 * @PackageName: com.cloud.entryptiontool.entity
 * @ClassName: EncryptionRecord
 * @Description: This is EncryptionRecord class by Skwen.
 * @Author: Skwen
 * @Date: 2021-03-29 18:58
 */
@Data
public class EncryptionRecord {
    private Long id;
    private int type;
    private int state;
    private String str;
    private String md5;
    private String doubleMd5;
    private String hash;
    private String sha1;
    private String sha256;
    private Date addTime;
}
