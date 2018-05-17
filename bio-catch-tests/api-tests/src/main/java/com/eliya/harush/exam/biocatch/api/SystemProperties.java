package com.eliya.harush.exam.biocatch.api;

public class SystemProperties {

    public static final String biocatchApiServer = System.getProperty("biocatch.api.url", "https://api.bcqa.bc2.customers.biocatch.com");
    public static final String biocatchApiRoot = System.getProperty("biocatch.api.root.url", "/api/v6/");

}
