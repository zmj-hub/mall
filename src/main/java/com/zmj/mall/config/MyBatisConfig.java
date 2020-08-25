package com.zmj.mall.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * Mybatis配置类
 * @author zmj
 */
@Configuration
@MapperScan("com.zmj.mall.generate.mapper")
public class MyBatisConfig {
}
