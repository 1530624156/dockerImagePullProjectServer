package com.mavis.digg;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.mavis.digg.mapper")
public class DockerImagePullProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(DockerImagePullProjectApplication.class, args);
    }

}
