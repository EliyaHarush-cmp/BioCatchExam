package com.eliya.harush.exam.biocatch.api.utilities;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.jayway.restassured.RestAssured;
import com.jayway.restassured.config.ObjectMapperConfig;
import com.jayway.restassured.config.RestAssuredConfig;
import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.mapper.factory.Jackson2ObjectMapperFactory;
import com.jayway.restassured.parsing.Parser;
import com.jayway.restassured.specification.RequestSpecification;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BaseUtils<T> {

    private static final Logger logger = LoggerFactory.getLogger(BaseUtils.class);

    private ObjectMapperConfig mapperConfig() {
        return new ObjectMapperConfig().jackson2ObjectMapperFactory(
                new Jackson2ObjectMapperFactory() {
                    @Override
                    public ObjectMapper create(Class aClass, String s) {
                        return new ObjectMapper()
                                //.enable(JsonGenerator.Feature.WRITE_NUMBERS_AS_STRINGS)
                                .enable(SerializationFeature.WRITE_EMPTY_JSON_ARRAYS)
                                .disable(SerializationFeature.FAIL_ON_EMPTY_BEANS)
                                .disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES)
                                .enable(SerializationFeature.INDENT_OUTPUT)
                                .setSerializationInclusion(JsonInclude.Include.NON_NULL);
                    }
                }
        );
    }

    /**
     * Create basic request specification for RestAssured:
     * a) Set ssl configuration
     * b) Set ContentType -> application/json
     * c) Set urlEncodingEnabled -> false
     * d) Enable logging for validation failure
     * e) Set default RestAssured parser -> JSON
     *
     * @return RequestSpecification
     */
    protected RequestSpecification createBasicRequest() {
        RestAssured.config = RestAssuredConfig.config().objectMapperConfig(mapperConfig());
        RestAssured.defaultParser = Parser.JSON;
        return RestAssured.given().log().all()
                .contentType(ContentType.JSON);
    }
}
