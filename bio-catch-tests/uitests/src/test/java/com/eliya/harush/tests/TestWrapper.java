package com.eliya.harush.tests;

import com.eliya.harush.exam.biocatch.AbstractTests;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.ITestContext;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class TestWrapper extends AbstractTests {

    private static final Logger logger = LoggerFactory.getLogger(TestWrapper.class);

    @BeforeSuite(alwaysRun = true)
    public void initTestEnvironment(ITestContext ctx) {
        initAutomationFramework();
    }

    @AfterSuite(alwaysRun = true)
    public void closeObjects() {
        chromeDriver.close();
    }
}