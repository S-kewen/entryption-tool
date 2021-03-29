package com.cloud.entryptiontool.service.impl;

import com.cloud.entryptiontool.dao.EncryptRecordDao;
import com.cloud.entryptiontool.entity.EncryptionRecord;
import com.cloud.entryptiontool.service.EncryptRecordService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @PackageName: com.cloud.entryptiontool.service.impl
 * @ClassName: EncryptRecordServiceImpl
 * @Description: This is EncryptRecordServiceImpl class by Skwen.
 * @Author: Skwen
 * @Date: 2021-03-29 19:05
 */
@Service
public class EncryptRecordServiceServiceImpl implements EncryptRecordService {
    @Autowired
    private EncryptRecordDao dao;
    @Override
    public int getCount(EncryptionRecord encryptionRecord) {
        return dao.getCount(encryptionRecord);
    }

    @Override
    public EncryptionRecord selectOne(EncryptionRecord encryptionRecord) {
        return dao.selectOne(encryptionRecord);
    }

    @Override
    public int insertOne(EncryptionRecord encryptionRecord) {
        return dao.insertOne(encryptionRecord);
    }
}
