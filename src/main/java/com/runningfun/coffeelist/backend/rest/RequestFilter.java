package com.runningfun.coffeelist.backend.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerRequestFilter;
import javax.ws.rs.container.ContainerResponseContext;
import javax.ws.rs.container.ContainerResponseFilter;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.ext.Provider;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Set;

/**
 * Created by Stefan on 11.09.2016.
 */
@Provider
public class RequestFilter implements ContainerRequestFilter, ContainerResponseFilter {
    static final Logger logger= LoggerFactory.getLogger(RequestFilter.class);
    @Override
    public void filter(ContainerRequestContext containerRequestContext) throws IOException {
       MultivaluedMap<String, String> headerMap= containerRequestContext.getHeaders();
                                 Set<String> headers= headerMap.keySet();
        for (String header:headers){
                           logger.info("ContainerRequestFilter header {}, value {}",header, headerMap.get(header));
        }
    }

    @Override
    public void filter(ContainerRequestContext containerRequestContext, ContainerResponseContext containerResponseContext) throws IOException {
        MultivaluedMap<String, Object> headerMap= containerResponseContext.getHeaders();
        Set<String> headers= headerMap.keySet();
        for (String header:headers){
            logger.info("ContainerResponseFilter header {}, value {}",header, headerMap.get(header));
        }
        InputStream inputStream=containerRequestContext.getEntityStream();
        byte[] bytes = inputStreamToString(inputStream);
        String body = new String(bytes);

        logger.info("body {} ",body);


    }


    private byte[] inputStreamToString(InputStream is) {
        byte[] bytes = null;
        try {
            bytes = readFromStream(is);
        } catch (IOException ex) {
            logger.error("IOException",ex);
        }
        return bytes;
    }

    private byte[] readFromStream(InputStream stream) throws IOException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        byte[] buffer = new byte[1000];
        int wasRead;
        do {
            wasRead = stream.read(buffer);
            if (wasRead > 0) {
                baos.write(buffer, 0, wasRead);
            }
        } while (wasRead > -1);
        return baos.toByteArray();
    }
}
