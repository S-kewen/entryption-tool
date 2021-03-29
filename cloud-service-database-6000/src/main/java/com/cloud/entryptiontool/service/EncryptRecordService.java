package com.cloud.entryptiontool.service;

import com.cloud.entryptiontool.entity.EncryptionRecord;

/**
 * @PackageName: com.cloud.entryptiontool.service
 * @ClassName: EncryptRecordService
 * @Description: This is EncryptRecordService interface by Skwen.
 * @Author: Skwen
 * @Date: 2021-03-29 19:06
 */
public interface EncryptRecordService {
    int getCount(EncryptionRecord encryptionRecord);
    EncryptionRecord selectOne(EncryptionRecord encryptionRecord);
    int insertOne(EncryptionRecord encryptionRecord);
}
