package com.jsdjayanga.java.javaagentsample.application;

import java.util.logging.Logger;

public class Application {
    private static final Logger logger = Logger.getLogger(Application.class.getName());

    public static void main(String[] args) {
        logger.info("Thread Id:" + Thread.currentThread().getId() + ", Thread Name:" + Thread.currentThread().getName());
    }
}
