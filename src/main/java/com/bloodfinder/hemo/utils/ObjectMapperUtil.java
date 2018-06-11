package com.bloodfinder.hemo.utils;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.context.annotation.ComponentScan;

/**
 * @project hemo
 * @authore dgunda on 6/10/18
 */
@ComponentScan
public class ObjectMapperUtil {
    public  static ObjectMapper objectMapper = new ObjectMapper();

    public ObjectMapper getObjectMapper() {
        objectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, true);
        objectMapper.configure(DeserializationFeature.FAIL_ON_NULL_FOR_PRIMITIVES, false);
        return objectMapper;
    }
}
