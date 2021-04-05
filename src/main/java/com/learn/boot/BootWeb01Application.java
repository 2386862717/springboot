package com.learn.boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class BootWeb01Application {

    public static void main(String[] args) {
        //返回IOC容器
        ConfigurableApplicationContext run = SpringApplication.run(BootWeb01Application.class, args);

        //查看容器里的组件
        String[] names = run.getBeanDefinitionNames();
        for (String name : names) {
            System.out.println(name);
        }

    }

}
