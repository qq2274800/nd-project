package com.fangyr;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.fangyr.dao.mapper")
public class NdWebApplication {

    public static void main(String[] args) {
        SpringApplication.run(NdWebApplication.class, args);
    }

}
