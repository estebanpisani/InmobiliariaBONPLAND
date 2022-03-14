package com.IdForIdeas.Inmobiliaria;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class imgConfig implements WebMvcConfigurer {

	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		WebMvcConfigurer.super.addResourceHandlers(registry);
		registry.addResourceHandler("/inmobiliaria-recursos/**").addResourceLocations("file:/D://Proyectos Web//IDforIdeas//inmobiliaria-recursos/");
	}
	

}
