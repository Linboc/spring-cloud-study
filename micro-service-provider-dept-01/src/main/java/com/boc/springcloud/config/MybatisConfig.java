package com.boc.springcloud.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@MapperScan(value = {"com.boc.springcloud.mapper"})
public class MybatisConfig {

}
