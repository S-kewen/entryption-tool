package com.cloud.entryptiontool.dao;

import com.cloud.entryptiontool.entity.EncryptionRecord;
import org.apache.ibatis.annotations.Mapper;

/**
 * @PackageName: com.cloud.entryptiontool.dao
 * @ClassName: EncryptRecordDao
 * @Description: This is EncryptRecordDao interface by Skwen.
 * @Author: Skwen
 * @Date: 2021-03-29 19:09
 */
@Mapper
public interface EncryptRecordDao {
    int getCount(EncryptionRecord encryptionRecord);
    EncryptionRecord selectOne(EncryptionRecord encryptionRecord);
    int insertOne(EncryptionRecord encryptionRecord);
}
