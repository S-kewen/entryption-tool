package com.cloud.entryptiontool;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @PackageName: com.cloud.entryptiontool
 * @ClassName: DecryptMain8100
 * @Description: This is DecryptMain8100 class by Skwen.
 * @Author: Skwen
 * @Date: 2021-03-29 16:27
 */
@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
@EnableDiscoveryClient
@EnableFeignClients
public class DecryptMain8100 {
    public static void main(String[] args) {
        SpringApplication.run(DecryptMain8100.class, args);
        System.out.println("DecryptMain8100-启动完毕!!!");
    }
}
