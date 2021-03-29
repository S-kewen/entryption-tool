package com.cloud.entryptiontool;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @PackageName: com.cloud.entryptiontool
 * @ClassName: DatabaseMain6000
 * @Description: This is DatabaseMain6000 class by Skwen.
 * @Author: Skwen
 * @Date: 2021-03-29 20:10
 */
@SpringBootApplication
@EnableDiscoveryClient
public class DatabaseMain6000 {
    public static void main(String[] args) {
        SpringApplication.run(DatabaseMain6000.class, args);
        System.out.println("DatabaseMain6000-启动完毕!!!");
    }
}
