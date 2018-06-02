package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author tzy
 * @version V1.0
 * @Description: @SpringBootApplication:来标注一个主程序类，说明这是一个Spring Boot应用
 */
@SpringBootApplication
public class HelloWorld {
    public static void main(String[] args) {
        //Spring应用启动起来
        SpringApplication.run(HelloWorld.class,args);
    }
}
