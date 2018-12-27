package com.cn.wordonlineediting;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
/**
 * 新建一个SpringBootStartApplication 继承自 SpringBootServletInitializer
 * 作用：因为在外部容器部署的话，就不能依赖于Application的main函数了，
 * 而是要以类似于web.xml文件配置的方式来启动Spring应用上下文，
 * 此时我们需要在启动类中继承SpringBootServletInitializer并实现configure方法，这个类的作用与在web.xml中配置负责初始化Spring应用上下文的监听器作用类似
 * Created by QSJ on 2018/12/10.
 */
@SpringBootApplication
public class WebApplication extends SpringBootServletInitializer {
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        // 设置启动类,用于独立tomcat运行的入口
        return builder.sources(CodeEditingApplication.class);
    }
    /**
     * 内嵌Tomcat使用的Spring boot 程序入口
     */
     public static void main(String[] args) {

         SpringApplication.run(CodeEditingApplication.class,args);

    }
}
