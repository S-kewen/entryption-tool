package com.cloud.entryptiontool;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @PackageName: com.cloud.entryptiontool
 * @ClassName: EncryptMain8000
 * @Description: This is EncryptMain8000 class by Skwen.
 * @Author: Skwen
 * @Date: 2021-03-29 16:27
 */
@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
@EnableDiscoveryClient
@EnableFeignClients
public class EncryptMain8000 {
    public static void main(String[] args) {
        SpringApplication.run(EncryptMain8000.class, args);
        System.out.println("EncryptMain8000-启动完毕!!!");
    }
}
