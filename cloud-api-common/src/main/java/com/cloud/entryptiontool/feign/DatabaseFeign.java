package com.cloud.entryptiontool.feign;

import com.cloud.entryptiontool.result.MyResult;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @PackageName: com.cloud.entryptiontool.feign
 * @ClassName: DatabaseFeign
 * @Description: This is DatabaseFeign interface by Skwen.
 * @Author: Skwen
 * @Date: 2021-03-29 20:39
 */
@Component
@FeignClient(value = "cloud-service-db")
@RequestMapping("/v1/api/db")
public interface DatabaseFeign {
    @RequestMapping("/getCount")
    MyResult getCount();

    @RequestMapping("/select")
    MyResult select(@RequestParam("str") String str);

    @RequestMapping("/create")
    MyResult create(@RequestParam("str") String str);
}
