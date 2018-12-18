package com.rao.study.web.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class WebConfig extends WebMvcConfigurerAdapter {
    @Override
    public void configureViewResolvers(ViewResolverRegistry registry) {
        super.configureViewResolvers(registry);
        registry.freeMarker().suffix("/templates/").suffix(".html");//用jsp有点坑,用freamarker和thymeleaf也可以
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        super.addResourceHandlers(registry);
        //第一个方法设置访问路径前缀，第二个方法设置资源路径
        registry.addResourceHandler("/public/**").addResourceLocations("classpath:/public/");
    }
}
