package com.mycompany.app;

import org.apache.commons.io.FileUtils;

/**
 * Hello world!
 */
public class App
{

    private final String message = "Hello World!";

    public App() {}

    public static void main(String[] args) {
        System.out.println(new App().getMessage());
        FileUtils.getUserDirectory();
    }

    private final String getMessage() {
        return message;
    }

}
