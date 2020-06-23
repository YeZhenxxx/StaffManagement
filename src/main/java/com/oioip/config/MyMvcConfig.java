package com.oioip.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * 自定义mvc配置
 * @author Administrator
 */
@Configuration// 添加该注解后springBoot会自动扫描该配置类 从而生效我们的自定义配置
public class MyMvcConfig implements WebMvcConfigurer {

    /**
     * 添加视图控制
     * @param registry
     */
    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        //添加主页的视图控制
        registry.addViewController("/index").setViewName("index");
        registry.addViewController("/").setViewName("index");
        registry.addViewController("/index.html").setViewName("index");
        //添加后台页面映射
        registry.addViewController("/main").setViewName("dashboard");


    }

    /**
     * //添加拦截器
     * @param registry
     */
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(new LoginHandlerInterceptor()).addPathPatterns("/**").excludePathPatterns("/index.html","//","/user/login","/css/**","/img/**","/js/**");
    }
}
