package com.demo.dynamic;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan({"com.demo.dynamic.test.mapper", "com.demo.dynamic.test2.mapper"})
public class DynamicDsDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DynamicDsDemoApplication.class, args);
    }

}
