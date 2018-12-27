package com.cn.wordonlineediting.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

/**
 * 部署nginx时发现访问不了swager-ui.html
 * Created by QSJ on 2018/12/12.
 */
@Configuration
public class InterceptorConfigurerAdapter extends WebMvcConfigurerAdapter {
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/**")
        .addResourceLocations("classpath:/META-INF/resources/")
        .setCachePeriod(0);
    }
}
