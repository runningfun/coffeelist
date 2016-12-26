package com.runningfun.coffeelist.backend.rest;

import io.swagger.jaxrs.config.BeanConfig;
import io.swagger.models.Contact;
import io.swagger.models.Info;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

/**
 * Created by Herschbach.Stefan on 26.12.2016.
 */
@ApplicationPath("/api")
public class RestApplication extends Application{
    static final Logger logger= LoggerFactory.getLogger(RestApplication.class);
    public RestApplication(){
        configureSwagger();
    }

    private void configureSwagger() {
        logger.info("configureSwagger");
        BeanConfig beanConfig = new BeanConfig();
        beanConfig.setDescription("Coffee list Api");
        Info info = new Info();
        Contact contact= new Contact();
        contact.setEmail("stefan.herschbach@gmail.com");
        contact.setName("Stefan Herschbach");
        info.setContact(contact);
        info.setTitle("Coffee list Api");

        beanConfig.setInfo(info);
        beanConfig.setBasePath("/api");
        beanConfig.setResourcePackage(RestApplication.class.getPackage().getName());
        beanConfig.setPrettyPrint(true);
        beanConfig.setScan();
    }
}
