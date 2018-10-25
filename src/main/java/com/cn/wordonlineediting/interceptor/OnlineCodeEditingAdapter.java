package com.cn.wordonlineediting.interceptor;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.CacheControl;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;

import java.util.concurrent.TimeUnit;

/**
 * Created by QSJ on 2018/10/25.
 */
@Configuration
public class OnlineCodeEditingAdapter implements WebMvcConfigurer{
    @Bean
    public  WebIntercrptor webIntercrptor(){
        return new WebIntercrptor();
    }

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        //registry.addViewController("/error/error").setViewName("error");
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        // addPathPatterns 添加拦截url;excludePathPatterns 排除拦截url
        registry.addInterceptor(webIntercrptor()).addPathPatterns("/**").excludePathPatterns("/static/**");
    }
    //注入视图处理器bean
    @Bean
    public InternalResourceViewResolver viewResolver(){
        InternalResourceViewResolver resourceViewResolver=new InternalResourceViewResolver();
        resourceViewResolver.setPrefix("/WEB-INF/jsp/");
        resourceViewResolver.setSuffix(".jsp");
        resourceViewResolver.setViewClass(JstlView.class);
        return resourceViewResolver;
    }



    /**
     * 配置静态资源
     */
    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/static/**")
                .addResourceLocations("classpath:/static/")
                .setCacheControl(CacheControl.maxAge(1, TimeUnit.HOURS).cachePublic());
    }

}
