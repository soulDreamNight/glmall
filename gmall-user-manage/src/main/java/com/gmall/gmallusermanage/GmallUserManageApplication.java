package com.gmall.gmallusermanage;

import tk.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.gmall.gmallusermanage.mapper")
public class GmallUserManageApplication {

    public static void main(String[] args) {
        SpringApplication.run(GmallUserManageApplication.class, args);
    }

}
