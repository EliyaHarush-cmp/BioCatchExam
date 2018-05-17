package com.eliya.harush.exam.biocatch.utilities;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BaseUtils {

    protected final Logger logger = LoggerFactory.getLogger(this.getClass());

    public BaseUtils () {}

    public int getIntegerFromString(String price) {
        try {
            return Integer.parseInt(price.replaceAll("[0-9]", ""));
        } catch (Exception e) {
            logger.error("Error in parsing string: '" + price + "' to double.");
            return -999;
        }
    }

    public Double getDoubleFromString(String price) {
        try {
            return Double.parseDouble(price.replaceAll("[^\\.0123456789]", ""));
        } catch (Exception e) {
            logger.error("Error in parsing string: '" + price + "' to double.");
            return -999.999;
        }
    }
}