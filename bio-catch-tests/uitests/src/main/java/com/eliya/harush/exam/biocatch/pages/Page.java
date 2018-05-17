package com.eliya.harush.exam.biocatch.pages;

import org.openqa.selenium.chrome.ChromeDriver;

public class Page {

    private static ChromeDriver d;

    public Page() {
    }

    public static ChromeDriver getDriver() {
        return d;
    }

    public Page(ChromeDriver driver) {
        d = driver;

    }
}
