package com.zmj.mall;

import com.alibaba.nacos.api.config.annotation.NacosValue;
import com.alibaba.nacos.spring.context.annotation.config.NacosPropertySource;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import static org.springframework.web.bind.annotation.RequestMethod.GET;

@NacosPropertySource(dataId ="mall", autoRefreshed = true)
@EnableDiscoveryClient
@SpringBootApplication
public class MallApplication {

    public static void main(String[] args) {
        SpringApplication.run(MallApplication.class, args);
    }

    @NacosValue(value = "${zmj}", autoRefreshed = true)
    private String serverName;

    @RequestMapping(value = "/test", method = GET)
    @ResponseBody
    public String get() {
        return serverName;
    }
}
