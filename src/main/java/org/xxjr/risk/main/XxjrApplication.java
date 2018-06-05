package org.xxjr.risk.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"org.xxjr.*"})
public class XxjrApplication {

    public static void main(String[] args) {
        System.out.println("系统启动");
        SpringApplication.run(XxjrApplication.class, args);
    }
}
