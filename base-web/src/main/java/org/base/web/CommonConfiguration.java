package org.base.web;

import java.io.File;

import org.springframework.boot.context.embedded.ConfigurableEmbeddedServletContainer;
import org.springframework.boot.context.embedded.EmbeddedServletContainerFactory;
import org.springframework.boot.context.embedded.tomcat.TomcatEmbeddedServletContainerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * 解决idea中Spring boot web项目无法访问页面
 */

//@Configuration
public class CommonConfiguration {
//	@Bean  
//    public EmbeddedServletContainerFactory embeddedServletContainerFactory(){  
//        ConfigurableEmbeddedServletContainer factory = new TomcatEmbeddedServletContainerFactory();  
//        factory.setDocumentRoot(new File("D:\\gitProject\\base\\base-web\\src\\main\\webapp"));  
//        return (EmbeddedServletContainerFactory) factory;  
//    }
}
